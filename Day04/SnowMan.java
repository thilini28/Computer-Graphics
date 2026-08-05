import javax.swing.*;
import java.awt.*;

public class SnowMan extends JFrame
{
	public SnowMan()
	{
		setTitle("SnowMan");
		setSize(700,500);
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		//Hat
		g.setColor(Color.BLUE);
		g.fillRect(101,111,58,85);
		g.fillRect(95,191,70,8);
		
		//Face
		g.setColor(Color.YELLOW);
		g.fillOval(95,200,70,70);
		
		//Eyes
		g.setColor(Color.BLACK);
		g.fillOval(110,220,10,10);
		g.fillOval(140,220,10,10);
		
		//Body
		g.setColor(Color.GREEN);
		g.fillOval(92,270,80,90);
		
		//Mouth
		g.setColor(Color.RED);
		g.fillArc(112,233,37,20,0,-180);
		
		//Hands
		g.drawLine(115,290,60,270);
		g.drawLine(146,290,201,270);
		
	}
	
	public static void main(String args[])
	{
		new SnowMan(); 
	}
}