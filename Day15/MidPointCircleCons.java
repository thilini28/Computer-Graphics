import java.awt.*;
import javax.swing.*;

public class MidPointCircleCons extends JFrame
{	
    private int xc,yc,r; //private mean only can access within the class 
	
	public MidPointCircleCons(int xcenter,int ycenter,int r) 
	{		
	    this.xc = xcenter; 
		this.yc = ycenter;
		this.r = r;
	
		setTitle("MidPoint Circle Algorithm");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);						
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
		new MidPointCircleCons(200,200,100);
	}
}

