/*
 * # 369게임[1단계]
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */
//01:59-02:09
package day_02;

import java.util.Scanner;
import java.util.Random;

public class IfEx17 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num = ran.nextInt(50) + 1;
		
		if((num/10)%3 == 0) {
			if((num%10)%3 == 0)
			{
				System.out.println(num+"  :  짝짝");
			}
			else
			{
				System.out.println(num+"  :   짝");
			}
		}
		else if((num%10)%3 == 0) {
			if((num/10)%3 == 0)
			{
				System.out.println(num+"  :  짝짝");
			}
			else
			{
				System.out.println(num+"  :   짝");
			}
		}
		else
			System.out.println(num+"  :  "+num
					);
	}
}
