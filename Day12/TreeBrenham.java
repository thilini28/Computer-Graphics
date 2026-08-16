import javax.swing.*; 
import java.awt.*; 

public class TreeBrenham extends JFrame 
{
	public TreeBrenham() 
	{
		setTitle("Tree");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		//traingle
		drawbresenham(g,200,100,250,200);
		drawbresenham(g,250,200,150,200);
		drawbresenham(g,150,200,200,100);
		 
		//line
		drawbresenham(g,200,200,200,300);
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
		new TreeBrenham();
	}
}