package com.example.sme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView sales = findViewById(R.id.sales);
        CardView payments = findViewById(R.id.payments);
        CardView expenditure = findViewById(R.id.expenditure);
        CardView recipt = findViewById(R.id.recipt);
        CardView purchase = findViewById(R.id.purchase);
        CardView journal = findViewById(R.id.journal);

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());
        TextView date = findViewById(R.id.date);
        date.setText(currentDate);

        //        this onclick event for sales cardview
        sales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sales.class);
                startActivity(intent);
            }
        });

        //        this onclick event for payments cardview
        payments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Payments.class);
                startActivity(intent);
            }
        });

        //        this onclick event for expenditure cardview
        expenditure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Expenditure.class);
                startActivity(intent);
            }
        });

        //        this onclick event for recipt cardview
        recipt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Recipt.class);
                startActivity(intent);
            }
        });

        //        this onclick event for purchase cardview
        purchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Purchase.class);
                startActivity(intent);
            }
        });

        //        this onclick event for journal cardview
        journal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Journal.class);
                startActivity(intent);
            }
        });
    }
}