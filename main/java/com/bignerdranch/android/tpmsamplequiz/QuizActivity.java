package com.bignerdranch.android.tpmsamplequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonQuit;

    private String mAnswer;
    public int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mButtonQuit = (Button) findViewById(R.id.quit);
        mButtonQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });

        updateQuestion();

        // Start of Button listener for Button 1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // My logic for Button goes in here
                System.out.println("Question Number = " + mQuestionNumber);
                if (mQuestionNumber >= 5) {
                    if (mButtonChoice1.getText() == mAnswer) {
                        mScore = mScore + 1;
                        updateScore(mScore);
                    }
                    Intent intent = new Intent(QuizActivity.this, Final.class);
                    intent.putExtra("user_final_score", mScore);
                    startActivity(intent);
                }
                else if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    // This line of code is optional
                    Toast.makeText(QuizActivity.this, "Correct!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(QuizActivity.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        // End of Button listener for Button 1

        // Start of Button listener for Button 2
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // My logic for Button goes in here
                System.out.println("Question Number = " + mQuestionNumber);
                if (mQuestionNumber >= 5) {
                    if (mButtonChoice2.getText() == mAnswer) {
                        mScore = mScore + 1;
                        updateScore(mScore);
                    }
                    Intent intent = new Intent(QuizActivity.this, Final.class);
                    intent.putExtra("user_final_score", mScore);
                    startActivity(intent);
                }
                else if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    // This line of code is optional
                    Toast.makeText(QuizActivity.this, "Correct!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(QuizActivity.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        // End of Button listener for Button 2

        // Start of Button listener for Button 3
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // My logic for Button goes in here
                System.out.println("Question Number = " + mQuestionNumber);
                if (mQuestionNumber >= 5) {
                    if (mButtonChoice3.getText() == mAnswer) {
                        mScore = mScore + 1;
                        updateScore(mScore);
                    }
                    Intent intent = new Intent(QuizActivity.this, Final.class);
                    intent.putExtra("user_final_score", mScore);
                    startActivity(intent);
                }
                else if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    // This line of code is optional
                    Toast.makeText(QuizActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        // End of Button listener for Button 3
    }

    private void updateQuestion() {
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);

        mQuestionNumber++;

    }

    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }


}


