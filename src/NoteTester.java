import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NoteTester {

	public static void main(String[] args) {
			final JFrame frame = new JFrame("https://www.youtube.com/watch?v=lhcVdnQ_R1U");
			JPanel pane = new JPanel();
			final JLabel textLabel = new JLabel();
			textLabel.setText("note,name,frequency");
			JButton noteButton = new JButton("click me boi");
			
			frame.getContentPane().add(pane);
			pane.add(noteButton);
			pane.add(textLabel);
			frame.pack();
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			frame.show();
			
			noteButton.addActionListener(new ActionListener() {
				public void actionPerformed(actionEvent event) {
					try {	
						MidiHelper.playSomething();
						String text = MidiHelper.getNoteText();
						text.repaint();} 
					catch (javax.sound.midi.MidiUnavailableExeption exception) {
						System.out.println(exception);
						System.exit(1);}}
			};);
			
	}
}
