import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

//main class that runs the rest of the program

public class TrigSpeedTestMain {
	public static void main(String[] args) {
		JFrame window = new JFrame("Trig Speed Test Generator");
		JPanel container = new JPanel();
		
		
		TrigSpeedTestListener l = new TrigSpeedTestListener();
		ButtonsPanel b = new ButtonsPanel(l);
		TestPanel tp = new TestPanel(l);
		
		
		container.setLayout(new BorderLayout());
		container.add(b, BorderLayout.NORTH);
		container.add(tp, BorderLayout.CENTER);
		
		window.setContentPane(container);
        window.setSize(840,500);
        window.setLocation(150,100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

		window.setVisible(true);
		
		
		
		
	}
}
