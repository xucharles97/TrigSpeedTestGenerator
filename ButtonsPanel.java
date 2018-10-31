import java.awt.*;

import javax.swing.*;

//panel with all the buttons

public class ButtonsPanel extends JPanel {

	private JPanel buttons;
	private JButton generateButton;
	private JButton answerButton;
	private JButton printButton;
	private TrigSpeedTestListener t;

	public ButtonsPanel(TrigSpeedTestListener listener) {
		buttons = new JPanel();		
		t = listener;
		generateButton = new JButton("Generate");
		generateButton.addActionListener(t);
		answerButton = new JButton("Show Answer");
		answerButton.addActionListener(t);
		printButton = new JButton("Print");
		printButton.addActionListener(t);
		buttons.add(generateButton);
		buttons.add(answerButton);
		buttons.add(printButton);
		
		buttons.setLayout(new GridLayout(1,3));
		this.add(buttons);
		
	}
}
