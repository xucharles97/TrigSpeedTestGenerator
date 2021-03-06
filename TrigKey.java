//class with all the questions and answers
public class TrigKey {
	private static String[] keyQ = new String[] {"sin(0)", "cos(0)", "tan(0)", 
			"sin(30)", "cos(30)", "tan(30)", 
			"sin(45)", "cos(45)", "tan(45)", 
			"sin(60)", "cos(60)", "tan(60)", 
			"sin(90)", "cos(90)", "tan(90)", 
			"sin(120)", "cos(120)", "tan(120)",  
			"sin(135)", "cos(135)", "tan(135)", 
			"sin(150)", "cos(150)", "tan(150)",
			"sin(180)", "cos(180)", "tan(180)", 
			"sin(210)", "cos(210)", "tan(210)", 
			"sin(225)", "cos(225)", "tan(225)",
			"sin(240)", "cos(240)", "tan(240)",
			"sin(270)", "cos(270)", "tan(270)",
			"sin(300)", "cos(300)", "tan(300)",
			"sin(315)", "cos(315)", "tan(315)", 
			"sin(330)", "cos(330)", "tan(330)",
			"sin(π/6)", "cos(π/6)", "tan(π/6)",
			"sin(π/4)", "cos(π/4)", "tan(π/4)",
			"sin(π/3)", "cos(π/3)", "tan(π/3)",
			"sin(π/2)", "cos(π/2)", "tan(π/2)",
			"sin(2π/3)", "cos(2π/3)", "tan(2π/3)",
			"sin(3π/4)", "cos(3π/4)", "tan(3π/4)",
			"sin(5π/6)", "cos(5π/6)", "tan(5π/6)",
			"sin(π)", "cos(π)", "tan(π)",
			"sin(7π/6)", "cos(7π/6)", "tan(7π/6)",
			"sin(5π/4)", "cos(5π/4)", "tan(5π/4)",
			"sin(4π/3)", "cos(4π/3)", "tan(4π/3)",
			"sin(3π/2)", "cos(3π/2)", "tan(3π/2)",
			"sin(5π/3)", "cos(5π/3)", "tan(5π/3)",
			"sin(7π/4)", "cos(7π/4)", "tan(7π/4)",
			"sin(11π/6)", "cos(11π/6)", "tan(11π/6)",
			"0", "30", "45", "60", "90", 
			"120", "135", "150", "180",
			"210", "225", "240", "270",
			"300", "315", "330", 
			"π/6", "π/4", "π/3", "π/2",
			"2π/3", "3π/4", "5π/6", "π",
			"7π/6", "5π/4", "4π/3", "3π/2",
			"5π/3", "7π/4", "11π/6",
			"sin-1(1/2)", "cos-1(√3/2)", "tan-1(√3/3)",
			"sin-1(√2/2)", "cos-1(√2/2)", "tan-1(1)",
			"sin-1(√3/2)", "cos-1(1/2)", "tan-1(√3)",
			"sin-1(1)", "cos-1(0)", "tan-1(∞)",
			"sin-1(-1/2)", "cos-1(-√3/2)", "tan-1(-√3/3)",
			"sin-1(-√2/2)", "cos-1(-√2/2)", "tan-1(-1)",
			"sin-1(-√3/2)", "cos-1(-1/2)", "tan-1(-√3)",
			"sin-1(-1)", "cos-1(0)"};;
	private static String[] keyA = new String[] {"0", "1", "0",
			"1/2", "√3/2", "√3/3",
			"√2/2", "√2/2", "1",
			"√3/2", "1/2", "√3",
			"1", "0", "∞",
			"√3/2", "-1/2", "-√3",
			"√2/2", "-√2/2", "-1",
			"1/2", "-√3/2", "-√3/3",
			"0", "-1", "0",
			"-1/2", "-√3/2", "√3/3",
			"-√2/2", "-√2/2", "1",
			"-√3/2", "-1/2", "√3",
			"-1", "0", "∞",
			"-√3/2", "1/2", "-√3",
			"-√2/2", "√2/2", "-1",
			"-1/2", "√3/2", "-√3/3",
			"1/2", "√3/2", "√3/3",
			"√2/2", "√2/2", "1",
			"√3/2", "1/2", "√3",
			"1", "0", "∞",
			"√3/2", "-1/2", "-√3",
			"√2/2", "-√2/2", "-1",
			"1/2", "-√3/2", "-√3/3",
			"0", "-1", "0",
			"-1/2", "-√3/2", "√3/3",
			"-√2/2", "-√2/2", "1",
			"-√3/2", "-1/2", "√3",
			"-1", "0", "∞",
			"-√3/2", "1/2", "-√3",
			"-√2/2", "√2/2", "-1",
			"-1/2", "√3/2", "-√3/3",
			"0", "π/6", "π/4", "π/3", "π/2",
			"2π/3", "3π/4", "5π/6", "π",
			"7π/6", "5π/4", "4π/3", "3π/2",
			"5π/3", "7π/4", "11π/6",
			"30", "45", "60", "90", 
			"120", "135", "150", "180",
			"210", "225", "240", "270",
			"300", "315", "330", 
			"30 π/6", "30 π/6", "30 π/6",
			"45 π/4", "45 or π/4", "45 π/4",
			"60 π/3", "60 π/3", "60 π/3",
			"90 π/2", "90 π/2", "90 π/2",
			"-30 -π/6", "120 2π/3", "-30 -π/6",
			"-45 -π/4", "135 3π/4", "-45 -π/4",
			"-60 -π/3", "150 5π/6", "-60 -π/3",
			"-90 -π/2", "180 π"};

	public static void main(String[] args) {
		
	}
	
	
	public static QuestionAndAnswerPair[] setQAndAPair() {
		QuestionAndAnswerPair[] qAndA = new QuestionAndAnswerPair[keyQ.length];
		for (int i = 0; i < qAndA.length; i++) {
			qAndA[i] = new QuestionAndAnswerPair(keyQ[i], keyA[i], i);
			//System.out.println(qAndA[i].getAnswer());
		}
		return qAndA;
	}
	
}
