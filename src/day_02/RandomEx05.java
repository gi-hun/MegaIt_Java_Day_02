/*
 * # 구구단 게임[2단계]
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 랜덤하게 저장한다.
 * 2. 저장된 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */
//12:59-12:01:03

package day_02;

import java.util.Scanner;
import java.util.Random;

public class RandomEx05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int dan1 = ran.nextInt(9) +1;
		int dan2 = ran.nextInt(9) +1;
		int result = dan1 * dan2;
		
		System.out.print(dan1+"x"+dan2+"=");
		int my_result = sc.nextInt();
		
		if(result == my_result)
			System.out.println("정답");
		else
			System.out.println("땡");
		
	}
}
