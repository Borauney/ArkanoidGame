import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Level  extends JFrame  {
	public  static Paddle paddle=new  Paddle(650,430);
	LinkedList<Brick> wall=new LinkedList<Brick>();
	public static Ball ball=new Ball(615,468);
	public static  int counter=0;
	public static int difficulty;
	public static JLabel score_image=new JLabel("Score:"+Game.SCORE);
	public static JLabel live_image=new JLabel("Lives:"+Game.Live);
	public static JLabel exit_image=new JLabel("press Ctrl-Q to main screen ");
 
	public static boolean cont=true;
 
	public static int b_xstart=240;
	public static int b_ystart=150;
	public static int gameends=0;
	public static SoundEffect sound=new SoundEffect();
	public static JFrame game_screen;
	
	 
 
	Level(int width,int height,int difficulty){
		 boolean a=true;
		this.difficulty=difficulty;
	
		
		 sound.setFile("sound.wav");
		JLabel level_image=new JLabel("Level:"+difficulty);	
	   game_screen= new JFrame();
	  JLabel background= new  JLabel(new ImageIcon("mybg.jpg"));
	  ImageIcon gameimage= new  ImageIcon("gameimage.jpg");
 
	  game_screen.setContentPane(background);
	  game_screen.setIconImage(gameimage.getImage());
	  game_screen.setTitle("Arkanoid");
	  game_screen.setSize(Game.WIDTH,Game.HEIGHT);
	  game_screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Gets the X button working.
	  game_screen.setResizable(false);
	  game_screen.setLocationRelativeTo(null);
	
	  paddle.a.setBounds(paddle.getWidth(), paddle.getHeight(),paddle.object_image.getIconWidth() ,paddle.object_image.getIconHeight());
	  ball.a.setBounds(ball.getWidth(), ball.getHeight(),ball.object_image.getIconWidth() ,ball.object_image.getIconHeight());
	  game_screen.add(ball.a);
	  game_screen.add(paddle.a);
	  game_screen.addKeyListener(paddle);
	  game_screen.addKeyListener(ball);
	  score_image.setBounds(5, 3, 200, 30);
	  score_image.setForeground(Color.WHITE);
	  game_screen.add(score_image);
	
	  score_image.setVisible(true);
	
	  live_image.setBounds(920, 3, 200, 30);
	  live_image.setForeground(Color.WHITE);
	  game_screen.add(live_image);
	  level_image.setBounds(500, 3, 200, 30);
	  level_image.setForeground(Color.WHITE);
	  game_screen.add(level_image);
	
	  live_image.setVisible(true);
	  exit_image.setBounds(400,300,200,50);
	  exit_image.setForeground(Color.BLACK);
	exit_image.setVisible(false);
	  game_screen.add(exit_image);
 
 

		
	  if(difficulty==1) {
	 
	  for(int i=0;i<3;i++) {
		  for(int j=0;j<9;j++) {
			  
			 
			  wall.add(new Brick(b_ystart, b_xstart,1));
			
			 game_screen.add(wall.get(counter).a);
			 wall.get(counter).render();
			 b_xstart+=50;
			  counter++;
	 
			 
		  }
		  b_xstart=240;
		  b_ystart+=80;
	 
	  }
	  
	  }
	 
	  if(difficulty==2) {
			 
		  for(int i=0;i<3;i++) {
			  for(int j=0;j<9;j++) {
				  
				 if(i==0) {
					  wall.add(new Brick(b_ystart, b_xstart,1));
						wall.get(counter).render();
						 game_screen.add(wall.get(counter).a);
						 b_xstart+=50;
						  counter++;
				 }
				 else if(i==1) {
					  wall.add(new Brick(b_ystart, b_xstart,2));
						wall.get(counter).render();
						 game_screen.add(wall.get(counter).a);
						 b_xstart+=50;
						  counter++;
				 }
				 else {
					  wall.add(new Brick(b_ystart, b_xstart,1));
						wall.get(counter).render();
						 game_screen.add(wall.get(counter).a);
						 b_xstart+=50;
						  counter++;
				 }
				 
			  }
			  b_xstart=240;
			  b_ystart+=80;
		 
		  }
		  
	  }
	  if(difficulty==3) {
			 
		  for(int i=0;i<3;i++) {
			  for(int j=0;j<9;j++) {
				  
				 if(i==0) {
					  wall.add(new Brick(b_ystart, b_xstart,3));
						wall.get(counter).render();
						 game_screen.add(wall.get(counter).a);
						 b_xstart+=50;
						  counter++;
				 }
				 else if(i==1) {
					  wall.add(new Brick(b_ystart, b_xstart,2));
						wall.get(counter).render();
						 game_screen.add(wall.get(counter).a);
						 b_xstart+=50;
						  counter++;
				 }
				 else {
					  wall.add(new Brick(b_ystart, b_xstart,1));
						wall.get(counter).render();
						 game_screen.add(wall.get(counter).a);
						 b_xstart+=50;
						  counter++;
				 }
				 
			  }
			  b_xstart=240;
			  b_ystart+=80;
		 
		  }
		  
	  }
	  
		Thread m=new Thread() {
			 
		public void run() {
			// TODO Auto-generated method stub
			
			while(Game.Live>0&&wall.size()>0&&cont==true) {
			 
					
					ball.Ballmove();
					for(int i=0;i<wall.size();i++) {
					
						
						if  (ball.a.getBounds().intersects(wall.get(i).a.getBounds())){
							 sound.play();
							try {
							
								Thread.sleep(1);
							 
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							if(wall.get(i).durability==3) {
								Game.SCORE+=50;
								score_image.setText("Score:"+Game.SCORE);
							}
							if(wall.get(i).durability==2) {
								Game.SCORE+=30;
								score_image.setText("Score:"+Game.SCORE);
							}
							if(wall.get(i).durability==1) {
								Game.SCORE+=10;
								score_image.setText("Score:"+Game.SCORE);
							}
							
							wall.get(i).durability--;
							
						 
							wall.get(i).render();
							 if(wall.get(i).durability==0) {
								 wall.remove(i);
							 }
							score_image.setText("Score:"+Game.SCORE);
							ball.ypos*=-1;
							ball.Ballmove();
							
						} 
						else {
							live_image.setText("Live:"+Game.Live);
							 
						    //-velocity.getX(), velocity.getY()
						}
					}
				
		    	
		            
			 
		         
		            try {
		            	if(difficulty==1) {
		            	Thread.sleep(6);
		            	}
		            	if(difficulty==2) {
			            	Thread.sleep(3);
			            	}
		            	if(difficulty==3) {
			            	Thread.sleep(2);
			            	}
		        } catch(InterruptedException e) {
		            System.out.println("interrupted");
		        
		        }
		           
		 
		    }
			 
			  exit_image.setVisible(true);
			  if(cont==false&&(Game.Live==0)||(difficulty==3&&wall.size()==0)) {
			int playerscoreint=Game.SCORE;
			String name=JOptionPane.showInputDialog(null,"Enter Name Surname for score saving(please enter your name without space) :","Score set",JOptionPane.PLAIN_MESSAGE);
			try {
			    Files.write(Paths.get("scoreboard.txt"),(name+" "+playerscoreint+" Date&Time: "+java.time.LocalDate.now()+" Time "+java.time.LocalTime.now()+"\n").getBytes(), StandardOpenOption.APPEND);
			    
			}catch (IOException e) {
			    //exception handling left as an exercise for the reader
			Game.player_scores.add(name+" "+Game.SCORE);
			System.out.println(Game.player_scores.get(Game.player_count).toString());
			  
			}
			Game.Live=3;
			Game.SCORE=0;
	 
			  }
		
	 
		}
		};
		
	 
		
		m.start();
	 
	
		 
		score_image.setText("Score:"+Game.SCORE);
		counter=0;
		paddle.setWidth(430);
		paddle.setHeight(650);
		ball.setWidth(468);
		ball.setHeight(615);
		paddle.render();
		b_xstart=240;
		b_ystart=150;
		gameends=0;
		cont=true;
 
		 
		  game_screen.setVisible(true);
		
	
	}

	 

	
	}
