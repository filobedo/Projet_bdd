package org.example;

public class Player {
    private String score = "love";

    public void incrementScore() {

        switch (this.score) {
            case "love":
                this.score = "15";
                break;
            case "15":
                this.score = "30";
                break;
            case "30":
                this.score = "40";
                break;
//            case "40":
//                this.score = "win";
//                break;
        }
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
