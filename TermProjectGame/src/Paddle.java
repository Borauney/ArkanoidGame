import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Paddle extends GameObjects implements KeyListener{
	public JLabel a;
	Paddle(int height, int width) {
		super(height, width);
		object_image=new ImageIcon("mylastpaddle.png");
		a=new JLabel(object_image);
		 
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub,
	 
		 String whichKey=KeyEvent.getKeyText(e.getKeyCode());
		  if(whichKey.compareTo("Left")==0&&getWidth()>0) {
			  
			setWidth(getWidth() - 15);
			 this.render();
			
		  }
		  if(whichKey.compareTo("Right")==0&&getWidth()<Game.WIDTH-this.object_image.getIconWidth()) {
			  setWidth(getWidth() + 15);
				 this.render();
			 
			  }
		  if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_Q) {
			
		
			
			  Window.window.setVisible(true);
			  Level.game_screen.setVisible(false);
			  Game.SCORE=0;
			  Level.cont=false;
			  
		  }
	 
	}
	@Override
	public void keyReleased(KeyEvent e) {
		 
			
		  }
		  
	 
	public void render() {
		 
	
		a.setBounds(getWidth(),getHeight(),object_image.getIconWidth(),object_image.getIconHeight());
	 
	}

}
