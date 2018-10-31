import java.awt.*;
import java.util.ArrayList;

import javax.swing.JPanel;

//panel where the test will show up

public class TestPanel extends JPanel{

	private TestGenerator t;
	private QuestionAndAnswerPair[][] test;
	private String action = "null";
	private TrigSpeedTestListener listener;

	public TestPanel(TrigSpeedTestListener l) {
		t = new TestGenerator(1);
		test = t.getTest();
		listener = l;
	}


	public void drawTable(Graphics g) {
		this.drawTable(g, 140, 21);

	}

	public void drawTable(Graphics g, int l, int h) {
		g.setColor(Color.BLACK);
		int cellLength = l;
		int cellHeight = h;
		int xInt = 45;
		int yInt = 10;
		for (int i = 0; i < 17; i++) {
			if (i < 6) {
				g.drawLine(xInt + i * cellLength, yInt, xInt + i * cellLength, yInt + h * 16);
			}
			g.drawLine(xInt, yInt + i * cellHeight, xInt + 5 * cellLength, yInt + i * cellHeight);
		}

	}

	public void drawTable(Graphics g, int cellLength, int cellHeight, int xInt, int yInt) {
		g.setColor(Color.BLACK);
		for (int i = 0; i < 17; i++) {
			if (i < 6) {
				g.drawLine(xInt + i * cellLength, yInt, xInt + i * cellLength, yInt + cellHeight * 16);
			}
			g.drawLine(xInt, yInt + i * cellHeight, xInt + 5 * cellLength, yInt + i * cellHeight);
		}

	}

	public void drawTableWithQuestions(Graphics g) {
		this.drawTableWithQuestions(g, 21, 152, 45, 10);
	}

	public void drawTableWithQuestions(Graphics g, int cellHeight, int cellLength, int xInt, int yInt) {
		this.drawTable(g, cellLength, cellHeight, xInt, yInt);
		System.out.println("here!");
		int yOfQuestions = 27;
		for (int i = 0; i < 80; i++) {
			g.drawString(test[0][i].getQuestion(), xInt + 5 + cellLength * (i % 5), yOfQuestions);
			if (i % 5 == 4) {
				yOfQuestions += cellHeight;
			}
		}
	}

	public void drawTableWithQuestionsAndAnswers(Graphics g, int cellHeight, int cellLength, int xInt, int yInt) {
		int ansOffSet = (int)(cellLength * 0.55);
		this.drawTable(g, cellLength, cellHeight, xInt, yInt);
		int yOfQuestions = 27;
		for (int i = 0; i < 80; i++) {
			g.setColor(Color.BLACK);
			g.drawString(test[0][i].getQuestion(), xInt + 5 + cellLength * (i % 5), yOfQuestions);
			g.setColor(Color.RED);
			g.drawString(test[0][i].getAnswer(), xInt + 5 + cellLength * (i % 5) + ansOffSet, yOfQuestions);
			if (i % 5 == 4) {
				yOfQuestions += cellHeight;
			}
		}
	}

	public void drawTableWithQuestionsAndAnswers(Graphics g) {
		drawTableWithQuestionsAndAnswers(g, 21, 152, 45, 10);
	}


	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//System.out.println("inside paintcompoenent");
		//System.out.println(action);
		if (listener.getStr().equals("Generate")) {
			drawTableWithQuestions(g);
		}
		if (listener.getStr().equals("Show Answer")) {
			drawTableWithQuestionsAndAnswers(g);
		}
		this.repaint();
		
	}


	public void generateTest() {
		t = new TestGenerator(1);
		test = t.getTest();
		System.out.println(test[0][0].getQuestion());
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}


	public QuestionAndAnswerPair[][] getTest() {
		// TODO Auto-generated method stub
		return test;
	}



}
