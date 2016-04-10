import java.util.*;

public class MorseDecode {
	public static HashMap<String, Integer> map = new HashMap<String, Integer>();
	public static int count = 0;
	public static ArrayList<String> letter = new ArrayList<String>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 26; i++) {
			letter.add(sc.next());
		}
		map.put("", 1);
		/*
		 * for(int i=0;i<26;i++) { System.out.println(morseCode[i]); }
		 */
		int numCase = sc.nextInt();
		for (int i = 0; i < numCase; i++) {
			String currMorse = sc.next();
			int tempCount = solve(currMorse);

			int mod = tempCount % 1000000007;
			System.out.println(mod);

		}
		sc.close();
	}

	public static int solve(String morse) {
		if (map.containsKey(morse)) {
			return map.get(morse);
		}
		int tempCount = 0;

		for (int i = 1; i < morse.length() + 1; i++) {
			String first = morse.substring(0, i);
			if (letter.contains(first))
				map.put(morse, tempCount += solve(morse.substring(i)));

		}
		return map.get(morse);

	}

}
