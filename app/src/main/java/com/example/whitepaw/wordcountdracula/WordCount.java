package com.example.whitepaw.wordcountdracula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WordCount extends AppCompatActivity {
    EditText questionEditText;
    Button countButton;
    WordCountMethod wordCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);
        Log.d(getClass().toString(), "onCreate called");


    }

    public void onButtonClicked(View Button) {
        wordCount = new WordCountMethod();
        String question = questionEditText.getText().toString();
        Log.d(getClass().toString(), "ButtonClicked was called");
        Log.d(getClass().toString(), "The question asked was '" + question + "'");
    }

}
