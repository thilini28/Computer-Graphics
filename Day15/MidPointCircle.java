import java.awt.*;
import javax.swing.*;

public class MidPointCircle extends JFrame
{	
	public MidPointCircle()
	{		
		setTitle("MidPoint Circle Algorithm");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		int xc=200;
		int yc=200;
		int r=100;
		
		drawMidpointCircle(g, xc, yc, r);		
	}
	
	public void drawMidpointCircle(Graphics g, int xc, int yc, int r)
	{
		int x=0;
		int y=r;
		int d=1-r;
		
		while(x<=y)
		{
			plotPoints(g, xc, yc, x, y);

			if(d<0)
			{
				d=d+(2*x)+3;
			}
			else
			{
				d=d+(2*(x-y))+5;
				y--;
			}
			x++;
		}
	}
	
	public void plotPoints(Graphics g, int xc, int yc, int x, int y)
	{
		g.fillRect(xc+x,yc+y,1,1);
		g.fillRect(xc+y,yc+x,1,1);
			
		g.fillRect(xc-x,yc+y,1,1);
		g.fillRect(xc+y,yc-x,1,1);
					  
		g.fillRect(xc-x,yc-y,1,1);
		g.fillRect(xc-y,yc-x,1,1);
			
	    g.fillRect(xc+x,yc-y,1,1);
		g.fillRect(xc-y,yc+x,1,1);
	}
	
	public static void main(String []args)
	{
		new MidPointCircle();
	}
}

/* 0 (0,10) 1-10=-9         (1,10)
   1 (1,10) -9+2*0+3=-6     (2,10)
   2 (2,10) -6+2*1+3=-1     (3,10)
   3 (3,10) -1+2*2+3=6      (4,9)
   4 (4,9)  6+2*(3-10)+5=-3 (5,9)
   5 (5,9)  -3+2*4+3=8      (6,8)
   6 (6,8)  8+2*(5-9)+5=5   (7,7)
   7 (7,7)   */