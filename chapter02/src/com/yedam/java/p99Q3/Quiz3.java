package com.yedam.java.p99Q3;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("[필수 정보 입력");
			
			System.out.print("1. 이름: ");
			String name = scanner.nextLine();
			
			System.out.print("2. 주민번호 앞 6자리: ");
			String ssn = scanner.nextLine();
			
			System.out.print("3. 전화번호: ");
			String tel = scanner.nextLine();
			
			System.out.println();
			
			System.out.println("[입력된 내용]");
			System.out.println("1. 이름: " + name);
			System.out.println("2. 주민번호 앞 6자리:" + ssn);
			System.out.println("3. 전화번호 : " + tel);
			}
		
		int x =10;
		int y =10;
		int result;
		
		//1-1) 부호연산자를 이용하여 변수 x의 값을 음수로 출력하세요. 단, 변수 x의 값은 변하지 말아야 한다.
		int result1 = +x;
		System.out.println("x : " + x );
		
		//1-2) 변수 x와 y의 값을 더한 후 y의 값을 증가시키는 연산식을 한줄로 작성하여라.
		
		//1-3) 변수 x와 y의 값을 더한 값이 20이 되도록 변수 x와 y 중 하나의 변수에 증감연산자를 사용하여 연산식을 한줄로 작성하여라.
		
		//1-4) 변수 x에서 변수 y를 나눈 후 몫과 나머지를 출력하여라.

	}

}
