
public class troubleshoot {
	static String[][] key = new String[2][3];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		for (int r = 0; r < key.length; r++) {
			for (int c = 0; c < key[0].length; c++) {
				key[r][c] = i + "";
				i++;
			}
		}
		
		for (int r = 0; r < key.length; r++) {
			for (int c = 0; c < key[0].length; c++) {
				System.out.print(key[r][c] + " ");
			}
			System.out.println();
		}
		System.out.println(key.length);
		System.out.println(key[0].length);
		
	}

}
