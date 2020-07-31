package com.example.it19028774;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1 = findViewById(R.id.textView1);
        textView1.setTextColor(Color.BLUE);
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setTextColor(Color.parseColor("#000000"));
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setTextColor(Color.RED);

        final Button btn1 = findViewById(R.id.btnClick01);
        btn1.setOnClickListener( new View.OnClickListener(){

            public void onClick(View v) {
                // do something when the button is clicked
                btn1.setText("clicked");
            }
        });
    }
}