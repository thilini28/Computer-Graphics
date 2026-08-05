import javax.swing.*;
import java.awt.*;

public class DrawLine extends JFrame
{
	public DrawLine()
	{
		setTitle("DrawLine");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.GREEN);
		g.drawLine(50,50,300,300);
		//g.drawLine(x1,y1,x2,y2);
	}
	
	public static void main(String args[])
	{
		DrawLine frame=new DrawLine();
	}
}