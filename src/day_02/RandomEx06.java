/*
 * # 가위(0)바위(1)보(2) 게임[2단계]
 * 1. com은 0~2 사이의 랜덤한 숫자를 저장한다.
 * 2. me는 0~2 사이의 숫자를 입력받는다.
 * 3. com과 me를 비교해,
 * 		1) 비겼다.
 * 		2) 내가 이겼다.
 * 		3) 내가 졌다.			를 출력한다.
 */
//01:07-01:17

package day_02;

import java.util.Scanner;
import java.util.Random;

public class RandomEx06 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int com = ran.nextInt(3);
		
		System.out.println("컴퓨터는 " + com);
		System.out.println("숫자를 입력해주세요");
		System.out.println("가위(0), 바위(1), 보(2)");
		int me = sc.nextInt();
		
		if(com == me)
		{
			System.out.println("비겼습니다.");
		}
		else if(me == 0) {
			if( com == 2)
				System.out.println("이겼습니다");
			else
				System.out.println("졌습니다");
		}
		else if(me == 1) {
			if( com == 0)
				System.out.println("이겼습니다");
			else
				System.out.println("졌습니다");
		}
		else if(me == 2) {
			if( com == 1)
				System.out.println("이겼습니다");
			else
				System.out.println("졌습니다");
		}
	}
}


// 문제 알고리즘은 비슷해도 스타일은 완전 다른데 괜찮은가요?