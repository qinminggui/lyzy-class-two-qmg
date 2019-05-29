package com.example.myxiaohuanshu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Yongo extends AppCompatActivity implements View.OnClickListener {
    private EditText zc1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.okok);
        Button H1= (Button)findViewById(R.id.H1);
        H1.setOnClickListener(this);

        zc1= (EditText) findViewById(R.id.zc1);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.H1:
                Intent j =new Intent(Yongo.this, Day.class);
                startActivity(j);
                break;
        }

    }
}
