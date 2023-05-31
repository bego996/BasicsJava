package at.htl.klu3AAIF.MethodenUebung1;

public class SimplePrint {
    public static void main(String[] args) {
        String message = "Hi";
        int count = 5;
        byte number = 10;
        Message(message);
        Message(message,count);
        Message(message,number);

    }
    public static void Message (String message){
        System.out.println(message);
    }
    public static void Message (String message,int count){
            for (int i = 0; i < count; i++) {
                Message(message);
            }
    }
    public static void Message (String message,byte number){

        Message(message + number);
    }
}

