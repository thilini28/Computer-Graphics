import javax.swing.*; 
import java.awt.*; 

public class TriangleBresenham extends JFrame 
{
	public TriangleBresenham() 
	{
		setTitle("Triangle");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.red);
		drawbresenham(g,100,150,150,250);
		drawbresenham(g,150,250,50,250);
		drawbresenham(g,50,250,100,150);
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
		new TriangleBresenham();
	}
}