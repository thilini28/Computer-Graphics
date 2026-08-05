import javax.swing.*;
import java.awt.*;

public class Rectangle extends JFrame
{
	public Rectangle()
	{
		setTitle("Rectangle Drawing");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	//for shape
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.BLUE);
		g.drawRect(50,50,200,100);
		// x1,y1,width,height
		g.setColor(Color.RED);
		g.fillRect(50,50,100,50);
	}	
	
	public static void main(String args[])
	{
		Rectangle frame=new Rectangle();
	}
}