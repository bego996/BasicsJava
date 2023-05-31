package JavaInselBuch.CaptainCao.capture1_4_Imperativ_Arrays_Objekte;

public class FlametrowerAndEstinguisherHTML {
    public static void main(String[] args) {
        htmlHead();
        tableHeader();
        detailHeader("10","Flamethrower","Fire extinguisher");
        dataMiddel(10,500,100);
        tableFeet();
        htmlFeet();
    }
        static void detailHeader(String quantity,String object1,String object2){
            System.out.printf("<tr><th>%s<th/><th>%s<th/><th>%s<th/></tr>%n",quantity,object1,object2);
        }
        static void dataMiddel(int amountTotal,int objekt1Cost,int object2Cost){
            for (int i = 1; i <= amountTotal ; i++) {
                System.out.printf("<tr><td>%d<td/><td>%d<td/><td>%d<td/></tr>%n",i,objekt1Cost*i,object2Cost*i);
            }
        }
        static void tableHeader(){
            System.out.println("<table>");
        }
        static void tableFeet() {
            System.out.println("</table>");
        }
        static void htmlHead(){
            System.out.println("<html>");
        }
        static void htmlFeet(){
            System.out.println("</html>");
        }
}
