import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //Import event handling classes

public class drawLineMouseDemo extends JFrame implements MouseListener
{
	Graphics g; //pre define class, global variable
	public drawLineMouseDemo()
	{
		setTitle("Line");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
		setVisible(true);
		g = getGraphics();
	}
	
	public void mouseClicked(MouseEvent e) // this method runs when mouse is clicked
	{
		super.paint(g);
		g.setColor(Color.RED);
		g.drawLine(e.getX(),e.getY(),e.getX() + 100,e.getY());
		
		// g.drawLine(e.getX1(),e.getY1(),e.getX2()+100,e.getY2())
	    // if you want a slop line you should   
		//g.drawLine(e.getX(),e.getY(),e.getX()+100,e.getY()+100); \
	}
	
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
	public static void main(String[] args)
	{
		new drawLineMouseDemo();
	}
}