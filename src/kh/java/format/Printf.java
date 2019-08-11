package kh.java.format;

public class Printf {
	public static void main(String[] args) {
		Printf pf = new Printf();
		pf.test();
	}
	
	public void test() {
		boolean b = true;
		
		char c = '헐'; //(int)c = 54736
		char ga = '\uac00'; //유니코드를 표현하기 위해서는 \\u를 사용하여 해당 글자의 값으로 표현
		char na = '\uB098';
		char da = '\ub2e4';
		char rak = '\uF914';
		
		String str = "가나다";
		
		int i = 12345;
		
		float f = 1234.5678f;
		double d = 345.678;
	
		/*
		 * 문자형
		 * 
		 * %c : char을 표현하기 위한 format
		 * %s : String을 표현하기 위한 format
		 * 
		 */
		System.out.printf("%c, %c, %c, %c, %c, %s", c, ga, na, da, rak, str);
		System.out.println();
		
		/*
		 * 숫자형 - 정수형
		 * 
		 * %d : 10진수로 표현
		 * %o : 8진수로 표현
		 * %x : 16진수로 표현
		 * 단, 2진수는 포맷을 지원하지 않는다.
		 * => Interger.toBinaryString(i);로 변환
		 * 
		 */
		System.out.printf("%d, 0x%x,0%o,%s ",i,i,i,Integer.toBinaryString(i));
		System.out.println();
		
		/*
		 * 숫자형 - 실수형
		 * 
		 * %f : 소수점 아래 6자리
		 * %e : 지수 형태 표현
		 * %g : %e와 %f 중 더 짧은 표현을 사용
		 * %a, %A : 16진수 실수(대/소문자 표현)
		 * 
		 */
		
		System.out.printf("%f, %f, %A, %e, %g ",f,d,d,d,d);
		System.out.println();
		
		System.out.printf("%f, %f, %a, %e, %g ",f,d,d,d,d);
		System.out.println();
		
		/*
		 * 논리형
		 * 
		 * %b : boolean을 표현하기 위한 format
		 * 
		 */
		
		System.out.printf("%b",b);
		
		/*
		 * 너비 및 정렬 방법
		 * 
		 * %[flag][width]포맷
		 * flag 생략시 우측정렬
		 * flag = -(음수)좌측정렬
		 * 
		 */
		System.out.printf("%10d, %-10d ",i, i);
		System.out.println();
		
		/*
		 * 
		 * 소수점 아래 표시
		 * 
		 * %.2f : 소수점 둘째 자리까지 표현
		 */
		
		System.out.printf("%.3f",123.456789);
		System.out.println();
		
	}
}

