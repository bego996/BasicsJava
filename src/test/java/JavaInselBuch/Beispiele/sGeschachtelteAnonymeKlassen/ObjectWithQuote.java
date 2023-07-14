package JavaInselBuch.Beispiele.sGeschachtelteAnonymeKlassen;

public class ObjectWithQuote {
  public static void main( String[] args ) {
    //Eine anonyme klasse kann operationen aus schnittstellen implementieren , Oberklasse Methoden überschreiben und neue eigenschaften anbieten.

    //Hier erstellen wir eine anonyme Klasse und nutzen Object() als oberklasse.
    String s = new Object() {
      String quote( String s ) {
        return String.format( "'%s'", s );
      }
    }
    //mit .quote können wir erst die Methode aufrufen, ohne diesen aufrugf ist die methode unsichtbar weil die klasse anonym ist.
    .quote( "Cora" );
    System.out.println( s );  // 'Cora'
  }
}

