import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class GameObjects {
	private int height;
	private int width;
 
 
 
	 
	public ImageIcon object_image;
	public ImageIcon getObject_image() {
		return object_image;
	}
	public void setObject_image(ImageIcon object_image) {
		this.object_image = object_image;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	GameObjects(int height,int width){
		this.setHeight(height);
		this.setWidth(width);
		
	}
 
	public abstract void render() ;
		
		
		
	

}
