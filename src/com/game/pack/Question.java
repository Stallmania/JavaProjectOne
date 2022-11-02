package com.game.pack;

public class Question {

    private String questionText;
    private String reponse;

    public Question(String questionText, String reponse){
        this.questionText=questionText;
        this.reponse=reponse;
    }

    public String getQuestionText() {
        return questionText;
    }
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getReponse() {
        return reponse;
    }
    public void setReponse(String reponse) {
        this.reponse = reponse;
    }
}
