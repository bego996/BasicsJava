package JavaInselBuch.CaptainCao.Capture16Threads;

import java.util.concurrent.TimeUnit;

public class WinkenUndFahneRunnableParametrisieren {
    public static void main(String[] args) {
        class WinkerOrFlagWaver implements Runnable{
            private final int repeats;
            private final String name;
            public WinkerOrFlagWaver(int repeats, String name) {
                this.repeats = repeats;
                this.name = name;
            }
            @Override
            public void run() {
                for (int i = 0; i < repeats ; i++) {
                    System.out.printf("%s; %s%n",name,Thread.currentThread());
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        Runnable winker = new WinkerOrFlagWaver(10,"Left Hand Wink");
        Runnable flagWaver = new WinkerOrFlagWaver(30,"Right Hand Flager");
        Thread thread = new Thread(winker);
        Thread thread2 = new Thread(flagWaver);
        thread.start();
        thread2.start();
    }
}
