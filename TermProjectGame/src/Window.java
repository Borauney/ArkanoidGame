import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Window extends JFrame  {
	 public static JFrame window;
	private ActionListener actionlistener=new ActionListener() {
	
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			String command = e.getActionCommand();
			System.out.println("Selected:"+command);
			if(command.equals("New Game")) {
		        
				 
				new NewGame(Game.WIDTH,Game.HEIGHT);
			}
		 
			else if(command.equals("Scores")) {
			try {
			 
				new ScoresGuI(Game.WIDTH,Game.HEIGHT);
				 
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		 
			}
			else if(command.equals("Help")) {
				 
				 JOptionPane.showMessageDialog(null,"Move paddle either by using arrow keys \r\n"
						 + "Do NOT let the ball fall you should break all bricks for max score  you can press ctrl+q and quit anytime,\nif you want to save your score you have to spend your all game lives or you should complete level 3  ","Help",1);
			}
			else if(command.equals("About")) {
				
				JOptionPane.showMessageDialog(null,"Yeditepe Üniversitesi \n Creator: Bora Uney \n Id: 20190702042 \n Contact:bora.uney@std.yeditepe.edu.tr ","About",1);
			}
			else if(command.equals("Exit")) {
				System.exit(1);
			}
		}
	};
	public Window(int width,int height,String title) {
		 window= new JFrame(title);
		  ImageIcon gameimage= new  ImageIcon("gameimage.jpg");
		  window.setIconImage(gameimage.getImage());
		window.setTitle(title);
        window.setSize(width,height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Gets the X button working.
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        JLabel background= new  JLabel(new ImageIcon("mybg.jpg"));
       window.setContentPane(background); 
       
        ImageIcon button_image= new  ImageIcon("buttonn.png");

	     JButton newgame = new JButton("New Game",button_image);
		 newgame.setForeground(Color.yellow);
		 newgame.setFont(new Font("MV Boli",Font.PLAIN,12));
		 newgame.setBounds(width/2-50,height/6-92,100,30);
		 newgame.setVerticalTextPosition(JButton.CENTER);
		 newgame.setHorizontalTextPosition(JButton.CENTER);
		 newgame.addActionListener(actionlistener);
		 window.add(newgame);
		 /*
		 JButton options = new JButton("Options",button_image);
		 options.setForeground(Color.yellow);
		 options.setFont(new Font("MV Boli",Font.PLAIN,12));
		 options.setBounds(width/2-50,2*height/6-92,100,30);
		 options.setVerticalTextPosition(JButton.CENTER);
		 options.setHorizontalTextPosition(JButton.CENTER);
		 options.addActionListener(actionlistener);
		 window.add(options);
		 */
		 JButton scores = new JButton("Scores",button_image);
		 scores.setForeground(Color.yellow);
		 scores.setFont(new Font("MV Boli",Font.PLAIN,12));
		 scores.setBounds(width/2-50,2*height/6-92,100,30);
		 scores.setVerticalTextPosition(JButton.CENTER);
		 scores.setHorizontalTextPosition(JButton.CENTER);
		 scores.addActionListener(actionlistener);
		 window.add(scores);
		 JButton help = new JButton("Help",button_image);
		 help.setForeground(Color.yellow);
		 help.setFont(new Font("MV Boli",Font.PLAIN,12));
		 help.setBounds(width/2-50,3*height/6-92,100,30);
		 help.setVerticalTextPosition(JButton.CENTER);
		 help.setHorizontalTextPosition(JButton.CENTER);
		 help.addActionListener(actionlistener);
		 window.add(help);
		 JButton about = new JButton("About",button_image);
		 about.setForeground(Color.yellow);
		 about.setFont(new Font("MV Boli",Font.PLAIN,12));
		 about.setBounds(width/2-50,4*height/6-92,100,30);
		 about.setVerticalTextPosition(JButton.CENTER);
		 about.setHorizontalTextPosition(JButton.CENTER);
		 about.addActionListener(actionlistener);
		 window.add(about);
		 JButton exit = new JButton("Exit",button_image);
		 exit.setForeground(Color.yellow);
		 exit.setFont(new Font("MV Boli",Font.PLAIN,12));
		 exit.setBounds(width/2-50,5*height/6-92,100,30);
		 exit.setVerticalTextPosition(JButton.CENTER);
		 exit.setHorizontalTextPosition(JButton.CENTER);
		 exit.addActionListener(actionlistener);
		 window.add(exit);
	     window.setVisible(true);
 
	       
	}
 

	 
	 
	
}
