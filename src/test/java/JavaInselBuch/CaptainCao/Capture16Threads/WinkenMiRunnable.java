package JavaInselBuch.CaptainCao.Capture16Threads;

import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class WinkenMiRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Winken " + Thread.currentThread());
        }
    }
}
