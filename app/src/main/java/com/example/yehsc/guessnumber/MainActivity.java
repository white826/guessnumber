package com.example.yehsc.guessnumber;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclick(View view){
        EditText myedit = (EditText) findViewById(R.id.editText);

        TextView myview = (TextView) findViewById(R.id.textView);
        char[] str = myedit.getText().toString().toCharArray();
        String computer = "2048";
        char[] target = computer.toCharArray();

        int a=0;
        int b=0;

        for(int i=0;i<str.length;i++)
            for(int j=0;j<target.length;j++){
                if(str[i]==target[j]){
                    if(i==j)
                        a++;
                    else
                        b++;
                }
            }
        String result = a + "A" + b + "B";
        myview.setText(result);
    }
}
