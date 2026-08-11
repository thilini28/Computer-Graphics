import javax.swing.*; 
import java.awt.*; 

public class PentagonDDA extends JFrame 
{
	public PentagonDDA()
	{
		setTitle("PentagonDDA");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.BLACK);

        // Coordinates for pentagon vertices
		int xPoints[] ={200,300,400,350,250};
		int yPoints[] ={200,75,200,300,300};
		
		// Draw pentagon using DDA line algorithm
		for(int i=0; i<xPoints.length; i++)
		{
			drawline(g,xPoints[i],yPoints[i],xPoints[(i+1)%xPoints.length],yPoints[(i+1)%yPoints.length]);
		}			
	}
	
	public void drawline(Graphics g,int x1,int y1,int x2,int y2)
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
			g.drawRect(Math.round(x),Math.round(y),1,1); 
			//g.drawLine(Math.round(x),Math.round(y),Math.round(x),Math.round(y));
			x += xInc;
			y += yInc;
		}		
	}	
	
	public static void main(String args[])
	{
		new PentagonDDA();
	}
}