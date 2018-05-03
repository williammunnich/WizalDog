//jm music from https://sourceforge.net/projects/jmusic/?source=typ_redirect
import jm.music.data.Note;
import jm.util.Play;
import jm.JMC;

public class jmusictest {

	public static void main(String[] args) {
		
		Note note = new Note();
		note.setPitch(JMC.BF3);
		note.setDuration(1);
		
		Play.midi(note);
	}
}
