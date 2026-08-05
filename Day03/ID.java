import javax.swing.*;
import java.awt.*;

public class ID extends JFrame
{
	public ID()
	{
		setTitle("ID");
		setSize(700,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		super.paint(g);

		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(6));

		// Main card
		g.setColor(Color.BLACK);
		g.drawRect(100,100,470,180);
		
		g.setColor(Color.GRAY);
		g.fillRect(100,100,470,180);


		// Title
		g.setColor(Color.BLUE);
		g.setFont(new Font("Arial",Font.BOLD,27));
		g.drawString("UNIVERSITY ID",240,130);

		// Details
		g.setColor(Color.BLACK);
		g.setFont(new Font("Arial",Font.BOLD,19));

		g.drawString("Name: Madumitha",110,160);
		g.drawString("Year: 2",110,190);
		g.drawString("University: University of Vavuniya",110,220);

		// Photo box
		g.setColor(Color.BLACK);
		g.drawRect(463,115,90,90);
		
		g.setColor(Color.WHITE);
		g.fillRect(463,115,90,90);

		g.setColor(Color.BLACK);
		g.setFont(new Font("Arial",Font.BOLD,14));
		g.drawString("PHOTO",483,163);
	}

	public static void main(String args[])
	{
		new ID();
	}
}