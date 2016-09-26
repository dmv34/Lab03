package com.example.drew.lab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class PicPassword extends AppCompatActivity {

    //declare objects that will be on the device
    private FrameLayout newFrame;
    private TextView feedback;
    private EditText passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic_password);

        //initialize objects and hiding frame from view
        newFrame = (FrameLayout) findViewById(R.id.frameLayout);
        newFrame.setVisibility(FrameLayout.GONE);
        feedback = (TextView) findViewById(R.id.textBox);
        passwordText = (EditText) findViewById(R.id.editText);

        //add listener to the password box using TextWatcher overrides
        passwordText.addTextChangedListener(new TextWatcher() {
            //Overrides for all methods were added automatically even though only one is needed
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //correct password
                if(s.toString().equals("DrewIsCool")){
                    newFrame.setVisibility(FrameLayout.VISIBLE);
                    feedback.setText("Correct");
                }
                else{
                    newFrame.setVisibility(FrameLayout.GONE);
                    feedback.setText("Wrong Password");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}
