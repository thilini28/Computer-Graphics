import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //Imports event handling classes

public class MouseDemo extends JFrame implements MouseListener
//this class become a window can handle mouse events
{
	public MouseDemo()
	{
		setTitle("MouseDemo");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
		//Attaches mouse listener to this window
		//So Java will listen for mouse actions here 
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g); //very important
				
		g.drawString("Click Anywhere",150,150);		
	}
	
	public void mouseClicked(MouseEvent e) //This method runs when mouse is clicked
	//e is an object of MouseEvent
	{
		System.out.println("Clicked at: " + e.getX() + "," + e.getY());
	}
	
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {} 
	
	//These are mandatory because of MouseListener interface but now we keep as empty
	public static void main(String args[])
	{
		new MouseDemo(); 
	}
}