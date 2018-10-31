
public class QuestionAndAnswerPair {
	
	private String question;
	private String answer;
	private int index;
	//a QuestionAndAnswerPair is a question grouped with its respective answer
	public QuestionAndAnswerPair(String q, String a, int i) {
		question = q;
		answer = a;
		index = i;
	}
	

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	

	
	
}
