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
    TextView answerCountText;
    WordCounterMethodExtended wordCountEtended;
    TextView answerExtented;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);
        Log.d(getClass().toString(), "onCreate called");

        answerCountText = (TextView) findViewById(R.id.answer_text);
        questionEditText = (EditText) findViewById(R.id.EditText);


    }

    public void onButtonClicked(View Button) {
        wordCount = new WordCountMethod();
        String input = questionEditText.getText().toString();
        int answer = wordCount.wordCounter(input);
        answerCountText.setText(Integer.toString(answer));
    }

    public void onButtonTwoClicked(View Button) {
//        wordCountEtended = new WordCounterMethodExtended();
//        String input = questionEditText.getText().toString();
//        int answer = wordCountEtedned.wordCounter(input);
//        answerExtented.setText(Integer.toString(answer));
    }

}
