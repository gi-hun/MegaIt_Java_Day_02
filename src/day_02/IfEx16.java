/*
 * # 가운데 숫자 맞추기 게임
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249		: 4
 */
//01:46-01:56

package day_02;

import java.util.Scanner;
import java.util.Random;

public class IfEx16 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num = ran.nextInt(101) + 150;
		System.out.println("랜덤 숫자 저장");
		System.out.println(num);
		
		System.out.println("가운데 숫자를 정하시오:");
		int select = sc.nextInt();
		int result = num/10%10;
		
		if(select == result)
		{
			System.out.println(num+"    :    "+select);
			System.out.println("정답!");
		}
		else if(select != result)
		{
			System.out.println(num+"    :    "+select);
			System.out.println("오답!");
		}
	}
}
