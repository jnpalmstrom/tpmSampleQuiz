package com.bignerdranch.android.tpmsamplequiz;

public class QuestionLibrary {

    private String mQuestion [] = {
            "Which of the following can be sent through a pillar box?",
            "What color are pillar boxes today?",
            "What do you need to put on a letter to send it through the mail?",
            "What was the first stamp called that was sold by the Post Office?",
            "How much did the first stamp cost that was sold by the Post Office?"
    };

    private String mChoice [][] = {
            {"A chair", "A toaster", "A postcard"},
            {"Black", "Red", "Purple"},
            {"A stamp", "Tape", "A sticky note"},
            {"Penny White", "A note", "Penny Black"},
            {"One Pound", "One Penny", "Five Pence"}
    };

    private String mCorrectAnswers[] = {"A postcard", "Red", "A stamp", "Penny Black", "One Penny"};


    public String getQuestion(int a) {
        String question = mQuestion[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = mChoice[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoice[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoice[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
