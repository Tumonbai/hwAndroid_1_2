package com.example.hwandroid_1_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {


    public Button nxtBtn;
    private Button button;
    private EditText num1, num2;
    private TextView txtView;
    public static String TAG = "TAG";


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d(TAG,"onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        num1 = findViewById(R.id.edtText);
        num2 = findViewById(R.id.edtTextTwo);
        nxtBtn = findViewById(R.id.save);
        nxtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                double num1 = Double.parseDouble(ActivityTwo.this.num1.getText().toString());
                double num2 = Double.parseDouble(ActivityTwo.this.num2.getText().toString());
                intent.putExtra("equal", num1 + num2);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }
}