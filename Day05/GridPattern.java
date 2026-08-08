import javax.swing.*;
import java.awt.*;

public class GridPattern extends JFrame
{
	public GridPattern()
	{
		setTitle("Grid");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.PINK);
		int x,y;
		int size=30;
		int spacing=10;
		
		for(int row=0; row<10; row++)
		{
			for(int col=0; col<10; col++)
			{
				x=col * (size+spacing)+40;
				y=row * (size+spacing)+40;
				g.fillRect(x,y,size,size);
			}
		}
	}
	
	public static void main(String args[])
	{
		new GridPattern();
	}
}

/* int x=50;
int y=50;
int width=30;
int height=30;
		
g.setColor(Color.PINK);
		
for(int row=0; row<10; row++)
{
    int x1=x;
	for(int col=0; col<10; col++)
	   {
		   g.fillRect(x1,y,width,height);
		   x1=x1+40;
	   }
	   y=y+40;
} */