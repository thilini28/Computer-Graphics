import javax.swing.*;
import java.awt.*;

public class Bus extends JFrame
{
	public Bus()
	{
		setTitle("Bus");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
				
		//body
		g.setColor(Color.BLUE);
		g.fillRoundRect(95,100,178,100,20,20);
		
		//title
		g.setColor(Color.WHITE);
		g.drawString("Vavuniya Campus",135,115);
		
		//window
		g.setColor(Color.YELLOW);
		g.fillRect(120,125,26,10);
		g.fillRect(154,125,26,10);
		g.fillRect(190,125,26,10);
		g.fillRect(226,125,26,10);
		
		//doors
		g.setColor(Color.PINK);
		g.fillRect(120,150,26,50);
		g.fillRect(226,150,26,50);
		
		//Tyers
		g.setColor(Color.BLACK);
	    g.fillArc(110,185,30,30,0,-180);
	    g.fillArc(141,185,30,30,0,-180);
	    g.fillArc(200,185,30,30,0,-180);
	    g.fillArc(231,185,30,30,0,-180);
	}
	
	public static void main(String args[])
	{
		new Bus(); 
	}
}