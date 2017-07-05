package com.example.whitepaw.wordcountdracula;

import java.util.HashMap;

/**
 * Created by Whitepaw on 05/07/2017.
 * extended to be conected to activity page.
 */

public class WordCounterMethodExtended {
    private HashMap <String, Integer> concordance;
    private String[] words;

    public WordCounterMethodExtended(String text) {
        this.concordance = new HashMap<String, Integer>();
        this.words - text.toLowerCase().split("[,\\s]+");

        for (String word : words) {
            if (concordance.get(word) == null){
            concordance.put(word, 1);
            } else {
                concordance.put(word, concordance.get(word) + 1);
            }
        }
    }

    public int getCount() { return this.words.length; }

    public int getOccurrencesCount(String word) { return concordance.get(word);}

    public String toString() {
        String output = "Total Words: " + words.length + "\n";

        for (String key : concordance.keySet()) {
            output += key + " : " + concordance.get(key) + "\n";
        }

        return output;

    }

}
