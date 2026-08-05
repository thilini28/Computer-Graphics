import javax.swing.*;
import java.awt.*;

public class DrawRoundRectangle extends JFrame
{
	public DrawRoundRectangle()
	{
		setTitle("Round Rectangle");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.RED);
		//g.fillRoundRect(x,y,width,height,arcwidth,arcHeight);
		
		g.drawRoundRect(100,100,150,80,60,60);
		
		//arcWidth=hw much left-right curve at the corner
		//arcHeight=hw much up-down curve at the corner
	}
	
	public static void main(String args[])
	{
		new DrawRoundRectangle(); 
	}
}