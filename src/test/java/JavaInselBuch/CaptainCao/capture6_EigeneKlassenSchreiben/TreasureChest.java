package JavaInselBuch.CaptainCao.capture6_EigeneKlassenSchreiben;

public class TreasureChest {
    public final int goldDoubloonWeight;
    public final int gemstoneWeight;

//Fabrik Konstruktor. Alternative zu normalen Kontrsuktor. Nützlich wenn manche werte anders sein können.
    private TreasureChest(int goldDoubloonWeight, int gemstoneWeight) {
        if (goldDoubloonWeight < 0 || gemstoneWeight < 0)
            throw new IllegalArgumentException("No negative value accepted!");
        this.goldDoubloonWeight = goldDoubloonWeight;
        this.gemstoneWeight = gemstoneWeight;
    }

    public static TreasureChest newInstance() {
        return new TreasureChest(0, 0);
    }

    public static TreasureChest newInstanceWithGemstoneWeight(int gemstoneWeight) {
        return new TreasureChest(0, gemstoneWeight);
    }

    public static TreasureChest newInstanceWithGoldDoubloonWeight(int goldDoubloonWeight) {
        return new TreasureChest(goldDoubloonWeight, 0);
    }

    public static TreasureChest newInstanceWithGoldDoubloonWeightAndGemstoneWeight(int goldDoubloonWeight, int gemstoneWeight) {
        return new TreasureChest(goldDoubloonWeight, gemstoneWeight);
    }
}
