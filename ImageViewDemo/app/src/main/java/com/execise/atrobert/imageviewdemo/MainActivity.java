package com.execise.atrobert.imageviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void PressClickButton(View view){

        EditText editText = (EditText) findViewById(R.id.editText);

        Toast.makeText(this, "Hi !!" + editText.getText().toString(), Toast.LENGTH_SHORT).show();
        ImageView imgView = (ImageView) findViewById(R.id.imageView);

        if(imgView.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.horse).getConstantState()){
            imgView.setImageResource(R.drawable.octocat);
        }
        else {
            imgView.setImageResource(R.drawable.horse);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
