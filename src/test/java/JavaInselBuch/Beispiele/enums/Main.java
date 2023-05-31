package JavaInselBuch.Beispiele.enums;

public class Main {
    public static void main(String[] args) {
        //Enum = Enumeration : Aufzählung
        Gamer gamer = new Gamer();
        gamer.setDifficulty(Schwierigkeit.MITTEL);
        gamer.setTempo(Geschwindigkeit.SCHNEL);
        switch (gamer.getDifficulty()){
            case LEICHT :
                //Code für Leichtes Spiel.
                System.out.println("Schwächling");
                switch (gamer.getTempo()) {
                    case LANGSAM:
                        //Code für langsames Tempo.
                        System.out.println("Sehr Langsam");
                        break;
                    case SCHNEL:
                        //Code für Mittleres Tempo.
                        System.out.println("Stark");
                        break;
                    default:
                        System.out.println("Foisch isses");
                }
                break;
            case MITTEL :
                //Code für Mittelschweres Spiel.
                System.out.println("Stark");
                switch (gamer.getTempo()) {
                    case LANGSAM:
                        //Code für langsames Tempo.
                        System.out.println("Sehr Langsam");
                        break;
                    case SCHNEL:
                        //Code für Mittleres Tempo.
                        System.out.println("Stark");
                        break;
                    default:
                        System.out.println("Foisch isses");
                }
                break;
            case SCHWER :
                //Code für Schweres Spiel.
                System.out.println("Harder Brockn");
                switch (gamer.getTempo()) {
                    case LANGSAM:
                        //Code für langsames Tempo.
                        System.out.println("Sehr Langsam");
                        break;
                    case SCHNEL:
                        //Code für Mittleres Tempo.
                        System.out.println("Stark");
                        break;
                    default:
                        System.out.println("Foisch isses");
                }
                break;
            default:
                System.out.println("Falsche Eingabe");
        }
    }
}
