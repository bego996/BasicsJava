package at.htl.klu3AAIF.Uebung5Arrays;


public class Task1 {
    public static void main(String[] args) {
        int [] randomCube = HTLUtilities.getRandomArray(1000,1,6);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < randomCube.length ; i++) {
            if (randomCube[i] == 6) {
                System.out.println("6 rolls on " + (i+1));
                break;
            }
        }
        for (int i = randomCube.length-901; i >= 0 ; i--) {
            if (randomCube[i] == 6) {
                System.out.println("6 rolls on " + (i+1));
                break;
            }
        }
        for (int i = 0; i < randomCube.length-900 ; i++) {
            sb.append(randomCube[i]).append(i < randomCube.length-901 ? ",": "");
        }
        System.out.println(sb);
    }
}
