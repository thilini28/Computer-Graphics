import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CircleDemo extends JFrame implements MouseListener
{
	Graphics g;
	public CircleDemo()
	{
		setSize(600,600);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
		setLocationRelativeTo(null);
		setVisible(true);
		g=getGraphics();
	}
	
	public void mouseClicked(MouseEvent e)
	{
		g.setColor(Color.RED);
		g.drawOval(e.getX(),e.getY(),100,100);//start point,width,height
		//g.fillOval(e.getX(),e.getY(),100,100);
	}
	
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	
	public static void main(String args[])
	{
		new CircleDemo();
	}
}