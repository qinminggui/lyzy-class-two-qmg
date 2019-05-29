package com.example.myxiaohuanshu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Day extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dod);
        Button login_1= (Button)findViewById(R.id.login_1);
        login_1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login_1:
                Intent i = new Intent(Day.this, Yongo.class);
                startActivity(i);
                break;


        }

    }
}
