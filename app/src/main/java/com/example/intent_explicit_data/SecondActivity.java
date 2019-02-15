package com.example.intent_explicit_data;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txtSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtSecond = (TextView) findViewById(R.id.txtSecond);

        //nhan du lieu tu Intent
        Intent intent = getIntent();
//        String noidung = intent.getStringExtra("data");
//        int noiDung = intent.getIntExtra("data", 1234);
//        String[] arraySubjects = intent.getStringArrayExtra("data");
//        Students hs = (Students) intent.getSerializableExtra("data");

        Bundle bundle = intent.getBundleExtra("data");

        if (bundle != null) {
            String name = bundle.getString("Chain");
            int number = bundle.getInt("number", 123);
            String[] array = bundle.getStringArray("city");
            Students students = (Students) bundle.getSerializable("doiTuong");

            txtSecond.setText(name + "\n" + number + "\n" + array[1] + "\n" + students.getName());
        }



    }
}
