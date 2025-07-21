package drill03;

public class ex02 {

	public static void main(String[] args) {
		
		/**
		 * 
		 * 문제 2. 윤년(leap year) 판별
		 * 
		 * 연도가 다음 조건을 만족하면 윤년입니다:
		 * 
		 * 4의 배수이면서, 100의 배수가 아니거나,
		 * 400의 배수일 때
		 * 
		 */

		int a = 2040;
				
		if(a % 4 == 0 && (a % 100 != 0 || a % 400 == 0))
			System.out.println("윤년 입니다.");
			
		 else 
			System.out.println("윤년이 아닙니다.");
				
	}

}
