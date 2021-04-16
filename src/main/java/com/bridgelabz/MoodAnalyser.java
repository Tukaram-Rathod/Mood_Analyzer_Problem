package com.bridgelabz;
//class mood analyaser
public class MoodAnalyser {
    public String message;
    //constructor class
    public MoodAnalyser() {
    }
    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyseMood()  {
        try {
            this.message = message;
            if (message == null || message.isEmpty())
            {
                throw new MoodAnalysisException();
            }
            if(message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (MoodAnalysisException e) {
            return "HAPPY";
        }
    }
}