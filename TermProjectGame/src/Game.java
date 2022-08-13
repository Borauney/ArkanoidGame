import java.util.ArrayList;

import javax.swing.JFrame;

public class Game extends JFrame {
    public static final int WIDTH = 1000; 
    public static final int HEIGHT = 800;
    public static   int SCORE = 0;
    public static   int Live = 3;
    public static   ArrayList<Object> player_scores=new ArrayList<Object>();
    public static int player_count=0;
 
 
     
    public Game() {
        
       
     new Window(WIDTH,HEIGHT,"Arkanoid");
 
    }


    public static void main(String[] args) {
    	  
        new Game();
       
       

    }

}

