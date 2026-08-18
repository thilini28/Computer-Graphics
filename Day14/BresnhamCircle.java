import javax.swing.*; 
import java.awt.*; 

public class BresnhamCircle extends JFrame 
{
	public BresnhamCircle() 
	{
		setTitle("Bresenham Circle");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		//center of the circle
		int xc=300,yc=300;
	    int r=100;
		
		//draw circle using bresenham's algoritm
		drawBresenhamCircle(g,xc,yc,r);
	}
	
	public void drawBresenhamCircle(Graphics g,int xc,int yc,int r)
	{	 		  
		int x=0;
		int y=r;
		
        //initial decision parameter		
		int d=3-(2*r);
	
	    //draws only the first octant (45° of the circle).
		while(x<=y) //x is greter stop
		{			
			//plotting all 8 octants
		    plotPoints(g,xc,yc,x,y);
			
			//update the disition parameter based on its current value
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
	
	//ploting points in all octants based on symmetry
	public void plotPoints(Graphics g,int xc,int yc,int x,int y)
	{
		g.fillRect(xc+x,yc+y,2,2);//octant 1
		g.fillRect(xc+y,yc+x,2,2);//octant 2
			
		g.fillRect(xc+x,yc-y,2,2);//octant 3
		g.fillRect(xc-y,yc+x,2,2);//octant 4

		g.fillRect(xc-x,yc-y,2,2);//octant 5
		g.fillRect(xc-y,yc-x,2,2);//octant 6
		
		g.fillRect(xc-x,yc+y,2,2);//octant 7
		g.fillRect(xc+y,yc-x,2,2);//octant 8
	}
	
	public static void main(String args[])
	{
		new BresnhamCircle();
	}
}

/* d=3-2r
(0,10)
d=3-2*10=-17

(1,10)
d=d+4x+6
d=-17+4*0+6=-11

(2,10)
d=-11+4*1+6=-1

(3,10)
d=-1+4*2+6=13

(4,9)
d=d+4(x-y)+10=13+4(3-10)+10=-5

(5,9)
d=-5+4*4+6=17

(6,8)
d=17+4(5-9)+10=7

(7,7) */


