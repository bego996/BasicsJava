package JavaInselBuch.CaptainCao.Musterbeispiele;

public class WordWrap {

  //tag::solution[]
  public static final char SEPARATOR = ' ';

  public static String wrap( String string, int width ) {

    if ( string.length() <= width )
      return string;

    int breakIndex = string.lastIndexOf( SEPARATOR, width );
    if ( breakIndex == -1 )
      breakIndex = width;

    String firstLine = string.substring( 0, breakIndex );
    String remaining = wrap( string.substring( breakIndex ).trim(), width );

    return firstLine + "\n" + remaining;
  }
  //end::solution[]

  public static void main( String[] args ) {
    //tag::example[]
    String s =   "Wegen der kleinsten Problemchen, die teilweise nicht zu ändern sind, müssen diese Menschen immerzu meckern oder sich lautstark darüber aufregen. Passiert das zu oft, wird es anderen schnell zu viel. Auf Dauer fühlen sich die Gesprächspartner:innen meist hilflos und wissen nicht mehr, wie sie reagieren sollen, erklärt die Psychologin. Außerdem zieht die immerzu negative Einstellung der jeweiligen Person sie mit herunter. Sie können oft nicht nachvollziehen, warum jede Kleinigkeit den:die andere zur Weißglut bringt.";
    System.out.println( wrap( s, 30 ) );
    //end::example[]
  }
}