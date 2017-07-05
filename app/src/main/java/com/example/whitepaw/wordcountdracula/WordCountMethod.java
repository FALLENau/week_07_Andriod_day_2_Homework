package com.example.whitepaw.wordcountdracula;

/**
 * Created by Whitepaw on 04/07/2017.
 */

public class WordCountMethod {

    public int wordCounter(String wordInput) {
        return wordInput.split(" ").length;
    }

}

//public class wordCounter{
//    public int getCount(String text) {
//        String[] wordArray = text.toLoverCase().split(" ");
//        return wordArray.length;
//    }
//} //Note class example solution.