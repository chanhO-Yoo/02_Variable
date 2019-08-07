package kh.java.type;

/*
 * 변수 : 메모리(RAM)에 한개의 값을 기록하기 위한 공간
 * 1.기본형(Primitive Type)
 * 	- 실제 데이터(값,Literal)를 저장
 * 	- 논리형, 문자형, 숫자형(정수,실수형)등 8개의 기본 자료형이 있다.
 * 	- 각 자료형마다 데이터 저장 크기가 다름
 * 2.참조형(Reference Type)
 * 	- 데이터가 저장된 주소가 저장됨(객체의 주소)
 * 	- 기본형을 제외한 모든 타입(사용자 정의 타입 포함)
 * 	- 4byte로 크기가 지정(1byte = 8bit, 1kb = 1024byte, 1mb = 1024kb, 1gb = 1024mb, 1tb = 1024gb, 1peta, 1exa, 1zetta, 1yotta...) 
 * 
 * 
 * 기본자료형(원시자료형)
 *  1. 문자형   : 한 글자를 표현(2byte=16bit=>0~65535(35536가지 표현)
 *    (char)   ' ' 따옴표로 표현함  
 *  
 *  2. 숫자형
 *    2-1 정수형
 *      - byte  	: 1byte, -128~127(256가지 표현)
 *      - short 	: 2byte, -32,768 ~ 32,767
 *      - int(기본형) : 4byte, -2,147,483,648 ~ 2,147,483,647(약 -21억 ~ 21억)
 *      - long  	: 8byte, -922경 ~ 922경
 *    
 *    
 *    2-2 실수형
 *    	- float			: 4byte, 정밀도 소수점이하 7자리 유효함 
 *      - double(기본)	: 8byte, 정밀도 소수점이하 16자리 유효함
 *  
 *  3. 논리형(boolean) : 1byte, true/false
 *  	- 다른 타입 0,1로 대체 불가
 */

public class PrimitiveType {
	public static void main(String[] args) {
		PrimitiveType p = new PrimitiveType();
//		p.test1();
//		p.test2();
//		p.test3();
//		p.test4();
		p.test5();
	}

	
	public void test1() {
		/*
		 * 1. 변수 선언
		 *  - 자료형 변수명;
		 *  ex) int i; long l; byte b, short sh,
		 */
		int i;
		long l;
		byte b;
		short sh;
//		short 100sh;
		short sh100;
		
		float f;
//		float if;
		
		// 대소문자를 구분하기 때문에 d,D는 변수로 동시 사용 가능
		double d;
		double D;
		
		char ch;
		String str;
		String _str;
		String $tr;
		
		boolean bool;
		boolean flag;
		/*
		 * 2. 변수 대입/사용
		 * 
		 */
		b = 100;
//		b = 200; // 바이트 범위를 초과하기 떄문에 오류
		
		sh = 20000;
//		sh = 50000; // short 범위를 초과하기 때문에 오류
		
		i = 2147483647; // int형의 최대값
//		i = 2147483648; // int 범위를 초과하기 때문에 오류
		
		l = 10101010102020L; // 정수의 기본형인 int로 인식하기 때문에 long의 경우 l, L을 접미사로 사용(대문자 L 선호)
		
		f = 0.1234567890F; // 실수의 기본형인 double로 인식하기 때문에 f,F를 접미사로 사용(소문자 f 선호), 보장하는  7번째 자리까지는 정확히 출력
		
		d = 0.12345678901234567890; // 보장하는 16번째 자리까지는 정확히 출력
		
		ch ='ㅎ';
		ch = 'a';
//		ch ='가나'; //문자형 변수에는 1개의 문자만 들어간다.
		str = "가나다"; // 문자열 String은 기본형 변수는 아니다.
		
		bool = true;
		bool = false;
		bool = 5>2; // greater than(왼쪽 기준으로), 5가 2보다 큰가?
		
		int num1 = 100;
		int num2 = 100;
		bool = num1 == num2; // ==는 비교연산자
		flag = (5/2) > 2; // 정수와 정수의 연산은 결과값도 정수다.
						  // 5/2 => 2, 2 > 2 => false
		flag = (5%2) == 1; // 나머지 연산자(%), 5%2 = 1, 1 == 1 => ture
		
		System.out.println("b="+b);
//		System.out.println("b="+b); //ctrl + alt + 방향키 위/아래 = 복사해서 위아래 붙여넣기
//		System.out.println("b="+b); //ctrl + d = 해당 라인 삭제
		System.out.println("sh="+sh);
		System.out.println("i="+i);
		System.out.println("l="+l);
		System.out.println("f="+f);
		System.out.println("d="+d);
		System.out.println("ch="+ch);
		System.out.println("bool="+bool);
		System.out.println("flag="+flag);
	}
	
	public void test2() {
		/*
		 * 초기화 : 선언 + 대입
		 */
		int num = 123;
		System.out.println("num="+num);
		
		/*
		 * 상수 : 처음 대입된 값 이후로는 변경 불가능, final 사용
		 */
		
		final int AGE = 25; // 자바 개발자 관례로 모두 대문자로 변수명 작성
//		AGE = 26; //변경 불가능
		
		//기본형 최소값, 최대값
		byte maxByte = Byte.MAX_VALUE;
		byte minByte = Byte.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		short minShort = Short.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		long minLong = Long.MIN_VALUE;
		
		System.out.printf("byte: %s ~ %s\n", minByte, maxByte);
		System.out.printf("short: %s ~ %s\n", minShort, maxShort);
		System.out.printf("int: %s ~ %s\n", minInt, maxInt);
		System.out.printf("long: %s ~ %s\n", minLong, maxLong);
	}
	
	/*
	 * Data Overflow
	 * 최대값이 넘치면 제일 작은 수로 다시 돌아간다.
	 * 변수 공간은 한정적이기 때문에 돌아간다.
	 */
	
	public void test3() {
		int i = Integer.MAX_VALUE; // 2147483647
		i = i + 1;
		System.out.println("i="+i); // 데이터 오버플로우
	}
	
	public void test4() {
		char c = '헐';
		System.out.println((int)c);
		
		char ga = '\uac00';
		char na = '\ub098';
		char da = '\ub2e4';
		System.out.printf("%c %c %c\n", ga, na, da);
		
		char rak = '\uf914';
		System.out.printf("%c\n", rak);
	}
	
	public void test5() {
		System.out.println("Hello World1");
		//1. String을 리터럴으로 생성
		//자주 사용되므로 기본형처럼 사용 가능하다.
		String s = "hello world2"; 
		System.out.println(s);
		
		//2. 객체를 생성해서 사용
		//문자열은 참조형 변수
		String s2 = new String("hello world3");
		System.out.println(s2);
		
		String s3 = new String("hello" + " world4");
		System.out.println(s3);
	}
}
