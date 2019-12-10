package com.cookandroid.waterappex;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class start extends AppCompatActivity {

    LinearLayout Linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);

        Linear = (LinearLayout)findViewById(R.id.Linear);

        Linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        weight.class);
                startActivity(intent);
            }
        });

    }
}
