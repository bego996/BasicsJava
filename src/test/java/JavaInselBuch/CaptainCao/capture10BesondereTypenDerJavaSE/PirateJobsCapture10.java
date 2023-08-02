package JavaInselBuch.CaptainCao.capture10BesondereTypenDerJavaSE;

//tag::solution[]
interface Job {
}

enum EssentialJob implements Job {
  CAPTAIN, QUARTERMASTER, SAILINGMASTER, BOATSWAIN,
  SURGEON, CARPENTER, MASTER_GUNNER
}

enum NonEssentialJob implements Job {
  MATE, ABLE_BODIED_SAILOR, CABIN_BOY
}

public class PirateJobsCapture10 {

  public static <JOB extends Enum<JOB> & Job> void apply( JOB job ) {
    System.out.println( job.name() );
    System.out.println( job == EssentialJob.BOATSWAIN );
  }

  public static void main( String[] args ) {
    apply( EssentialJob.BOATSWAIN );
    apply( NonEssentialJob.CABIN_BOY );
//    apply( new Job(){} );
  }
}
//end::solution[]
