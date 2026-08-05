import javax.swing.*;
import java.awt.*;

public class LoveDrawing extends JFrame
{
	public LoveDrawing()
	{
		setTitle("Love");
		setSize(700,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.BLACK);
		
		Graphics2D g2=(Graphics2D)g;
		g2.setStroke(new BasicStroke(3));
		//L
		g.drawLine(50,50,50,200);
		g.drawLine(50,200,100,200);
		
		//O
		g.drawOval(150,50,80,150);	
		
		//V
		g.drawLine(310,50,350,200);
		g.drawLine(350,200,390,50);
		
		//E
		g.drawLine(440,50,500,50);
		g.drawLine(440,50,440,200);
		g.drawLine(440,200,500,200);
		g.drawLine(440,125,490,125);
	}
	
	public static void main(String[] args)
	{
		LoveDrawing frame = new LoveDrawing();
	}
}