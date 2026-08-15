import javax.swing.*; 
import java.awt.*; 

public class Bresenham extends JFrame 
{
	public Bresenham() //constructor for frame. we are setting properties of frame or window
	{
		setTitle("Bresenham");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		int x1=100,x2=200;
		int y1=100,y2=200;
		
		drawbresenham(g,x1,y1,x2,y2);
	}
	
	public void drawbresenham(Graphics g,int x1,int y1,int x2,int y2)
	{		
		int dx=x2-x1; 
		int dy=y2-y1; 
		
		int x=x1;
		int y=y1;
		
		// initial decision parameter
		int d=(2*dy) - dx;
		
		//plot the inital point
		g.fillRect(x,y,2,2);
		
		//Bresenham's algorithm loop
		while(x<x2)
		{
			x++;
			if(d<0)
			{
				d = d+(2*dy);
			}
			else{
				y++;
				d= d+(2*dy)-(2*dx);
			}
			//plot the point
		    g.fillRect(x,y,2,2);
		}						
	}	
	
	public static void main(String args[])
	{
		new Bresenham();
	}
}