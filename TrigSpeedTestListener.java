import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


public class TrigSpeedTestListener implements ActionListener{
	
	private ButtonsPanel buttonPanel;
	private TestPanel testPanel;
	private Graphics g;
	private String str = "action";
	
	//here's the listener
	

	
	public TrigSpeedTestListener() {
		buttonPanel = new ButtonsPanel(this);
		testPanel = new TestPanel(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		str = e.getActionCommand();


		if (str.equals("Generate")) {
			testPanel.generateTest();
		}
		System.out.println("about to call repaint");
		testPanel.repaint();

		
		
		

		
	}
	
	public String getStr() {
		return str;
	}
	
	public void setStr(String str) {
		this.str = str;
	}


	

	
	

	
	
}
