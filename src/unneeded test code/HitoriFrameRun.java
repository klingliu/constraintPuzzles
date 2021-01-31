import java.awt.*;
import java.io.FileNotFoundException;

public class HitoriFrameRun {

	public static void main(String[] args) throws FileNotFoundException {

		HitoriFrame frame = new HitoriFrame();
		frame.setUpFrame();

		frame.pack();
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(600,600));
		frame.repaint();

		// this method must finish and return before GUI 
		// handling begins
	}

}
