package JavaInselBuch.CaptainCao.capture6_EigeneKlassenSchreiben;

import java.util.Timer;
import java.io.File;

public class TestNeu {
    public static void main(String[] args) {
            System.out.println(java.io.File.listRoots()[0].getFreeSpace());
            Timer timer = new Timer();
            FreeDiskspaceTimerTask underclass = new FreeDiskspaceTimerTask();
            timer.scheduleAtFixedRate(underclass,0,2000);
    }
}
