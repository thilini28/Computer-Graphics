import javax.swing.*;
import java.awt.*;

public class DrawPentagon extends JFrame
{
	//
	public DrawPentagon()
	{
		setTitle("Pentagon");
		setSize(700,500);
		setLocationRelativeTo(null); //place the JFrame at the center of the screen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.red);
		
		int x[]={200,275,250,150,125};
		int y[]={200,270,350,350,270};
		
		//g.dreaPolygon(xPoints,yPoints,numberofPoints);
		
		g.setColor(Color.ORANGE);
		g.fillPolygon(x,y,5);
	}
	
	public static void main(String args[])
	{
		new DrawPentagon(); //creating object but not store
		//DrawPolgon frame=new DrawPolgon(); //creating object with name frame
	}
}

