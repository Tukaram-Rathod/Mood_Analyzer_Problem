package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
//class test
public class MoodAnalyserTest {
    // test for nullpointer
    @Test
    public void givenNullMoodShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
    //test for thrown exception
    @Test
    public void givenNullMoodShouldThrowMoodAnalysisException()
    {
        MoodAnalyser moodAnalyzer = new MoodAnalyser();
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givenEmptyMoodShouldThrowMoodAnalysisException()
    {
        MoodAnalyser moodAnalyzer = new MoodAnalyser();
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
}
