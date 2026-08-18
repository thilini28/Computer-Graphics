import javax.swing.*; 
import java.awt.*; 

public class SnowMan extends JFrame 
{
	public SnowMan() 
	{
		setTitle("SnowMan");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		int xc=250,yc=300; //Center of the face
		
		//Body - Large
		int LargeR=50;
        drawBresenhamCircle(g,xc,yc,LargeR);	
		
		//Medium - Torse
		int MediumR=35;
		int TorseOffsetY=100;
        drawBresenhamCircle(g,xc,yc-TorseOffsetY,MediumR);	
		
		//Small - Head
		int SamllR=25;
		int HeadOffsetY=170;
        drawBresenhamCircle(g,xc,yc-HeadOffsetY,SamllR);	
		
		//Eyes
		int EyesR=5;
		int EyeOffsetX=10,EyeOffsetY=10;
		//left eye
        drawBresenhamCircle(g,xc-EyeOffsetX,yc-HeadOffsetY-EyeOffsetY,EyesR);	
		//Right eye
        drawBresenhamCircle(g,xc+EyeOffsetX,yc-HeadOffsetY-EyeOffsetY,EyesR);	
		
	    //nose		
		int[] x={xc,xc,xc+10};
		int[] y={yc-HeadOffsetY,yc-HeadOffsetY+10,yc-HeadOffsetY+5};
		
		for(int i=0; i<x.length; i++)
		{
			BresenhamLine(g,x[i],y[i],x[(i+1)%x.length],y[(i+1)%y.length]);
		}
	}
	
	public void drawBresenhamCircle(Graphics g,int xc,int yc,int r)
	{	 		  
		int x=0;
		int y=r;
		
		int d=3-(2*r);
	
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
		g.fillRect(xc+x,yc+y,2,2);
		g.fillRect(xc+y,yc+x,2,2);
			
		g.fillRect(xc+x,yc-y,2,2);
		g.fillRect(xc-y,yc+x,2,2);

		g.fillRect(xc-x,yc-y,2,2);
		g.fillRect(xc-y,yc-x,2,2);
		
		g.fillRect(xc-x,yc+y,2,2);
		g.fillRect(xc+y,yc-x,2,2);
	}
	
	public void BresenhamLine(Graphics g,int x1,int y1,int x2,int y2)
	{
		int dx=Math.abs(x2-x1);
		int dy=Math.abs(y2-y1);
		
		int incX = (x1<x2) ? 1:-1;
		int incY = (y1<y2) ? 1:-1;
		
		int err=dx-dy;
		
		while(true)
		{
			g.fillRect(x1,y1,2,2);
			
			if(x1==x2 && y1==y2)
			  break;
		  
		    int e2=2*err;
			
			if(e2 > -dy)
			{
				err = err - dy;
				x1+=incX;
			}
			
			if(e2 < dx)
			{
				err = err + dx;
				y1+=incY;
			}
		}		
	}
	
	public static void main(String args[])
	{
		new SnowMan();
	}
}



