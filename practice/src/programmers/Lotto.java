package programmers;

import java.util.Arrays;

public class Lotto {
	
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		
		
		System.out.println("sol1" + Arrays.toString(lotto.solution(new int[] {44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19})));
	}

	 public int[] solution(int[] lottos, int[] win_nums) {
		 
		 int[] answer = new int[2];
		 int match = 0;
		 int zeroCount = 0;
		 
		 Arrays.sort(lottos);
		 Arrays.sort(win_nums);
		 
		 for(int i = 0; i < lottos.length; i++) {
			 //머여 시발
			 if(lottos[i] == 0) {
				 zeroCount++;
				 continue;
			 }
			 
			 for(int j = 0; j < win_nums.length; j++) {
				 if(lottos[i] == win_nums[j]) {
					 match++;
					 break;
				 }
			 }
		 }
		 
		 answer[0] = getRank(match + zeroCount); 
		 answer[1] = getRank(match); 
		 
	     return answer;
	    }

	public static int getRank(int n) {
		switch(n) {
		case 6:
			return 1;
		case 5: 
			return 2;
		case 4:
			return 3;
		case 3:
			return 4;
		case 2:
			return 5;
		default:
			return 6;
			
		}		
	}
}
