package JavaInselBuch.CaptainCao.Capture8_Exceptions;

public class Methods {
    public static int[] parseInts(String... numbers) {
        if (numbers.length == 1 && numbers[0] == null) {
            throw new NullPointerException("Null ist Nicht erlaubt!");
        }
        int[] convertedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            try {
                convertedNumbers[i] = Integer.parseInt(numbers[i]);
            } catch (NumberFormatException | NullPointerException e) {
                convertedNumbers[i] = 0;
            }

        }
        return convertedNumbers;
    }


    public static void main(String[] args) {
        String[] testString = {null};
        int[] convertedString = parseInts();
        for (int number:convertedString) {
            System.out.println(number);
        }
    }
}
