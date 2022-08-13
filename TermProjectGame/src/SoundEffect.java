import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SoundEffect {
	Clip clip	;

	public void setFile(String soundFilename ) {
 
		try {
	 
			File file =new File(soundFilename);
		 
		 
			
			AudioInputStream sound= AudioSystem.getAudioInputStream(file);
			clip=AudioSystem.getClip();
			clip.open(sound);
			
		}
		catch(Exception e){
			
		}
		
		
	}
	public void play() {
		clip.setFramePosition(0);
		clip.start();
	}

}
