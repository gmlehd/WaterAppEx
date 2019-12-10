package com.cookandroid.waterappex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class weight extends AppCompatActivity {

    Button Next;
    EditText WeightEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight);  // layout xml 과 자바파일을 연결

        WeightEdit = (EditText)findViewById(R.id.WeightEdit);
        Next = (Button)findViewById(R.id.Next);


        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), watergoal.class);

                intent.putExtra("Weight", WeightEdit.getText().toString());


                startActivity(intent);
            }
        });



    }
}
