package JavaInselBuch.CaptainCao.Capture8_Exceptions;

public class IlegalWattException extends RuntimeException {
    public IlegalWattException(String message){
        System.out.println(message);
    }
    public IlegalWattException(){}
}
