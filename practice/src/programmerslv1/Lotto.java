package programmerslv1;

import java.util.Arrays;

public class Lotto {
	
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		
		
		System.out.println("sol1" + Arrays.toString(lotto.solution(new int[] {44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19})));
	}
 
	 public int[] solution(int[] lottos, int[] win_nums) {
		 // lottos는 길이 6인 정수배열
		 // lottos의 모든 원소는 0이상 45이하의 정수
		 // *0은 알아볼 수 없는 숫자를 의미,
		 // *0을 제외한 다른 숫자들은 lottos에 2개 이상 담겨있지 않음
		 // *lottos의 원소들은 정렬되어 있지 않을 수도 있습.
		 
		 int[] answer = new int[2];
		 int match = 0;
		 int zeroCount = 0;
		 
		 Arrays.sort(lottos);
		 Arrays.sort(win_nums); 
		 
		 for(int i = 0; i < lottos.length; i++) {
			 if(lottos[i] == 0) {
				 zeroCount++;
				 System.out.println("lotto zeroCount >>" + zeroCount);
				 continue;
			 }
			 
			 for(int j = 0; j < win_nums.length; j++) {
				 if(lottos[i] == win_nums[j]) {
					 match++;
				System.out.println("win_nums match >>" + match);
					 break;
				 }
			 }
		 }
		 
		 answer[0] = getRank(match + zeroCount); 
		 System.out.println("answer[0] => getRank(match + zeroCount) >> " + getRank(match + zeroCount));
		 answer[1] = getRank(match); 
		 System.out.println("answer[1] => getRank(match) >> " + getRank(match));
		 
		 
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
