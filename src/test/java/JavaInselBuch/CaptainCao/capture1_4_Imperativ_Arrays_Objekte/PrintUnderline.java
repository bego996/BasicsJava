package JavaInselBuch.CaptainCao.capture1_4_Imperativ_Arrays_Objekte;

public class PrintUnderline {

  public static void main( String[] args ) {
    String text = "There is more treasure in books than in all the pirate's loot on Treasure Island";
    printUnderline( text, "treasure" );
  }

  //tag::solution[]
  public static void printUnderline( String string, String search ) {
    System.out.println( string );

    string = string.toLowerCase();
    search = search.toLowerCase();

    String secondLine = "";
    for ( int index = 0;
          (index = string.indexOf( search, index )) >= 0;
          index += search.length() ) {

      secondLine += " ".repeat( index - secondLine.length()) + "-".repeat( search.length() );

    }
    System.out.println( secondLine );
  }

}
