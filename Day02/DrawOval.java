import javax.swing.*;
import java.awt.*;

public class DrawOval extends JFrame
{
	public DrawOval()
	{
		setTitle("Oval");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.RED);
		g.drawOval(100,100,150,150);	//x,y,width,height	
	}
	
	public static void main(String[] args)
	{
		DrawOval frame = new DrawOval();
	}
}