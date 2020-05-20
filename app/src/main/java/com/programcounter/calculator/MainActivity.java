package com.programcounter.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.EditText;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {

    TextView display;
    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.8F);
    private boolean paran = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.display);

    }

    public void del(View view) {
        view.startAnimation(buttonClick);
        display.setText("");
    }

    public void plus(View view) {

        String current = display.getText().toString();
        view.startAnimation(buttonClick);
        display.setText(current+"+");

    }

    public void minus(View view) {
        String current = display.getText().toString();
        view.startAnimation(buttonClick);
        display.setText(current+"-");
    }

    public void division(View view) {
        String current = display.getText().toString();
        view.startAnimation(buttonClick);
        display.setText(current+"/");
    }

    public void multiplication(View view) {
        String current = display.getText().toString();
        view.startAnimation(buttonClick);
        display.setText(current+"*");
    }

    public void equal(View view) {
        String calculation = display.getText().toString();
        view.startAnimation(buttonClick);

        Double result;

        Expression ex = new ExpressionBuilder(calculation).build();

        try{
            result = ex.evaluate();
        }catch (Exception e){
            result = null;
        }
        if(result == null){
            display.setText("Math error");
        }else{
            display.setText(result+"");
        }

    }

    public void number7(View view) {
        String current = display.getText().toString();
        view.startAnimation(buttonClick);
        display.setText(current+"7");
    }

    public void number8(View view) {
        String current = display.getText().toString();
        view.startAnimation(buttonClick);
        display.setText(current+"8");
    }

    public void number9(View view) {
        String current = display.getText().toString();
        view.startAnimation(buttonClick);
        display.setText(current+"9");
    }


    public void number4(View view) {
        String current = display.getText().toString();
        view.startAnimation(buttonClick);
        display.setText(current+"4");
    }

    public void number5(View view) {
        String current = display.getText().toString();
        view.startAnimation(buttonClick);
        display.setText(current+"5");
    }

    public void number6(View view) {
        String current = display.getText().toString();
        view.startAnimation(buttonClick);
        display.setText(current+"6");
    }


    public void number1(View view) {
        String current = display.getText().toString();
        view.startAnimation(buttonClick);
        display.setText(current+"1");
    }

    public void number2(View view) {
        String current = display.getText().toString();
        view.startAnimation(buttonClick);
        display.setText(current+"2");
    }

    public void number3(View view) {
        String current = display.getText().toString();
        display.setText(current+"3");
    }


    public void number0(View view) {
        String current = display.getText().toString();
        view.startAnimation(buttonClick);
        display.setText(current+"0");
    }

    public void point(View view) {
        String current = display.getText().toString();
        view.startAnimation(buttonClick);
        display.setText(current+".");
    }

    public void paranth(View view) {
        String current = display.getText().toString();
        view.startAnimation(buttonClick);

        if(paran){
            display.setText(current+")");
            paran = false;
        }else{
            display.setText(current+"(");
            paran = true;
        }

    }
}
