import javax.swing.*;
import java.awt.*;

public class DrawHouse extends JFrame
{
	public DrawHouse()
	{
		setTitle("House");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}	
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		//house body
		g.setColor(Color.BLUE);
		g.fillRect(125,200,200,100);
		
		//door
		g.setColor(Color.GREEN);
		g.fillRect(180,250,40,45);
		
		//window
		g.setColor(Color.RED);
		g.fillRect(200,220,30,10);
		g.fillRect(260,220,30,10);
		
		//roof
		g.setColor(Color.RED);
		g.drawLine(100, 210, 225, 150);
        g.drawLine(225, 150, 350, 210);
	}

	public static void main(String args[])
	{
		DrawHouse frame=new DrawHouse();
	}
}

        /* int[] xPoints = {120,180,250};
		int[] yPoints = {210,150,210};
		g.drawPolygon(xPoints,yPoints,3); */