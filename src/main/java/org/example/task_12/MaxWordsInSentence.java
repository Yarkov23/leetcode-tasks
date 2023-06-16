package org.example.task_12;

public class MaxWordsInSentence {

    public int mostWordsFound(String[] sentences) {
        int wordCount = 0;
        for (String sentence : sentences) {
                int currStrLength = sentence.split(" ").length;
                if (wordCount < currStrLength) {
                    wordCount = currStrLength;
                }
        }
        return wordCount;
    }

}
