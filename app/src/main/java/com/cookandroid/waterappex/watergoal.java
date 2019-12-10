package com.cookandroid.waterappex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class watergoal extends AppCompatActivity {

    EditText WeightEdit;
    Button LetStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.watergoal);  // layout xml 과 자바파일을 연결

        WeightEdit = (EditText)findViewById(R.id.WeightEdit);
        LetStart = (Button)findViewById(R.id.LetStart);


        Intent intent = getIntent(); //이전 액티비티에서 수신할 데이터를 받기위해 선언

        String Receive = intent.getStringExtra("Weight");
        int weight = Integer.valueOf(Receive) * 30;
        WeightEdit.setText(String.valueOf(weight));

        WeightEdit.setSelection(WeightEdit.length());

        LetStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoMain = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(gotoMain);
            }
        });
    }


}
