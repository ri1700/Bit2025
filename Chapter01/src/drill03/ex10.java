package drill03;

public class ex10 {

	public static void main(String[] args) {
		
		/**
		 * 
		 * 문제 10. switch 문 – 간단 계산기
		 * 
		 * num1, num2, op를 이용하여 사칙연산(+, -, *, /) 결과를 출력하는 switch문을 작성
		 * (예: op = '+'이면 덧셈 수행)
		 * 
		 */
	
			int a = 12;
			int b = 75;
			char c = '+';
				
				
			switch(c) {
				case '+' :
		
					System.out.println(a + b);
					break;
			
				case '-' :
						
					System.out.println(a - b);
					break;
				
				case '*' :
						
					System.out.println(a * b);
					break;
					
				case '/' :
					System.out.println(a / b);
					break;
					
				default:
					System.out.println("다시 입력하세요.");
				}
		}
}
