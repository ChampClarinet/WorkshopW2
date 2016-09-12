package com.example.clarinetmaster.workshopw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private String text = String.valueOf(R.string.defaultPassword);
    private boolean blank = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(this);
        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(this);
        Button btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(this);
        Button btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(this);
        Button btn6 = (Button) findViewById(R.id.button6);
        btn6.setOnClickListener(this);
        Button btn7 = (Button) findViewById(R.id.button7);
        btn7.setOnClickListener(this);
        Button btn8 = (Button) findViewById(R.id.button8);
        btn8.setOnClickListener(this);
        Button btn9 = (Button) findViewById(R.id.button9);
        btn9.setOnClickListener(this);
        Button btnDel = (Button) findViewById(R.id.buttonDel);
        btnDel.setOnClickListener(this);
        Button btn0 = (Button) findViewById(R.id.buttonZero);
        btn0.setOnClickListener(this);
        Button btnOK = (Button) findViewById(R.id.buttonOK);
        btnOK.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String add = null;
        int id = v.getId();
        TextView t = (TextView) findViewById(R.id.textView2);
        switch (id){
            case R.id.button1: add = "1";
                break;
            case R.id.button2: add = "2";
                break;
            case R.id.button3: add = "3";
                break;
            case R.id.button4: add = "4";
                break;
            case R.id.button5: add = "5";
                break;
            case R.id.button6: add = "6";
                break;
            case R.id.button7: add = "7";
                break;
            case R.id.button8: add = "8";
                break;
            case R.id.button9: add = "9";
                break;
            case R.id.buttonZero: add = "0";
                break;
            case R.id.buttonDel: clear();
                break;
            case R.id.buttonOK: ok();
                break;
            default: break;
        }
        if(add != null){
            if(blank)
                text = add;
            else text += add;
            blank = false;
        }
        t.setText(text);
    }

    private void clear(){
        text = getResources().getString(R.string.defaultPassword);
        blank = true;
    }

    private void ok() {
        String message = null;
        if(text.equals("07550592")){
            message = getResources().getString(R.string.validPass);
            Toast t = Toast.makeText(this, message, Toast.LENGTH_SHORT);
            t.show();
            clear();
        }
        else {
            message = getResources().getString(R.string.invalidPass);;
            Toast t = Toast.makeText(this, message, Toast.LENGTH_SHORT);
            t.show();
            message = getResources().getString(R.string.again);
            t = Toast.makeText(this, message, Toast.LENGTH_SHORT);
            t.show();
            clear();
        }
    }
}
