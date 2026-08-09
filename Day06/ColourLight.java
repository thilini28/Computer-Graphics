import javax.swing.*;
import java.awt.*;

public class ColourLight extends JFrame
{
	public ColourLight()
	{
		setTitle("Colour Light");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.BLACK);
		g.fillRoundRect(200,100,60,150,20,20);
		g.fillRect(220,250,20,100);
		
		g.setColor(Color.RED);
		g.fillArc(215,110,30,30,0,360);
		
		g.setColor(Color.YELLOW);
		g.fillArc(215,155,30,30,0,360);
		
		g.setColor(Color.GREEN);
		g.fillArc(215,200,30,30,0,360);
	}
	
	public static void main(String args[])
	{
		new ColourLight();
	}
}

