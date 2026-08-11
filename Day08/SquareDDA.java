import javax.swing.*; 
import java.awt.*; 

public class SquareDDA extends JFrame 
{
	public SquareDDA()
	{
		setTitle("Square");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.BLACK);
		
		int x1=100,x2=200;
		int y1=100,y2=100;
		int x3=200,y3=200;
		int x4=100,y4=200;
		
		darwline(g,x1,y1,x2,y2);		
		darwline(g,x2,y2,x3,y3);		
		darwline(g,x3,y3,x4,y4);		
		darwline(g,x4,y4,x1,y1);		
	}
	
	public void darwline(Graphics g,int x1,int y1,int x2,int y2)
	{		
		int dx=x2-x1; 
		int dy=y2-y1; 
		
		int steps; 
		
		if(Math.abs(dx) > Math.abs(dy))
		{
			steps = Math.abs(dx);
		}
		else{
			steps = Math.abs(dy);
		}				
		
		float xInc = dx/(float)steps;
		float yInc = dy/(float)steps;
		
		float x=x1;
		float y=y1;		
		
		for(int i=0; i<=steps; i++)
		{
			//g.fillRect(Math.round(x),Math.round(y),1,1); //
			g.drawLine(Math.round(x),Math.round(y),Math.round(x),Math.round(y));
			x += xInc;
			y += yInc;
		}
	}
	
	public static void main(String args[])
	{
		new SquareDDA();
	}
}