import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Brick extends GameObjects{
	public int durability;
	public JLabel a;
	Brick(int height, int width,int durability) {
		super(height, width);
		
		this.durability=durability;
		if(durability==1) {
		object_image=new ImageIcon("unnamed.png");
		}
		else if(durability==2) {
			object_image=new ImageIcon("strong2brick.png");
		}
		else if(durability==3) {
			object_image=new ImageIcon("strongestt.png");
		}
		a=new JLabel(object_image);
	}
public void render() {
	if(durability==0) {
		setWidth(0);
		  setHeight(0);
		 
	 a.setVisible(false);
		
	}
	 
	 
	a.setBounds(getWidth(),getHeight(),object_image.getIconWidth(),object_image.getIconHeight());

	}
 
 	
}
