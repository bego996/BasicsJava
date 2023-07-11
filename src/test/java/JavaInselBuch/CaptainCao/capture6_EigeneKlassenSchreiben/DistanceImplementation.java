package JavaInselBuch.CaptainCao.capture6_EigeneKlassenSchreiben;

public class DistanceImplementation implements Distance {
    private final int value;

    public DistanceImplementation(int value){
        this.value = value;
    }

    @Override
    public int meter() {
        return value;
    }
}
