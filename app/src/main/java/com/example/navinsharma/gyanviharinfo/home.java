package com.example.navinsharma.gyanviharinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class home extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


    }

    @Override
    public void onClick(View v) {

    }

    public void ca(View view) {
        Intent intent=new Intent(home.this,d1.class);
        startActivity(intent);
    }

    public void civil(View view) {
        Intent intent=new Intent(home.this,d2.class);
        startActivity(intent);
    }

    public void ec(View view) {
        Intent intent=new Intent(home.this,d3.class);
        startActivity(intent);
    }

    public void com(View view) {
        Intent intent=new Intent(home.this,d1.class);
        startActivity(intent);
    }

    public void me(View view) {
        Intent intent=new Intent(home.this,d2.class);
        startActivity(intent);
    }

    public void bio(View view) {
        Intent intent=new Intent(home.this,d3.class);
        startActivity(intent);
    }

    public void ee(View view) {
        Intent intent=new Intent(home.this,d1.class);
        startActivity(intent);
    }
}
