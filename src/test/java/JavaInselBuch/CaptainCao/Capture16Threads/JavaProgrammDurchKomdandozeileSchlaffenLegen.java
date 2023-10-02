package JavaInselBuch.CaptainCao.Capture16Threads;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaProgrammDurchKomdandozeileSchlaffenLegen {
    public static void main(String[] args) {
        try {
            String input = new Scanner(System.in).nextLine();
            sleep(input);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleep(String command) throws InterruptedException, IllegalArgumentException {
        if (command == null || command.isEmpty()) {
            System.exit(150);
        }
        long convertToMillis = 0;
        Pattern pattern = Pattern.compile("^(\\$ java Sleep \\d+)$|^(\\$ java Sleep ((\\d+m|\\d+h|\\d+s|\\d+d)\\s*){1,4})$");
        Matcher matcher = pattern.matcher(command);
        Pattern pattern2 = Pattern.compile("(\\d)+$|(\\d+[mhsd]\\s*)");
        Matcher matcher2 = pattern2.matcher(command);
        if (!matcher.find()) {
            return;
        }
        while (matcher2.find()) {
            System.out.println(matcher2.group() + " Thread Schlaffzeit");
            if (matcher2.group().matches("\\d+$")) {
                convertToMillis += Long.parseLong(matcher2.group()) * 1000;
            } else if (matcher2.group().contains("s")) {
                convertToMillis += Long.parseLong(matcher2.group().substring(0, matcher2.group().indexOf("s"))) * 1000;
            } else if (matcher2.group().contains("d")) {
                convertToMillis += Long.parseLong(matcher2.group().substring(0, matcher2.group().indexOf("d"))) * 86_400_000;
            } else if (matcher2.group().contains("m")) {
                convertToMillis += Long.parseLong(matcher2.group().substring(0, matcher2.group().indexOf("m"))) * 60_000;
            } else if (matcher2.group().contains("h")) {
                convertToMillis += Long.parseLong(matcher2.group().substring(0, matcher2.group().indexOf("h"))) * 3_600_000;
            }
        }
        Thread.sleep(convertToMillis);
        System.out.println("Thread Schlaffzeit vorbei!");
    }
}
