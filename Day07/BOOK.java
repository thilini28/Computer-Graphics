import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class book extends JFrame implements MouseListener
{
	Graphics g;
	public book()
	{
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
		setLocationRelativeTo(null);
		setVisible(true);
		g=getGraphics();
	}
	
	public void mouseClicked(MouseEvent e)
	{
		g.setColor(Color.RED);
		int x=e.getX();
		int y=e.getY();
		
		//B
		g.drawLine(x,y,x,y+100);
		g.drawLine(x,y,x+50,y);
		g.drawLine(x,y+50,x+50,y+50);
		g.drawLine(x,y+100,x+50,y+100);
		g.drawArc(x+30,y,35,50,90,-180);
		g.drawArc(x+30,y+50,35,50,90,-180);
		
		//two O
		g.drawOval(x+75,y,60,100);
		g.drawOval(x+145,y,60,100);
		
		//K
		g.drawLine(x+225,y,x+225,y+100);
		g.drawLine(x+225,y+50,x+280,y);		
		g.drawLine(x+225,y+50,x+280,y+100);		
	}
	
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	
	public static void main(String args[])
	{
		new book();
	}
}