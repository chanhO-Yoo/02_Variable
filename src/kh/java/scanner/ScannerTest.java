package kh.java.scanner;

import java.util.Scanner;

/**
 * java.util.Scanner
 * java 1.5에서 소개
 * 
 * 사용자 표준 입출력(키보드 : System.in)을 대상으로 하는 입력스트림
 * 사용자 입력값을 해당 타입으로 형변환 하는 메소드 제공
 *
 * 표준입력(키보드) : System.in
 * 표준출력(콘솔) : System.out
 * 
 */

public class ScannerTest {
	public static void main(String[] args) {
		ScannerTest st = new ScannerTest();
		st.test();
	}
	public void test() {
		//Scanner 객체 만들기
		Scanner sc = new Scanner(System.in);
		
		System.out.println(">정수(int)를 입력하세요");
		int i = sc.nextInt();
		//int i = 123;
		System.out.println("사용자 입력값 : " + i);
		
		System.out.println(">정수(long)를 입력하세요");
		long l = sc.nextLong();
		System.out.println("사용자 입력값 : " + l);
		
		System.out.println(">실수(double)를 입력하세요");
		double d = sc.nextDouble();
		System.out.println("사용자 입력값 : " + d);
		
		System.out.println(">불린값(boolean)을 입력하세요");
		boolean b = sc.nextBoolean();
		System.out.println("사용자 입력값 : " + b);
		
		//문자열에 대한 처리
		//char변환 메소드는 없다.
//		char ch = sc.nextChar();
		System.out.println(">문자(char)를 입력하세요");
		String s = sc.next();//문자열을 입력 받는다
		char ch = s.charAt(0);//그 중 첫번째 글자(index 0)을 저장
		System.out.println("사용자 입력값 : " + ch);
		System.out.println(">성별을 입력하세요(남/여)>");
		char gender = sc.next().charAt(0);
		System.out.println("성별: "+gender);
		
		//next() :문자열 이전에 만나는 공백/개행문자를 무시하고
		//문자열을 읽어올 때 만난 공백/개행문자 전까지만 읽어온다.
		//nextLine() : 공백 있는 문자까지 가져온다.
		// 처음만난 개행문자 까지만 읽어오고 개행문자는 버린다.
		System.out.println(">문자열(next)을 입력하세요");
		String str = sc.next();
		System.out.println("str = " + str);
		
		sc.nextLine();
		System.out.println(">문자열(nextLine)을 입력하세요");
		String str2 = sc.nextLine();
		System.out.println("str = " + str2);
	}
}
