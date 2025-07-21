package drill03;

public class ex04 {

	public static void main(String[] args) {
		
		/**
		 * 
		 * 문제 4. 세 수 중 최댓값 구하기
		 * 
		 * 변수 x, y, z 중 가장 큰 값을 출력하세요.
		 * 
		 * 
		 */

		int a = 20;
		int b = 21;
		int c = 22;
				
				
		if(a > b) {
			
			if(a > c) {
			
				System.out.println(a);
				
			}
				else {
					
					System.out.println(c);
					
				}
				
		}
				 
			else  {
				if(b > c) {
					System.out.println(b);
			} 
				else {
					System.out.println(c);
				}
		}
	
	}

}


