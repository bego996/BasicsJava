package JavaInselBuch.CaptainCao.capture6_EigeneKlassenSchreiben;


import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.TimerTask;

public class FreeDiskspaceTimerTask extends TimerTask {
    long freeDiskSpace = java.io.File.listRoots()[0].getFreeSpace();
    long refreshedFreeDiskSpace;

    @Override
    public void run() {
        refreshedFreeDiskSpace = java.io.File.listRoots()[0].getFreeSpace();
        if (freeDiskSpace < refreshedFreeDiskSpace) {
            System.out.println("Es wurde Speicher verwendet!\nAktuellerStand : " + freeDiskSpace);
            try {
                String url = "https://cdn4.iconfinder.com/data/icons/common-toolbar/36/save-16.png";
                ImageIcon icon = new ImageIcon(new URL(url));
                TrayIcon trayIcon = new TrayIcon(icon.getImage());
                SystemTray.getSystemTray().add(trayIcon);
                trayIcon.displayMessage("Achtung", "Platte voll", TrayIcon.MessageType.INFO);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        freeDiskSpace = refreshedFreeDiskSpace;
    }
}


