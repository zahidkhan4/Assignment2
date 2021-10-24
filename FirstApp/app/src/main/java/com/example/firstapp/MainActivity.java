package com.example.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        EditText editText;
        TextView textView;
        String result = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         editText=findViewById(R.id.editNumber);
         textView=findViewById(R.id.tvResult);
    }

    public void Clicked(View view) {

        String number=editText.getText().toString();
        int n =Integer.parseInt(number);
        result="";
        for(int i=1;i<=10;i++)
{

            result += n + "X" + i + "=" + n*i + "\n";



}
            textView.setText(result);

    }
}