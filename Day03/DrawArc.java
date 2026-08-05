import javax.swing.*;
import java.awt.*;

public class DrawArc extends JFrame
{
	public DrawArc()
	{
		setTitle("Arc");
		setSize(700,500);
		setLocationRelativeTo(null); //place the JFrame at the center of the screen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.RED);
        g.drawArc(170,70,150,150,0,-90); //(x,y,width,height, start_angle,) are with no fill
		g.fillArc(170,70,150,150,0,-90); //(x,y,width,height, start_angle,) are with fill
		
		g.setColor(Color.GREEN);
		g.drawArc(200,100,200,200,0,180);
		g.fillArc(200,100,200,200,0,180);
		//g.fillArc(200,100,200,200,0,-180);		
	}
	
	public static void main(String args[])
	{
		new DrawArc(); //creating object but not store
		//DrawArc frame=new DrawArc(); //creating object with name frame
	}
}


//positive angle - anticlockwise
//negative angle - clockwise