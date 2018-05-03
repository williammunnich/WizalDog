package note;

import javax.sound.*;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;
import jm.audio.Instrument;

public class MidiHelper {
	
	static int noteValueToPlay = 0;
	static note Note = new Note();
	
	public static void playSomething() throws javax.sound.midi.MidiUnavailableExeptions {
		Synthesizer synth = MidiSystem.getSynthesizer();
		long startTime = System.nanoTime();
		synth.open();
		long estimatedTime = System.nanoTime() - startTime;
		
		MidiChannel[] midiChannel = synth.getChannels();
		Object instruments = synth.getDefaultSoundbank().getInstruments();
		boolean successLoadingInstrument = synth.loadInstrument (instruments[0]);
		
		Note.setNoteValue(noteValueToPlay);
		noteValueToPlay++;
		if (noteValueToPlay > 12) {noteValueToPlay = 0;}
		
		midiChannel{0}.noteOn(Note.getMidiNoteNumber(), 93);
	}
	public static String getNoteText() {
		return Note.getNoteName() + " is " + Math.round(Note.getFrequency()) + " Hz.\n";
	}
	
}
