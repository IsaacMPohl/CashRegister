package com.example.test123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int onTrayIncr = 0;
    int mainTrayIncr =0;
    int sideItemIncr = 0;
    int desertItemIncr = 0;
    int cookieItemIncr = 0 ;
    int soupItemIncr = 0;
    int total = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mealItemDisTXT = findViewById(R.id.textView3);
        TextView onTrayItemDisTXT = findViewById(R.id.textView4);
        TextView sideItemDisTxt = findViewById(R.id.textView5);
        TextView desertItemDisTxT = findViewById(R.id.textView6);
        TextView cookieItemDisTxT = findViewById(R.id.textView14);
        TextView soupItemDisTXT = findViewById(R.id.textView21);



        Button mainAddBTN = findViewById(R.id.button13);
        Button mainDelBTN = findViewById(R.id.button14);
        Button onTrayAddBTN = findViewById(R.id.button24);
        Button onTrayDelBTN = findViewById(R.id.button25);
        Button sideItemAddBTN = findViewById(R.id.button28);
        Button sideItemDelBTN = findViewById(R.id.button29);
        Button desertItemAddBTN = findViewById(R.id.button26);
        Button desertItemDelBTN = findViewById(R.id.button27);
        Button cookieItemAddBTN = findViewById(R.id.button3);
        Button cookieItemDelBTN = findViewById(R.id.button4);
        Button soupItemAddBTN = findViewById(R.id.button2);
        Button soupItemDelBTN = findViewById(R.id.button5);
        Button resetBTN = findViewById(R.id.button);

        mainAddBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mainTrayIncr++;
                //outputTXT.setText(entree);
                mealItemDisTXT.setText(Integer.toString(mainTrayIncr));
                total+=8;


            }
        });
        mainDelBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mainTrayIncr--;
                //outputTXT.setText(entree);
                mealItemDisTXT.setText(Integer.toString(mainTrayIncr));
                total-=8;

            }
        });
        onTrayAddBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                onTrayIncr++;
                //outputTXT.setText(entree);
                onTrayItemDisTXT.setText(Integer.toString(onTrayIncr));
                total+=5;

            }
        });
        onTrayDelBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                onTrayIncr--;
                //outputTXT.setText(entree);
                onTrayItemDisTXT.setText(Integer.toString(onTrayIncr));
                total-=5;

            }
        });
        sideItemAddBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                sideItemIncr++;
                //outputTXT.setText(entree);
                sideItemDisTxt.setText(Integer.toString(sideItemIncr));
                total+=1;

            }
        });
        sideItemDelBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                sideItemIncr--;
                //outputTXT.setText(entree);
                sideItemDisTxt.setText(Integer.toString(sideItemIncr));
                total-=5;

            }
        });
        desertItemAddBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                desertItemIncr++;
                //outputTXT.setText(entree);
                desertItemDisTxT.setText(Integer.toString(desertItemIncr));
                total+=3;

            }
        });
        desertItemDelBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                desertItemIncr--;
                //outputTXT.setText(entree);
                desertItemDisTxT.setText(Integer.toString(desertItemIncr));
                total-=3;

            }
        });
        cookieItemAddBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                cookieItemIncr++;
                //outputTXT.setText(entree);
                cookieItemDisTxT.setText(Integer.toString(cookieItemIncr));
                total+=.50;

            }
        });
        cookieItemDelBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                cookieItemIncr--;
                //outputTXT.setText(entree);
                cookieItemDisTxT.setText(Integer.toString(cookieItemIncr));
                total-=.50;

            }
        });
        soupItemAddBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                soupItemIncr++;
                //outputTXT.setText(entree);
                soupItemDisTXT.setText(Integer.toString(soupItemIncr));
                total+=2;

            }
        });
        soupItemDelBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                soupItemIncr--;
                //outputTXT.setText(entree);
                soupItemDisTXT.setText(Integer.toString(soupItemIncr));
                total-=2;

            }
        });
        resetBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                soupItemIncr--;
                

            }
        });

    }

}