import javax.swing.*;
import java.awt.*;

public class KiteBresenham extends JFrame
{
	public KiteBresenham()
	{
		setTitle("Kite");
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{			
        //Square	 	
		int xTop=200,yTop=100;
        int xRight=250,yRight=200;		
        int xBottom=200,yBottom=300;		
        int xLeft=150,yLeft=200;

        drawbresenham(g,xTop,yTop,xRight,yRight);		
        drawbresenham(g,xRight,yRight,xBottom,yBottom);		
        drawbresenham(g,xBottom,yBottom,xLeft,yLeft);		
        drawbresenham(g,xLeft,yLeft,xTop,yTop);		
		
		//Cross Lines
        drawbresenham(g,xTop,yTop,xBottom,yBottom);		
        drawbresenham(g,xLeft,yLeft,xRight,yRight);		
		
		//Tail
        drawbresenham(g,xBottom,yBottom,300,450);		
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
		new KiteBresenham();		 
	}		 	
}