package com.example.whitepaw.wordcountdracula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCount extends AppCompatActivity {
    EditText questionEditText;
    WordCountMethod wordCount;
    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);
        Log.d(getClass().toString(), "onCreate called");

        answerText = (TextView) findViewById(R.id.answer_text);
        questionEditText = (EditText) findViewById(R.id.EditText);


    }

    public void onButtonClicked(View Button) {
        wordCount = new WordCountMethod();
        String input = questionEditText.getText().toString();
        int answer = wordCount.wordCounter(input);
        answerText.setText(Integer.toString(answer));
    }

}
