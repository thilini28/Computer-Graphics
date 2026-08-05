import javax.swing.*;
import java.awt.*;

public class DrawPolygon extends JFrame
{
	//
	public DrawPolygon()
	{
		setTitle("Polygon");
		setSize(700,500);
		setLocationRelativeTo(null); //place the JFrame at the center of the screen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.red);
		
		int x[]={200,100,300};
		int y[]={100,300,300};
		
		//g.dreaPolygon(xPoints,yPoints,numberofPoints);
		
		g.setColor(Color.ORANGE);
		g.fillPolygon(x,y,3);
	}
	
	public static void main(String args[])
	{
		new DrawPolygon(); //creating object but not store
		//DrawPolgon frame=new DrawPolgon(); //creating object with name frame
	}
}

