package com.example.whitepaw.wordcountdracula;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Whitepaw on 04/07/2017.
 */

public class WordCountMethodTest {
    WordCountMethod wordInput;

    @Test
    public void functionOnCounter() {
        wordInput = new WordCountMethod();
        int wordCount = wordInput.wordCounter("Maybe BABY");
        assertEquals(2, wordCount);
    }

}
