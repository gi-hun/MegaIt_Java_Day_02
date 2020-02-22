package day_02;

import java.util.Scanner;

class IfEx06 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하시오");
		int fnum = sc.nextInt();
		System.out.print("두번째 숫자를 입력하시오");
		int snum = sc.nextInt();
		
		int result1 = fnum*snum;
		System.out.print("결과 값을 입력하시오:");
		int result2 = sc.nextInt();
		
		if(result1 == result2)
			System.out.println("정답입니다.");
		else 
			System.out.println("오답입니다");
	}
}

