import javax.swing.*; //used to create window(JFrame,JPanel)
import java.awt.*; //used for drawing graphics (lines,points)

public class DDA_LineAlgorithm extends JFrame 
{
	public DDA_LineAlgorithm()
	{
		//set up the frame
		setTitle("DDA Line Algorithm");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.BLACK);
		
		int x1=100,x2=200;
		int y1=250,y2=100;
		
		drawDDA(g,x1,y1,x2,y2);
		//It is a method (function) that we created inside the class
	}
	
	public void drawDDA(Graphics g,int x1,int y1,int x2,int y2)
	{
		//Graphics is a drawing tool object
		//It is given by java automatically when we draw on screen
		int dx=x2-x1; //dx=horizontal distance
		int dy=y2-y1; //dy = vertical distance
		
		int steps; //we need number of steps to draw line smoothly
		
		//find number of steps
		if(Math.abs(dx) > Math.abs(dy))
		{
			steps = Math.abs(dx);
		}
		else{
			steps = Math.abs(dy);
		}
		//Math.abs() is a built in java function that gives the absolute vertical
		//Math.abs() because distance must always be positive
		
		//calculate increment
		float xInc = dx/(float)steps;
		float yInc = dy/(float)steps;
		
		float x=x1;
		float y=y1;
		
		//plot points
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
		new DDA_LineAlgorithm();
	}
}