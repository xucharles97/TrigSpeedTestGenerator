//this is the class that generates the tests
public class TestGenerator {
	
	private int numQuestions = 80;
	private QuestionAndAnswerPair[] questionsAndAnswers;
	private QuestionAndAnswerPair[][] test;
	private int numTests;

	
	public TestGenerator() {
		questionsAndAnswers = TrigKey.setQAndAPair();
		numTests = 1;
		test = generateTest();
		
		
		
	}
	


	public TestGenerator(int tests) {
		questionsAndAnswers = TrigKey.setQAndAPair();
		numTests = tests;
		test = generateTest();
		
	}
	
	public void printTest() {
		for (int i = 0; i < numQuestions * numTests; i++) {
			if (i % numQuestions == 0) {
				if (i != 0) {
					System.out.println();
				}
				System.out.println("Test " + (i / 80 + 1));
			}
			System.out.printf("%-20s", test[i / numQuestions][i % numQuestions].getQuestion());
			if (i % 5 == 4) {
				System.out.println();
			}
		}
	}
	public void printTestWithAnswers() {
		for (int i = 0; i < numQuestions * numTests; i++) {
			if (i % numQuestions == 0) {
				if (i != 0) {
					System.out.println();
				}
				System.out.println("Test " + (i / 80 + 1));
			}
			System.out.printf("%-12s%-8s", test[i / numQuestions][i % numQuestions].getQuestion(), test[i / numQuestions][i % numQuestions].getAnswer());
			if (i % 5 == 4) {
				System.out.println();
			}
		}
	}
	
	public QuestionAndAnswerPair[][] generateTest() {
		QuestionAndAnswerPair[][] tempTest = new QuestionAndAnswerPair[numTests][80];
		for (int i = 0; i < numQuestions * numTests; i++) {
			tempTest[i/numQuestions][i % numQuestions] = questionsAndAnswers[(int)(Math.random()*questionsAndAnswers.length)];
		}
		return tempTest;
	}
	




	public QuestionAndAnswerPair[][] getTest() {
		return test;
	}
	
	
	



	public void setTest(QuestionAndAnswerPair[][] test) {
		this.test = test;
	}
	
}
