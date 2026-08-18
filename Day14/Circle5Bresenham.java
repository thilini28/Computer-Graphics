import javax.swing.*; 
import java.awt.*; 

public class Circle5Bresenham extends JFrame 
{
	public Circle5Bresenham() 
	{
		setTitle("5 Circles");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		int xc=300,yc=300;
	    int r=40;
		
		for(int i=0; i<5; i++)
		{
		    drawBresenhamCircle(g,xc,yc,i*r+30);	
		}
	}
	
	public void drawBresenhamCircle(Graphics g,int xc,int yc,int r)
	{	 		  
		int x=0;
		int y=r;
		
		int d=3-(2*r);
	
	    //draws only the first octant (45° of the circle).
		while(x<=y) //x is greter stop
		{						
		    plotPoints(g,xc,yc,x,y);

			if(d<0)
			{
				d = d+(4*x)+6;
			}
			else{
				d= d+4*(x-y)+10;
				y--;
			}
			x++;
		}						
	}	
	
	public void plotPoints(Graphics g,int xc,int yc,int x,int y)
	{
		//plotting all 8 octants
		g.fillRect(xc+x,yc+y,3,3);
		g.fillRect(xc+y,yc+x,3,3);
			
		g.fillRect(xc-x,yc+y,3,3);
		g.fillRect(xc+y,yc-x,3,3);
					  
		g.fillRect(xc-x,yc-y,3,3);
		g.fillRect(xc-y,yc-x,3,3);
			
	    g.fillRect(xc+x,yc-y,3,3);
		g.fillRect(xc-y,yc+x,3,3);
	}
	
	public static void main(String args[])
	{
		new Circle5Bresenham();
	}
}



