package JavaInselBuch.CaptainCao.capture10BesondereTypenDerJavaSE;


import java.util.*;

public enum CandyType {
    //Hier wird ein Konstruktor benötigt um den Enum-Konstanten einen Int zuweisen zu können(siehe zeile 12).
    CARAMELS(9), CHOCOLATE(5), GUMMIES(4), LICORIES(3), LOLLIPOPS(2), CHEWING_GUMS(3), COTTON_CANDY(1);



    //Objectvariable
    final int obsession;


    //Konstruktor
    CandyType(int obsession) {
        this.obsession = obsession;
    }



    //getter für obsession.
    public int addictiveQualitiy() {
        return obsession;
    }



    //Hier wird das nächsthöchste candy ausgegeben abhängig vom aktuellen Candy object.
    public Optional<CandyType> next() {
        //Bei Caramels bleibt gleich.
        if (this == CARAMELS) {
            return Optional.of(CARAMELS);
        }
        //Bei lollipos haben wir zwei nächsthöchste und wir wählen zufällig eins davon.
        if (this == LOLLIPOPS) {
            //Ramdom geh hier bis 1!
            int randomIndex = new Random().nextInt(2);
            return Optional.of(randomIndex == 0 ? LICORIES : CHEWING_GUMS);
        }
        //Hier wird standardmässig das nächsthöchste gesucht.
        CandyType nextCandy = null;
        for (CandyType candyType : CandyType.values()) {
            if (candyType.obsession > this.obsession && (nextCandy == null || candyType.obsession < nextCandy.obsession))
                nextCandy = candyType;
        }
        return Optional.ofNullable(nextCandy);
    }

    //Hier die selbe methode von oben nur diesmal mit switch, aber mit ähnlicher logik.
    public CandyType next2(){
        switch (this){
            case GUMMIES -> {return CHOCOLATE;}
            case LOLLIPOPS -> {return  Math.random() > 0.5 ? LICORIES : CHEWING_GUMS;}
            case COTTON_CANDY -> {return  LOLLIPOPS;}
            case LICORIES, CHEWING_GUMS -> {return GUMMIES;}
            default -> {return CARAMELS;}
        }
    }



    //Hier wird der input String angepasst , so dass er auch klein geschrieben sein kann oder Lehrzeichen anstatt _ enthält. Danach wird die Konstanste zurückgegeben.
    static Optional<CandyType> fromName(String input) {
        try {
            input = input.trim().toUpperCase().replace(' ', '_');
            return Optional.of(CandyType.valueOf(input));
        } catch (IllegalArgumentException e) {
            return Optional.empty();
        }
    }


    //Mit dieser statischen Methode geben wir ein zufälliges Candy object zurück.
    static CandyType random() {
        return values()[(int) (Math.random() * values().length)];
    }




    //Hier die ausgabe und test auf der konsole.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        fromName(input).ifPresentOrElse(System.out::println, () -> System.out.println("Unknown"));
        System.out.println(CandyType.random());
        //Methode next() kommt zum einsatz.
        System.out.println(CandyType.GUMMIES.next2());
    }
}
