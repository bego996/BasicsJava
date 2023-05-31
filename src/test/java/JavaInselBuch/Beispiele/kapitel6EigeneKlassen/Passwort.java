package JavaInselBuch.Beispiele.kapitel6EigeneKlassen;

public class Passwort {
    private String passwort = "";

    public void assignNewPasswort(String oldPasswort,String newPasswort){
        if (passwort.equals(oldPasswort) && !newPasswort.isEmpty()){
            passwort = newPasswort;
            System.out.println("Neues Passwort gesetzt!");
        }else {
            System.out.println("Passwort setzen fehlgescdhlagen");
        }
    }
    public boolean check(String passwort){
        return this.passwort.equals(passwort);
    }
}
