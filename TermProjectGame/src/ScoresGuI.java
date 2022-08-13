import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ScoresGuI extends JFrame implements ActionListener{
	 public static JFrame score;
		private ActionListener actionlistener=new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String command = e.getActionCommand();
				System.out.println("Selected:"+command);
			 
				if(command.equals("Back")) {
			        
					
					
				 
					Window.window.setVisible(true);
					score.setVisible(false);
				 
					
					//score.setVisible(false);
				}

			}
		};
	  
		 
	public ScoresGuI(int width,int height) throws FileNotFoundException{
		  score= new JFrame();	
		 ImageIcon gameimage= new  ImageIcon("gameimage.jpg");
	    score.setIconImage(gameimage.getImage());
		score.setTitle("Arakanoid");
        score.setSize(width,height);
        score.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Gets the X button working.
        score.setResizable(false);
        score.setLocationRelativeTo(null);
        JLabel background= new  JLabel(new ImageIcon("mybg.jpg"));
       score.setContentPane(background); 
       Scanner s = new Scanner(new File("scoreboard.txt"));
       ArrayList<String> puanlist=new ArrayList<String>();
       Font font = new Font("MV Boli", Font.ROMAN_BASELINE, 15);
       
       
       JTextArea puanlar = new JTextArea();
 
       puanlar.setFont(font);
       puanlar.setEnabled(false);
       puanlar.setBounds(250, 10, 570, 260);
       puanlar.setBackground(Color.BLACK);
       
 
       String empty_text="";
       int pcount=0;
       while (s.hasNext()){
    	    puanlist.add(s.nextLine());
    	    pcount++;
       }
    	s.close();
       
    	Collections.sort(puanlist,new MyComparator());
    	for(String a : puanlist){
    		  empty_text=empty_text+a+"\n";
    		}
    	puanlar.setText(empty_text);
     
    	score.add(puanlar);
       
       ImageIcon button_image= new  ImageIcon("buttonn.png");
	 JButton back = new JButton("Back",button_image);
	 back.setForeground(Color.yellow);
	 back.setFont(new Font("MV Boli",Font.PLAIN,12));
	 back.setBounds(width/2-50,5*height/6-92,100,30);
	 back.setVerticalTextPosition(JButton.CENTER);
	 back.setHorizontalTextPosition(JButton.CENTER);
	 back.addActionListener(actionlistener);
	 score.add(back);
	 score.setVisible(true);
       
	
 
	}

 


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
		}

		

