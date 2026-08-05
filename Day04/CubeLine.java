import javax.swing.*;
import java.awt.*;

public class CubeLine extends JFrame
{
	public CubeLine()
	{
		setTitle("Cube Line");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
				
		g.setColor(Color.BLUE);
		//1st squre behind
		g.drawRect(100,100,80,80);
		//2nd squre front
		g.drawRect(130,130,80,80);
		
		g.drawLine(100,100,130,130);
		g.drawLine(180,100,210,130);
		g.drawLine(100,180,130,210);
		g.drawLine(180,180,210,210);		
	}
	
	public static void main(String args[])
	{
		new CubeLine(); 
	}
}