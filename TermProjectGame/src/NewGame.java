import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

 public class NewGame extends JFrame {
	 public static JFrame levels;
		private ActionListener actionlistener=new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String command = e.getActionCommand();
				System.out.println("Selected:"+command);
				if(command.equals("LEVEL 1")) {
			        
			 
				 
				
					
					new Level(Game.WIDTH,Game.HEIGHT,1);
				
					Window.window.setVisible(false);
					levels.setVisible(false);
				}
				if(command.equals("LEVEL 2")) {
			        
					
			 
					new Level(Game.WIDTH,Game.HEIGHT,2);
					Window.window.setVisible(false);
					levels.setVisible(false);
				}
				if(command.equals("LEVEL 3")) {
			        
					 
					
					new Level(Game.WIDTH,Game.HEIGHT,3);
					Window.window.setVisible(false);
					levels.setVisible(false);
					//levels.setVisible(false);
				}
				if(command.equals("Back")) {
			        
					
					
				 
					Window.window.setVisible(true);
					levels.setVisible(false);
					
					//levels.setVisible(false);
				}

			}
		};
	  
		 
	public NewGame(int width,int height){
		  levels= new JFrame();	
		 ImageIcon gameimage= new  ImageIcon("gameimage.jpg");
	    levels.setIconImage(gameimage.getImage());
		levels.setTitle("Arakanoid");
        levels.setSize(width,height);
        levels.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Gets the X button working.
        levels.setResizable(false);
        levels.setLocationRelativeTo(null);
        JLabel background= new  JLabel(new ImageIcon("mybg.jpg"));
       levels.setContentPane(background); 
       ImageIcon button_image= new  ImageIcon("buttonn.png");

	     JButton newgame = new JButton("LEVEL 1",button_image);
		 newgame.setForeground(Color.yellow);
		 newgame.setFont(new Font("MV Boli",Font.PLAIN,12));
		 newgame.setBounds(width/2-50,height/6-92,100,30);
		 newgame.setVerticalTextPosition(JButton.CENTER);
		 newgame.setHorizontalTextPosition(JButton.CENTER);
		 newgame.addActionListener(actionlistener);
		 levels.add(newgame);
       levels.setVisible(true);
       JButton level2 = new JButton("LEVEL 2",button_image);
		 level2.setForeground(Color.yellow);
		 level2.setFont(new Font("MV Boli",Font.PLAIN,12));
		 level2.setBounds(width/2-50,2*height/6-92,100,30);
		 level2.setVerticalTextPosition(JButton.CENTER);
		 level2.setHorizontalTextPosition(JButton.CENTER);
		 level2.addActionListener(actionlistener);
		 levels.add(level2);
     levels.setVisible(true);
     JButton level3 = new JButton("LEVEL 3",button_image);
	 level3.setForeground(Color.yellow);
	 level3.setFont(new Font("MV Boli",Font.PLAIN,12));
	 level3.setBounds(width/2-50,3*height/6-92,100,30);
	 level3.setVerticalTextPosition(JButton.CENTER);
	 level3.setHorizontalTextPosition(JButton.CENTER);
	 level3.addActionListener(actionlistener);
	 levels.add(level3);
	 levels.setVisible(true);
	 JButton back = new JButton("Back",button_image);
	 back.setForeground(Color.yellow);
	 back.setFont(new Font("MV Boli",Font.PLAIN,12));
	 back.setBounds(width/2-50,4*height/6-92,100,30);
	 back.setVerticalTextPosition(JButton.CENTER);
	 back.setHorizontalTextPosition(JButton.CENTER);
	 back.addActionListener(actionlistener);
	 levels.add(back);
	 levels.setVisible(true);
       
	
 
	}


	 
		}

		

