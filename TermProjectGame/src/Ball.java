import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Ball  extends GameObjects implements KeyListener{
	JLabel a;
	public static int xpos=1;
	public static int ypos=-1;

	Ball(int height, int width) {

		super(height, width);
		object_image=new ImageIcon("mylastball.png");
	
		a=new JLabel(object_image);
		
	 
	}  
	 public void Ballmove() {
			
		
	 
		  			if(this.getHeight()>Game.HEIGHT-50) {
		  				Game.Live--;
		  				this.setWidth(Level.paddle.getWidth()+20);
		  				this.setHeight(Level.paddle.getHeight()-60);
		  			}
		 	
		  			//if(Level.paddle.width<this.width&&Level.paddle.getObject_image().getIconWidth()+Level.paddle.width>this.width&&Level.paddle.height-35<this.height) {
		  			if(this.a.getBounds().intersects(Level.paddle.a.getBounds())) {
		  			 
						 ypos*=-1;
					}
					 if(getWidth()+this.object_image.getIconWidth()>Game.WIDTH ) {
						 
						 xpos*=-1;
						  setWidth(Game.WIDTH-object_image.getIconWidth());
						 
					 }
				    if(getHeight()<0) {
				    
				    	setHeight(0);
					 ypos*=-1;
					 }
				  
				    if(getWidth()<0) {
				     
						 setWidth(0);
						 xpos*=-1;
						 }
				    else {
				    setWidth(getWidth() + xpos);
					 setHeight(getHeight() + ypos);
				    }
					 render();
		 
		}

	 
	 
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub,
	 
			 
	}
	@Override
	public void keyReleased(KeyEvent e) {
		 
			
		  }
		  

		public void render() {
		
			a.setBounds(getWidth(),getHeight(),object_image.getIconWidth(),object_image.getIconHeight());
			
		}

	
}
