package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
//refactor uc
//class mood analyzer test
public class MoodAnalyserTest {
    //uc1 TC1.1
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("SAD");
        String mood = moodAnalyser.analyseMood("I am in sad mood ");
        Assert.assertEquals("SAD",mood);
    }
    //uc1 TC1.2
    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("HAPPY");
        String mood = moodAnalyser.analyseMood("I am in  happy Mood ");
        Assert.assertEquals("HAPPY",mood);
    }
    //uc1 Refactor TC1.1
    @Test
    public void givenMessage_Constructor_WhenSad_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood ");
        String mood = moodAnalyser.analyseMood("SAD");
        Assert.assertEquals("SAD",mood);
    }
    //uc1 Refactor TC1.2
    @Test
    public void givenMessagen_Constructor_WhenNotSad_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in  happy Mood ");
        String mood = moodAnalyser.analyseMood("Happy");
        Assert.assertEquals("HAPPY",mood);
    }
}
