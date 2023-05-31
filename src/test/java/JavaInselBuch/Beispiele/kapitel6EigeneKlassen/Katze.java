package JavaInselBuch.Beispiele.kapitel6EigeneKlassen;

public abstract class  Katze {
    private String name;
    private int alter;

    void laufen() {
        if (name != null)
        System.out.println(name + " läuft");
        else
            System.out.println("Hatt noch keinen Namen!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
