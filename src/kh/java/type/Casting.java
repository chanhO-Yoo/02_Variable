package kh.java.type;

/**
 * 컴퓨터 작동원리
 *  1. 연산은 같은 데이터 타입간에 가능하다.
 *  2. 값은 해당데이터타입의 변수에만 대입 가능하다.
 *  3. 연산 결과 동일한 데이터 타입을 가진다.
 * 
 * long ln = 10000L;
 * int i = 100;
 * System.out.println(ln+i);
 * 
 * 형변환
 *  1. 암묵적 형변환(auto, 자동)
 *   byte 1 -> short 2 -> int 4 -> long 8 -> float 4 -> double 8
 *             char 2  -> int 4
 *             
 *  2. 명시적 형변환(manual, 수동)
 */

public class Casting {
	public static void main(String[] args) {
		Casting c = new Casting();
//		c.test1();
//		c.test2();
//		c.test3();
		c.test4();
	}
	
	public void test1() {
		//1. 자료형이 다른 변수에 대입할 때
		//byte -> int로 변환
		byte bnum = 100;
		int i = bnum; // int i = (int)bnum; (명시적 형변환 방식)
		System.out.println("i="+i);
		
		//2. 자료형이 다른 두 변수의 산술 연산할 때
		//int -> double로 변환
		int a =3;
		double b = 5.7;
		// a + b = > 3.0 + 5.7 => 8.7
		System.out.println("a+b="+(a+b));
		
		//3. char -> int 변환
		char aCh = 'a';//97 - ASCII code 참조
		char bCh = 'b';//98
		char ch0 = '0';//48
		int i_aCh = aCh; // (int)char -> int
		int i_bCh = bCh;
		int i_ch0 = ch0;
		
		System.out.println("i_aCh="+i_aCh);
		System.out.println("i_bCh="+i_bCh);
		System.out.println("i_ch0="+i_ch0);
		
		System.out.println('B'+100); // (int)char + int => 66+100 => 166
	}

	public void test2() {
		//1. Data Overflow 방지 (더 큰 변수형으로 변환하여 계산)
		int num = Integer.MAX_VALUE;
		System.out.println(num+1);
		System.out.println((long)num+1); // long + int => long + (long)int
		long result = (long)num + 1;
		System.out.println("result="+result);
		
		//2. 데이터손실이 있는 강제 형변환(거의 사용할 일 없다.
		int no = 290;
		byte bNum = (byte)no;
		System.out.println("bNum="+bNum);
		
	}
	
	public void test3() {
		//byte, short, char(int 이하 타입) 타입 연산시 주의사항
		//산술연산시 자동으로 int로 형변환 후 연산한다.
		byte b1 = 10;
		byte b2 = 20;
//		byte result = b1 + b2; //byte + byte => int + int
		byte result = (byte)(b1 + b2);
		System.out.println("result="+result);
		
		//char타입에서 주의사항
		char ch = 97;//char <- int, 자동 형변환의 역순이지만 잘 작동함. (단, 범위 안에 있는 수일 경우에)
//		char ch = (char)97; // 형변환을 하지 않아도 된다.
		System.out.println(ch);
		System.out.println("ch="+ch);
		System.out.println("ch+1="+ch+1);//"ch+1="+ch : 문자열 + 문자 => 문자열, "ch+1=a"+1 => 문자열+숫자 => 문자열
		System.out.println("ch+1="+(ch+1));//소괄호 먼저 처리되어 ch+1 => char + int => 97+1 => 98, "ch+11="+98
	}
	
	public void test4() {
		System.out.println("A="+('A'+0));			//예상값 : A=A0 || 묵시적 형변환시 자연스럽게 큰 자료값으로 계산한다.(char < int => int로 계산)
													//결과값 : A=65
		System.out.println("0="+('0'+0));			//예상값 : 0=00 || 묵시적 형변환시 자연스럽게 큰 자료값으로 계산한다.(char < int => int로 계산)
													//결과값 : 0=48
		System.out.println("(char)65="+(char)65);	//예상값 : (char)65=65
													//결과값 : (char)65=A
		byte b = 125;
		char ch = 'C';
		int result = b - ch;
		System.out.println("result="+result);		//예상값 : result=58 || 125 - 67 = 58
													//결과값 : result=58
		boolean bool;
		bool = (2.0 == 5/2);						//과정 : 2.0 == (double)2
		System.out.println("bool="+bool);			//예상값 : bool=true
													//결과값 : bool=true
		bool = ('A' == 65);							//과정 : 'A' => 65, int == int
		System.out.println("bool="+bool);			//예상값 : bool=false
													//결과값 : bool=true
		bool = ('A' == 'B'-1);						//과정 : 'B'-1 => char - int = int => 66-1 = 65, 'A' == 65(위와 동일) 
		System.out.println("bool="+bool);			//예상값 : bool=true
													//결과값 : bool=true
		//부정 연산자 : 다르면 참, 같으면 거짓
		bool = ('a' != 97);							//과정 : char != int => int, (int)'a'= 97, 같기 때문에 false 출력
		System.out.println("bool="+bool);			//예상값 : bool=true
													//결과값 : bool=false
	}
}
