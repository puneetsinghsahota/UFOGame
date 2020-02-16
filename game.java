package ufo;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


public class game extends gameloop
{

	/**
	 * 
	 */
	//private static final long serialVersionUID = -6819234699421657650L;
	public void init()
	{
		setSize(1300,640);
		Thread th = new Thread(this);
		//th.start();
		offscreen = createImage(1300,640);
		//d=offscreen.getGraphics();
		th.start();
		addKeyListener(this);
	}
	public void paint(Graphics g)
	{
		d.clearRect(0, 0, 1300, 640);
		d.drawImage(background, 0, 0,1300,640, this);
		
		if(flag1==1)
		{
			d.drawImage(b, x1, y1,60,60, this);
		}
		if(flag2==1)
		{
			d.drawImage(b, x2, y2,60,60, this);
		}
		if(flag3==1)
		{
			d.drawImage(b, x3, y3,60,60, this);
		}
			d.drawImage(oc, ox1, oy1,100,60, this);
			d.drawImage(oc, ox2, oy2,100,60, this);
			d.drawImage(oc, ox3, oy3,100,60, this);
			d.drawImage(oc, ox4, oy4,100,60, this);
			d.drawImage(oc, ox5, oy5,100,60, this);
			d.drawImage(oc, ox6, oy6,100,60, this);
		if(flagl==1||flagr==1)
		{
			d.drawImage(hero, x, y, 150, 100, this);
		}
		else
		{
			d.drawImage(hero, x, y, 150, 90, this);
		}
		if(mainflag==0)
		{
			d.drawImage(b1,0,0,1300,640,this);
			d.setColor(Color.WHITE);
			d.setFont(new Font("Bauhaus 93",Font.BOLD,80));
			d.drawString("Press Enter to Start the Game", 80, 400);
		}
		if(mainflag2==0)
		{
			d.drawImage(b2,0,0,1300,640,this);
			d.setColor(Color.WHITE);
			d.setFont(new Font("Bauhaus 93",Font.BOLD,80));
			d.drawString("Score : "+ score, 900, 80);
			d.setFont(new Font("Bauhaus 93",Font.BOLD,150));
			d.drawString("Game Over", 80, 400);
		}
		g.drawImage(offscreen, 0, 0, this);
		
		
	}
	public void update(Graphics g)
	{
		paint(g);
	}

}
