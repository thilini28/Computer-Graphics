import javax.swing.*;
import java.awt.*;

public class Star extends JFrame
{
	public Star()
	{
		setTitle("Draw Star");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.CYAN);
		
		Graphics2D g2=(Graphics2D)g;
		g2.setStroke(new BasicStroke(5));
		
		g.drawLine(200,80,170,150);
		g.drawLine(170,150,100,150);
		g.drawLine(100,150,155,200);
		g.drawLine(155,200,130,270);
		g.drawLine(130,270,200,230);
		g.drawLine(200,230,270,270);
		g.drawLine(270,270,245,200);
		g.drawLine(245,200,300,150);
		g.drawLine(300,150,230,150);
		g.drawLine(230,150,200,80);
	}
	
	public static void main(String[] args)
	{
		Star frame = new Star();
	}
}