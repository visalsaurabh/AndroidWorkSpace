package com.example.saurabhvisal.interactivestory.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.saurabhvisal.interactivestory.R;


public class MyActivity extends Activity {

    private EditText mNameField;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        mNameField = (EditText) findViewById(R.id.nameEditText);
        mStartButton = (Button) findViewById(R.id.startButton);

        //anonymous inner class
        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = mNameField.getText().toString();     // using toString becoz getText return diff datatape(Edittable)
                                                                   // so its to be in the form of string.
                startStory(name);
            }
        });
    }

    private void startStory(String name){

        Intent intent = new Intent(MyActivity.this, StoryActivity.class);
        intent.putExtra(getString(R.string.Key_name), name);
        startActivity(intent);
    }

}
