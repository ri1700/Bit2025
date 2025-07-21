package drill03;

public class ex05 {

	public static void main(String[] args) {
		
		/**
		 * 문제 5. 알파벳 대/소문자 구분
		 * 
		 * 변수 ch가 대문자(A - Z)이면 "대문자",
		 * 소문자(a - z)이면 "소문자"를 출력하세요.
		 * 
		 * 
		 */

		
		char a = 'u';
		
		if('A' <= a && a <= 'Z') 
			System.out.println("대문자");
				
		else if('a' <= a && a <= 'z') 
					System.out.println("소문자");
				
	}
}


