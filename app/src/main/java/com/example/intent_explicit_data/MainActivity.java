package com.example.intent_explicit_data;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSend = (Button) findViewById(R.id.buttonSendData);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class );

//                intent.putExtra("data", "Noi dung");
//                String[] arrayCourse = {"Android", "Ios", "Java", "Php"};
//                Students students = new Students("Huan", 1995);

                String[] arrayName = {"Ho Chi Minh", "Can Tho", "Da Lat", "Ha Noi"};
                Students students = new Students("Duy Huan", 1995);

                Bundle bundle = new Bundle();
                bundle.putString("Chain", "Huan Training");
                bundle.putInt("number", 1995);
                bundle.putStringArray("city", arrayName);
                bundle.putSerializable("doiTuong", students);

                intent.putExtra("data", bundle);


                startActivity(intent);
            }
        });
    }
}
