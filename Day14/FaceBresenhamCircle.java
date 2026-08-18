import javax.swing.*; 
import java.awt.*; 

public class FaceBresenhamCircle extends JFrame 
{
	public FaceBresenhamCircle() 
	{
		setTitle("Face");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		int xc=200,yc=250; //Center of the face
		
		int faceR=100; //r of the face
		
		int EarR=25; //r of the ears
		int EarOffsetX=120, EarOffsetY=50; //offset for ears from the center
		
		int EyeR=10; //r of the eye
		int EyeOffsetX=40, EyeOffsetY=50; //offset for eyes from the center
		
		int MouthR=40; //r of the mouth
		int MouthOffsetY=50; //offset for mouth from the center
		
		int NoseR=20; //r of the nose
        int NoseOffsetY=20; //offset for nose from the center

		//Face
		drawBresenhamCircle(g,xc,yc,faceR);
		
		//Left ear
		drawBresenhamCircle(g,xc-EarOffsetX,yc-EarOffsetY,EarR);
		//Right ear
		drawBresenhamCircle(g,xc+EarOffsetX,yc-EarOffsetY,EarR);
		
		//Left eye
		drawBresenhamCircle(g,xc-EyeOffsetX,yc-EyeOffsetY,EyeR);
		//Right eye
		drawBresenhamCircle(g,xc+EyeOffsetX,yc-EyeOffsetY,EyeR);
		
		//nose
		drawBresenhamCircle(g,xc,yc-NoseOffsetY,NoseR);
		
		//Mouth
		drawBresenhamCircle(g,xc,yc+MouthOffsetY,MouthR);		
	}
	
	public void drawBresenhamCircle(Graphics g,int xc,int yc,int r)
	{	 		  
		int x=0;
		int y=r;
		
		int d=3-(2*r);
	
	    //draws only the first octant (45° of the circle).
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
	
	public static void main(String args[])
	{
		new FaceBresenhamCircle();
	}
}



