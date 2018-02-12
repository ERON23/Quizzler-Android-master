package com.londonappbrewery.quizzler;

/**
 * Created by maceo on 2/6/18.
 */

public class TrueFalse {
    // ties the id of the question being asked
    private int mQuestionID;
    // answer to the question can only be true or false
    private boolean mAnswer;


    // this is a constructor and will create questions
    // looks like a method
    public TrueFalse(int questionResourceID, boolean trueOrFalse) {
        mQuestionID = questionResourceID;
        mAnswer = trueOrFalse;
    }

    public int getmQuestionID() {
        return mQuestionID;
    }

    public void setmQuestionID(int mQuestionID) {
        this.mQuestionID = mQuestionID;
    }

    public boolean ismAnswer() {
        return mAnswer;
    }

    public void setmAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }
}
