import javax.swing.*;
import java.awt.*;

public class StarBresenham extends JFrame
{
	public StarBresenham()
	{
		setTitle("Star");
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.red);	 	
		 
		int x[]={100,230,130,165,200};
		int y[]={100,100,200,50,200};
		 
		for(int i=0; i<x.length; i++)
		{
           drawbresenham(g,x[i],y[i],x[(i+1)%x.length],y[(i+1)%y.length]);
		}
	}
	
	public void drawbresenham(Graphics g,int x1,int y1,int x2,int y2)
	{
		int dx=Math.abs(x2-x1);
		int dy=Math.abs(y2-y1);
		
		int incX=(x1<x2) ? 1:-1;
		int incY=(y1<y2) ? 1:-1;
		
		int err=dx-dy;
		
		while(true)
		{
			g.drawRect(x1,y1,2,2);
			if(x1==x2 && y1==y2)
				break;
			
			int e2=2*err;
			
			if(e2>-dy)
			{
				err=err-dy;
				x1+=incX;
			}
			
			if(e2<dx)
			{
				err=err+dx;
				y1+=incY;
			}
		}
	}		 
	 
	public static void main(String args[])
	{
		new StarBresenham();		 
	}		 	
}