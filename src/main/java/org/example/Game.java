package org.example;

public class Game {
    private final String[] players;
    private final int[] playersScores = new int[2];
    private final StringBuilder scoreAnnouncement = new StringBuilder();

    public Game(String[] players) {
        this.players = players;
        scoresAnnouncement();
    }

    public String getScoreAnnouncement() {
        return scoreAnnouncement.toString();
    }

    public String getPlayer(String playerName) {
        for (String player : players) {
            if (player.equals(playerName))
                return player;
        }
        return "error";
    }

    public boolean checkIfGameScoreIsDeuce() {
        return this.scoreAnnouncement.toString().equals("deuce");
    }

    public void playerScore(String player) {
        if (!this.checkIfGameScoreIsDeuce()) {
            if (player.equals(this.players[0])) {
                this.playersScores[0]++;
                this.scoresAnnouncement();
            } else {
                this.playersScores[1]++;
                this.scoresAnnouncement();
            }
        } else {
            this.scoreAnnouncement.setLength(0);
            if (player.equals(this.players[0])) {
                this.scoreAnnouncement.append("advantage - 40");
                this.playersScores[0]++;
            } else {
                this.scoreAnnouncement.append("40 - advantage");
                this.playersScores[1]++;
            }
        }
    }

    public void scoresAnnouncement() {
        this.scoreAnnouncement.setLength(0);
        if (playersScores[0] - playersScores[1] >= 2 && this.playersScores[0] > 3) {
            this.scoreAnnouncement.append("Player ").append(this.players[0]).append(" win the game");
        } else if (playersScores[1] - playersScores[0] >= 2) {
            this.scoreAnnouncement.append("Player ").append(this.players[1]).append(" win the game");
        } else {
            if (playersScores[0] >= 3 && playersScores[0] == playersScores[1]) {
                this.scoreAnnouncement.append("deuce");
            } else {
                for (int i = 0; i < playersScores.length; i++) {
                    switch (playersScores[i]) {
                        case 0:
                            this.scoreAnnouncement.append("love");
                            break;
                        case 1:
                            this.scoreAnnouncement.append("15");
                            break;
                        case 2:
                            this.scoreAnnouncement.append("30");
                            break;
                        case 3:
                            this.scoreAnnouncement.append("40");
                            break;
                    }
                    if (i == 0) {
                        this.scoreAnnouncement.append(" - ");
                    }
                }
            }
        }
    }
}
