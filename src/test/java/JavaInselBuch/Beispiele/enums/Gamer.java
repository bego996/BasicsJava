package JavaInselBuch.Beispiele.enums;

public class Gamer {
    private int score;
    private Schwierigkeit difficulty;

    private Geschwindigkeit tempo;

    public Gamer(){
        this.score = 0;
        this.difficulty = Schwierigkeit.LEICHT;
        this.tempo = Geschwindigkeit.LANGSAM;

    }

    public Schwierigkeit getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Schwierigkeit difficulty) {
        this.difficulty = difficulty;
    }

    public Geschwindigkeit getTempo() {
        return tempo;
    }

    public void setTempo(Geschwindigkeit tempo) {
        this.tempo = tempo;
    }
}
