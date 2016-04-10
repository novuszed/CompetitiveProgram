import java.util.*;

public class Arithmagic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numcase = sc.nextInt();
		// int[]arr=new int[1001];
		for (int a = 0; a < numcase; a++) {

			int num = sc.nextInt();
			// int[] arr = new int[num];
			ArrayList<Integer> arr = new ArrayList<Integer>();
			ArrayList<Integer> sum = new ArrayList<Integer>();
			for (int b = 0; b < num+1; b++) {
				arr.add(sc.nextInt());

			}
			sum.add(arr.get(0));
			//System.out.println(arr.get(arr.size()-1));
			if(doesCompute(arr, sum, 0, 0, 0, arr.get(arr.size() - 1), 0))
			{
				System.out.println("PASS");
				
			}
			else
			{
				System.out.println("FAIL");
			}
			
		}

		sc.close();
	}

	public static boolean doesCompute(ArrayList<Integer> arr, ArrayList<Integer> sum, int curr_sum, int counter, int index,
			int goal, int arith) {
		//System.out.println(counter);
		if (counter == arr.size() - 2 && curr_sum == goal) {
			//System.out.println("sum: "+sum);
			return true;
		} else {
			for (int i = index; i < arr.size()-1; i++) {
				if (arith == 0) {
					int temp = sum.get(sum.size()-1) + arr.get(sum.size());
					sum.add(temp);
					if(doesCompute(arr, sum, sum.get(sum.size() - 1), counter + 1, index + 1, goal, arith))
							return true;
				} else if (arith == 1) {
					int temp = sum.get(sum.size()-1) - arr.get(sum.size());
					//System.out.println("sum: "+sum.get(sum.size()-1)+" index: "+index);
					//System.out.println(temp);
					sum.add(temp);
					if(doesCompute(arr, sum, sum.get(sum.size() - 1), counter + 1, index + 1, goal, arith))
							return true;
				} else if (arith == 2) {
					int temp = sum.get(sum.size()-1) * arr.get(index + 1);
					sum.add(temp);
					if(doesCompute(arr, sum, sum.get(sum.size() - 1), counter + 1, index + 1, goal, arith))
							return true;
				}
				arith++;
				arith=arith%3;
				sum.remove(sum.size() - 1);
				sum.trimToSize();
				//System.out.println("since it failed: sum: "+sum.get(sum.size()-1)+" index: "+index);
			}

		}
		return false;
	}
}
