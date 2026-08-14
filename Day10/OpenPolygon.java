import javax.swing.*; 
import java.awt.*; 

public class OpenPolygon extends JFrame 
{
	public OpenPolygon()
	{
		setTitle("Open Polygon");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.BLACK);

		int xPoints[] ={100,200,240,130,120};
		int yPoints[] ={100,50,150,200,100};
		
		drawPolylineDDA(g,xPoints,yPoints);		
	}
	
	private void drawPolylineDDA(Graphics g, int xPoints[], int yPoints[])
	{
		for (int i=0; i<xPoints.length-1; i++)
		{
			drawLineDDA(g,xPoints[i],yPoints[i],xPoints[i+1],yPoints[i+1]);
		}	
	}
	
	public void drawLineDDA(Graphics g,int x1,int y1,int x2,int y2)
	{		
		int dx=x2-x1; 
		int dy=y2-y1; 
		
		int steps = Math.abs(dx) > Math.abs(dy) ? Math.abs(dx) : Math.abs(dy);
	
		float xInc = dx/(float)steps;
		float yInc = dy/(float)steps;
		
		float x=x1;
		float y=y1;		
		
		for(int i=0; i<=steps; i++)
		{
			g.fillRect(Math.round(x),Math.round(y),1,1); 
			//g.drawLine(Math.round(x),Math.round(y),Math.round(x),Math.round(y));
			x += xInc;
			y += yInc;
		}		
	}	
	
	public static void main(String args[])
	{
		new OpenPolygon();
	}
}