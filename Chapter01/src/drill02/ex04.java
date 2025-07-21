package drill02;

public class ex04 {

	public static void main(String[] args) {
		
		/**
		 * 문제 4. 형변환 결과 예측
		 * 
		 * int i = 257; byte b = (byte) i; System.out.println("b = " + b);
		 * 
		 * 예상 출력: b = 1
		 * 
		 */
		
		int i = 257;
		byte b = (byte) i;
		System.out.println("b = " + b);		// b = 1, 257은 -128 ~ 127을 넘는 숫자 여서 오버플로우가 발생 남는 값은 1
		
	}

}
