package at.htl.klu3AAIF.Uebung5Arrays;

public class Task8 {
    public static void main(String[] args) {
        char percent = '%';
        byte x = 1, y = 2, z = 3;
        short a = 10, b = 15, A = 150, monitorHz = 90, subtraction = 100, discountInPercent = 10;
        float size = 3.50f, width = 9.99f, weight = 15, prizeOculus = 349.99f;
        short pixelX = 3664, PixelY = 1920, pixelEyeX = 1832, pixelEyeY = 1920, heightP = 182, weightP = 83;
        String nameP = "Peter", hardware = "Oculus Quest 2";
        String chainA = String.format("x:%d, y:%d, z:%d",x,y,z);
        String chainB = String.format("a:%d | b:%d | A:%d",a,b,A);
        String ChainC = String.format("%s ist %dcm groß und %dkg schwer!",nameP,heightP,weightP);
        String ChainD = String.format("Länge: %.2fcm, Breite: %.2fcm, Gewicht: %dkg",size,width,(int)weight);
        String ChainE = String.format("Name: %s%n   Auflösung %d x %d Pixel%n   Auflösung pro Auge: %d x %d Pixel%n   " +
        "Bildwiederholungfrequenz: %d Hz%n   Preis: %.2f€",hardware,pixelX,PixelY,pixelEyeX,pixelEyeY,monitorHz,prizeOculus);
        String ChainF = String.format("%d€ minus %d%s Rabatt",subtraction,discountInPercent,percent);

        System.out.println("a) "+chainA+"\n"+
                "b) "+chainB+"\n"+
                "c) "+ChainC+"\n"+
                "d) "+ChainD+"\n"+
                "e) "+ChainE+"\n"+
                "f) "+ChainF+"\n");

        System.out.printf("a) %s%nb) %s%nc) %s%nd) %s%ne) %s%nf) %s",chainA,chainB,ChainC,ChainD,ChainE,ChainF);


    }
}
