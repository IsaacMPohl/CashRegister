import UIKit

class CashRegisterViewController: UIViewController {

    // UI Elements
    let tableView = UITableView()
    let totalLabel = UILabel()
    let cashGivenTextField = UITextField()
    let calculateButton = UIButton()
    let changeLabel = UILabel()

    var items: [(name: String, price: Double, quantity: Int)] = [
        ("Item 1", 5.00, 2),
        ("Item 2", 10.00, 1)
        // Add more items as needed
    ]

    override func viewDidLoad() {
        super.viewDidLoad()

        view.backgroundColor = UIColor(red: 0.97, green: 0.97, blue: 0.97, alpha: 1.0)

        tableView.dataSource = self
        tableView.register(ItemTableViewCell.self, forCellReuseIdentifier: "ItemCell")

        setupUI()
        setupConstraints()
    }

    func setupUI() {
        title = "Cash Register"

        tableView.translatesAutoresizingMaskIntoConstraints = false
        view.addSubview(tableView)

        totalLabel.translatesAutoresizingMaskIntoConstraints = false
        totalLabel.textAlignment = .right
        totalLabel.text = "Total: $0.00"
        view.addSubview(totalLabel)

        cashGivenTextField.translatesAutoresizingMaskIntoConstraints = false
        cashGivenTextField.placeholder = "Cash Given"
        cashGivenTextField.keyboardType = .decimalPad
        view.addSubview(cashGivenTextField)

        calculateButton.translatesAutoresizingMaskIntoConstraints = false
        calculateButton.backgroundColor = UIColor.blue
        calculateButton.setTitle("Calculate Change", for: .normal)
        calculateButton.addTarget(self, action: #selector(calculateChange), for: .touchUpInside)
        view.addSubview(calculateButton)

        changeLabel.translatesAutoresizingMaskIntoConstraints = false
        changeLabel.textAlignment = .right
        changeLabel.text = "Change: $0.00"
        view.addSubview(changeLabel)
    }

    func setupConstraints() {
        NSLayoutConstraint.activate([
            tableView.topAnchor.constraint(equalTo: view.safeAreaLayoutGuide.topAnchor, constant: 20),
            tableView.leadingAnchor.constraint(equalTo: view.leadingAnchor, constant: 20),
            tableView.trailingAnchor.constraint(equalTo: view.trailingAnchor, constant: -20),
            tableView.heightAnchor.constraint(equalToConstant: 120),

            totalLabel.trailingAnchor.constraint(equalTo: tableView.trailingAnchor),
            totalLabel.topAnchor.constraint(equalTo: tableView.bottomAnchor, constant: 10),

            cashGivenTextField.topAnchor.constraint(equalTo: totalLabel.bottomAnchor, constant: 20),
            cashGivenTextField.leadingAnchor.constraint(equalTo: view.leadingAnchor, constant: 20),
            cashGivenTextField.widthAnchor.constraint(equalToConstant: 120),

            calculateButton.topAnchor.constraint(equalTo: cashGivenTextField.topAnchor),
            calculateButton.leadingAnchor.constraint(equalTo: cashGivenTextField.trailingAnchor, constant: 10),

            changeLabel.topAnchor.constraint(equalTo: cashGivenTextField.bottomAnchor, constant: 20),
            changeLabel.trailingAnchor.constraint(equalTo: view.trailingAnchor, constant: -20)
        ])
    }

    @objc func calculateChange() {
        var total: Double = 0.0

        for item in items {
            total += item.price * Double(item.quantity)
        }

        totalLabel.text = String(format: "Total: $%.2f", total)

        if let cashGivenText = cashGivenTextField.text, let cashGiven = Double(cashGivenText) {
            let change = cashGiven - total
            changeLabel.text = String(format: "Change: $%.2f", change)
        }
    }
}

extension CashRegisterViewController: UITableViewDataSource {
    func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return items.count
    }

    func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cell = tableView.dequeueReusableCell(withIdentifier: "ItemCell", for: indexPath) as! ItemTableViewCell
        let item = items[indexPath.row]
        cell.itemNameLabel.text = item.name
        cell.priceLabel.text = String(format: "$%.2f", item.price)
        cell.quantityStepper.value = Double(item.quantity)
        cell.delegate = self
        return cell
    }
}

extension CashRegisterViewController: ItemTableViewCellDelegate {
    func quantityDidChange(_ cell: ItemTableViewCell, value: Double) {
        if let indexPath = tableView.indexPath(for: cell) {
            items[indexPath.row].quantity = Int(value)
            calculateChange()
        }
    }
}

protocol ItemTableViewCellDelegate: AnyObject {
    func quantityDidChange(_ cell: ItemTableViewCell, value: Double)
}

class ItemTableViewCell: UITableViewCell {

    weak var delegate: ItemTableViewCellDelegate?

    let itemNameLabel = UILabel()
    let priceLabel = UILabel()
    let quantityStepper = UIStepper()

    override init(style: UITableViewCell.CellStyle, reuseIdentifier: String?) {
        super.init(style: style, reuseIdentifier: reuseIdentifier)

        itemNameLabel.translatesAutoresizingMaskIntoConstraints = false
        contentView.addSubview(itemNameLabel)

        priceLabel.translatesAutoresizingMaskIntoConstraints = false
        contentView.addSubview(priceLabel)

        quantityStepper.translatesAutoresizingMaskIntoConstraints = false
        quantityStepper.addTarget(self, action: #selector(quantityStepperValueChanged), for: .valueChanged)
        contentView.addSubview(quantityStepper)

        setupConstraints()
    }

    required init?(coder: NSCoder) {
        fatalError("init(coder:) has not been implemented")
    }

    func setupConstraints() {
        NSLayoutConstraint.activate([
            itemNameLabel.leadingAnchor.constraint(equalTo: contentView.leadingAnchor, constant: 20),
            itemNameLabel.centerYAnchor.constraint(equalTo: contentView.centerYAnchor),

            priceLabel.trailingAnchor.constraint(equalTo: contentView.trailingAnchor, constant: -20),
            priceLabel.centerYAnchor.constraint(equalTo: contentView.centerYAnchor),

            quantityStepper.trailingAnchor.constraint(equalTo: priceLabel.leadingAnchor, constant: -10),
            quantityStepper.centerYAnchor.constraint(equalTo: contentView.centerYAnchor)
        ])
    }

    @objc func quantityStepperValueChanged() {
        delegate?.quantityDidChange(self, value: quantityStepper.value)
    }
}

import UIKit

@UIApplicationMain
class AppDelegate: UIResponder, UIApplicationDelegate {

    var window: UIWindow?

    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?) -> Bool {
        window = UIWindow(frame: UIScreen.main.bounds)
        window?.rootViewController = UINavigationController(rootViewController: CashRegisterViewController())
        window?.makeKeyAndVisible()
        return true
    }
}
