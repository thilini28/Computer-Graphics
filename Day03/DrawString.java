import javax.swing.*;
import java.awt.*;

public class DrawString extends JFrame
{
	public DrawString()
	{
		setTitle("Stirng");
		setSize(700,500);
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
	    g.setColor(Color.RED);
		g.setFont(new Font("Arial",Font.BOLD,35));
		g.drawString("Hello Students!", 200, 200); //text,x,y
		//x,y for string =starting point of text,not center, text starting from the ponit and go right
	}
	
	public static void main(String args[])
	{
		new DrawString(); //creating object but not store
		//DrawPolgon frame=new DrawPolgon(); //creating object with name frame
	}
}

