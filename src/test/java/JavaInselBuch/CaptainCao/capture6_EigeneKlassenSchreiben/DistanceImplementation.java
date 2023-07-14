package JavaInselBuch.CaptainCao.capture6_EigeneKlassenSchreiben;

//implementierung von zwei schnitstellen.
public class DistanceImplementation implements Distance, JavaInselBuch.Beispiele.funktionaleInterfaceUndLamdas.Interface.HundInterface {
    private final int value;

    public DistanceImplementation(int value){
        this.value = value;
    }

    @Override
    public int meter() {
        return value;
    }


    //Hier nur test, wir sehen das man mehrere schnitstellen implementieren kann in einer klasse!
    @Override
    public void bellen() {

    }

    @Override
    public void fressen() {

    }
}
