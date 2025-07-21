package drill03;

public class ex08 {

	public static void main(String[] args) {
		
		/**
		 * 
		 * 문제 8. 점수에 따른 Pass/Fail 출력
		 * 
		 * 평균 점수가 60점 이상이면서, 과락(과목 하나가 40점 미만)이 없으면 "Pass", 아니면 "Fail" 출력
		 * 
		 * 
		 */
		
				
		int a = 23;
		int b = 34;
		int c = 45;
				
		float d = (a + b + c) / 3;
		
		if(a < 40 || b < 40 || c < 40) 
			System.out.println("Fail");
		
		else if(d < 60)
			System.out.println("Fail");
				
		else 
			System.out.println("Pass");
	
	}

}
