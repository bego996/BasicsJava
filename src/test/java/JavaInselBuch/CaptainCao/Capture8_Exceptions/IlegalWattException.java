package JavaInselBuch.CaptainCao.Capture8_Exceptions;

public class IlegalWattException extends RuntimeException {
    public IlegalWattException(String format,Object... args){
        super(String.format(format, args));
    }
    public IlegalWattException(){}
}
