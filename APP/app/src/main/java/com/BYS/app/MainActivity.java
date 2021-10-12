package com.BYS.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView msg;
    private Button  change;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg=findViewById(R.id.tv_msg);
        change=findViewById(R.id.btn_change);

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg.setText("梅西");
            }
        });



    }
}