import javax.swing.*; 
import java.awt.*; 

public class Question01 extends JFrame 
{
	public Question01()
	{
		setTitle("Question 01");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.BLACK);
		
		//base
		int xbody[] = {200,350,350,200};
		int ybody[] = {200,200,300,300};
		
		for(int i=0; i<xbody.length; i++)
		{
			DDA(g,xbody[i],ybody[i],xbody[(i+1)%xbody.length],ybody[(i+1)%ybody.length]);
		}
		
		//roof
		int xroof[] = {200,275,350};
		int yroof[] = {200,125,200};
		
		for(int i=0; i<xroof.length; i++)
		{
			DDA(g,xroof[i],yroof[i],xroof[(i+1)%xroof.length],yroof[(i+1)%yroof.length]);
		}
		
		//door
		int xdoor[] = {220,220,250,250};
		int ydoor[] = {300,250,250,300};
		
		for(int i=0; i<xdoor.length; i++)
		{
			DDA(g,xdoor[i],ydoor[i],xdoor[(i+1)%xdoor.length],ydoor[(i+1)%ydoor.length]);
		}
		
		//window
		int xwindow[] = {290,320,320,290};
		int ywindow[] = {240,240,210,210};
		
		for(int i=0; i<xdoor.length; i++)
		{
			DDA(g,xwindow[i],ywindow[i],xwindow[(i+1)%xwindow.length],ywindow[(i+1)%ywindow.length]);
		}
	}
	
	public void DDA(Graphics g,int x1,int y1,int x2,int y2)
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
		new Question01();
	}
}