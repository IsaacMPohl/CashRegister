package com.example.test123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int onTrayIncr = 0;
    int mainTrayIncr =0;
    int rollItemIncr = 0;
    int desertItemIncr = 0;
    int cookieItemIncr = 0 ;
    int soupItemIncr = 0;
    double total = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mealItemDisTXT = findViewById(R.id.textView3);
        TextView onTrayItemDisTXT = findViewById(R.id.textView4);
        TextView rollitemDisTxt = findViewById(R.id.textView5);
        TextView desertItemDisTxT = findViewById(R.id.textView6);
        TextView cookieItemDisTxT = findViewById(R.id.textView14);
        TextView soupItemDisTXT = findViewById(R.id.textView21);
        TextView totalPriceDisTXT = findViewById(R.id.textView2);
        TextView disChangeBackTXT = findViewById(R.id.textView7);
        EditText amountGivenTXT = findViewById(R.id.editTextText);



        Button mainAddBTN = findViewById(R.id.button13);
        Button mainDelBTN = findViewById(R.id.button14);
        Button onTrayAddBTN = findViewById(R.id.button24);
        Button onTrayDelBTN = findViewById(R.id.button25);
        Button rollItemAddBTN = findViewById(R.id.button28);
        Button rollItemDelBTN = findViewById(R.id.button29);
        Button desertItemAddBTN = findViewById(R.id.button26);
        Button desertItemDelBTN = findViewById(R.id.button27);
        Button cookieItemAddBTN = findViewById(R.id.button3);
        Button cookieItemDelBTN = findViewById(R.id.button4);
        Button soupItemAddBTN = findViewById(R.id.button2);
        Button soupItemDelBTN = findViewById(R.id.button5);
        Button resetBTN = findViewById(R.id.button);
        Button calcBTN = findViewById(R.id.button6);
        LinearLayout outPutCostLayout = findViewById(R.id.outPutCostLayout);
        LinearLayout newOrderLayout = findViewById(R.id.newOrderLayout);
        LinearLayout inputLayout = findViewById(R.id.inputLayout);
        LinearLayout fieldDisplayLayout = findViewById(R.id.fieldDisplayLayout);
        LinearLayout buttonLayout = findViewById(R.id.buttonLayout);


        outPutCostLayout.setVisibility((View.GONE));
        newOrderLayout.setVisibility((View.GONE));
        resetBTN.setVisibility((View.GONE));

        inputLayout.setVisibility((View.VISIBLE));
        fieldDisplayLayout.setVisibility((View.VISIBLE));
        buttonLayout.setVisibility((View.VISIBLE));






        mainAddBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mainTrayIncr++;
                //outputTXT.setText(entree);
                mealItemDisTXT.setText(Integer.toString(mainTrayIncr));
                total+=8;
                totalPriceDisTXT.setText("$"+Double.toString(total));


            }
        });
        mainDelBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mainTrayIncr--;
                //outputTXT.setText(entree);
                mealItemDisTXT.setText(Integer.toString(mainTrayIncr));
                total-=8;
                totalPriceDisTXT.setText("$"+Double.toString(total));


            }
        });
        onTrayAddBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                onTrayIncr++;
                //outputTXT.setText(entree);
                onTrayItemDisTXT.setText(Integer.toString(onTrayIncr));
                total+=5;
                totalPriceDisTXT.setText("$"+Double.toString(total));


            }
        });
        onTrayDelBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                onTrayIncr--;
                //outputTXT.setText(entree);
                onTrayItemDisTXT.setText(Integer.toString(onTrayIncr));
                total-=5;
                totalPriceDisTXT.setText("$"+Double.toString(total));


            }
        });
        rollItemAddBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                rollItemIncr++;
                //outputTXT.setText(entree);
                rollitemDisTxt.setText(Integer.toString(rollItemIncr));
                total+=.5;
                totalPriceDisTXT.setText("$"+Double.toString(total));


            }
        });
        rollItemDelBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                rollItemIncr--;
                //outputTXT.setText(entree);
                rollitemDisTxt.setText(Integer.toString(rollItemIncr));
                total-=.5;
                totalPriceDisTXT.setText("$"+Double.toString(total));


            }
        });
        desertItemAddBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                desertItemIncr++;
                //outputTXT.setText(entree);
                desertItemDisTxT.setText(Integer.toString(desertItemIncr));
                total+=2;
                totalPriceDisTXT.setText("$"+Double.toString(total));


            }
        });
        desertItemDelBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                desertItemIncr--;
                //outputTXT.setText(entree);
                desertItemDisTxT.setText(Integer.toString(desertItemIncr));
                total-=2;
                totalPriceDisTXT.setText("$"+Double.toString(total));


            }
        });
        cookieItemAddBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                cookieItemIncr++;
                //outputTXT.setText(entree);
                cookieItemDisTxT.setText(Integer.toString(cookieItemIncr));
                total+=1;
                totalPriceDisTXT.setText("$"+Double.toString(total));


            }
        });
        cookieItemDelBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                cookieItemIncr--;
                //outputTXT.setText(entree);
                cookieItemDisTxT.setText(Integer.toString(cookieItemIncr));
                total-=1;
                totalPriceDisTXT.setText("$"+Double.toString(total));


            }
        });
        soupItemAddBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                soupItemIncr++;
                //outputTXT.setText(entree);
                soupItemDisTXT.setText(Integer.toString(soupItemIncr));
                total+=3;
                totalPriceDisTXT.setText("$"+Double.toString(total));


            }
        });
        soupItemDelBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                soupItemIncr--;
                //outputTXT.setText(entree);
                soupItemDisTXT.setText(Integer.toString(soupItemIncr));
                total-=3;
                totalPriceDisTXT.setText("$"+Double.toString(total));


            }
        });
        resetBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                onTrayIncr = 0;
                total = 0;
                rollItemIncr = 0;
                soupItemIncr = 0;
                mainTrayIncr = 0;
                desertItemIncr = 0;
                cookieItemIncr = 0;
                totalPriceDisTXT.setText("$"+Double.toString(total));
                soupItemDisTXT.setText(Integer.toString(soupItemIncr));
                disChangeBackTXT.setText("$0.00");
                cookieItemDisTxT.setText(Integer.toString(cookieItemIncr));
                desertItemDisTxT.setText(Integer.toString(desertItemIncr));
                rollitemDisTxt.setText(Integer.toString(rollItemIncr));
                onTrayItemDisTXT.setText(Integer.toString(onTrayIncr));
                mealItemDisTXT.setText(Integer.toString(mainTrayIncr));
                amountGivenTXT.setText("0");
                outPutCostLayout.setVisibility((View.GONE));
                newOrderLayout.setVisibility((View.GONE));
                resetBTN.setVisibility((View.GONE));

                inputLayout.setVisibility((View.VISIBLE));
                fieldDisplayLayout.setVisibility((View.VISIBLE));
                buttonLayout.setVisibility((View.VISIBLE));






            }
        });
        calcBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                double num1 = Double.parseDouble(amountGivenTXT.getText().toString());
                //outputTXT.setText(entree);

                disChangeBackTXT.setText("$"+Double.toString(num1-total));
                outPutCostLayout.setVisibility((View.VISIBLE));
                newOrderLayout.setVisibility((View.VISIBLE));
                resetBTN.setVisibility((View.VISIBLE));

                inputLayout.setVisibility((View.VISIBLE));
                fieldDisplayLayout.setVisibility((View.VISIBLE));
                buttonLayout.setVisibility((View.GONE));

            }
        });
    }

}