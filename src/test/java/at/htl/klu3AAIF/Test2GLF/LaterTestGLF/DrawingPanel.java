package at.htl.klu3AAIF.Test2GLF.LaterTestGLF;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class DrawingPanel extends JPanel implements MouseListener, MouseMotionListener {

    int mouseX;
    int mouseY;
    Rectangle rect;
    public DrawingPanel(){
        setBackground(Color.green);
        addMouseListener(this);
        addMouseMotionListener(this);
        setPreferredSize(new Dimension(600,600));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        int width = getWidth();
        int height = getHeight();

        int circleWidth = width-100;
        int circleHeight = height-100;

        double rectWidth = circleWidth * 0.80;
        double rectHeight = rectWidth/4;

        g.setColor(Color.white);
        g.fillOval(50,50,width-100,height-100);
        g.setColor(Color.red);
        g.fillOval(65,65,width-130,height-130);
        g.setColor(Color.white);
        g.fillRect((int)(width/2 - rectWidth/2), (int)(height/2 - rectHeight/2),(int) rectWidth,(int)rectHeight);
        if (rect == null) {
            rect = new Rectangle((int) (width / 2 - rectWidth / 2), (int) (height / 2 - rectHeight / 2), (int) rectWidth, (int) rectHeight);
        }





    }
    public static boolean isRectClicked(Rectangle rect,int x,int y){return (x >= rect.x && x <= rect.x+rect.width) && (y >= rect.y && y <= rect.y+rect.height);}

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
        if (isRectClicked(rect,mouseX,mouseY)){
            JOptionPane.showMessageDialog(null,"Verboten!");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.printf("%d|%d%n",e.getX(),e.getY());
    }
}
