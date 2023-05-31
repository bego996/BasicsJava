package JavaInselBuch.CaptainCao.capture1_4_Imperativ_Arrays_Objekte;

public class ObjektOrientierung01 {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("Bego",75,1.78F,"Haselnussbraun");
        System.out.println("Er ist " + p1.getGrösse() + "cm gross.." );
        p2.gehen();
        System.out.println(p2.getHautFarbe());





    }
}
