package drill03;

public class ex09 {

	public static void main(String[] args) {
		
		/**
		 * 
		 * 문제 9. 간단한 로그인 시뮬레이션
		 * 
		 * 저장된 ID/PW와 사용자가 입력한 값이 모두 일치하면 "로그인 성공" 출력.
		 * 둘 중 하나라도 다르면 "로그인 실패" 출력.
		 * 
		 * 
		 */
		
			String a = "ri1700";
			String b = "qwer123";

			String inputa = "ri1700";
			String inputb = "qwer12";

				
			if(inputa.equals(a) && inputb.equals(b)) // 둘 다 동일할 시 성공, a = inputa
				System.out.println("로그인 성공");
				
			else 
				System.out.println("로그인 실패");
				
	}

}
