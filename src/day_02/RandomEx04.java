/*
 * # 홀짝 게임
 * 1. 1~100사이의 랜덤 숫자를 저장한다.
 * 2. 저장된 랜덤 숫자를 보여주고,
 * 3. 해당 숫자가 홀수인지 짝수인지 맞추는 게임이다.
 */
//12:49-12:55

package day_02;

import java.util.Scanner;
import java.util.Random;

public class RandomEx04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int num = ran.nextInt(100)+1;
		System.out.println("저장된 랜덤 숫자 = " + num);
		
		if((num%2) == 0){
			System.out.println("숫자가 짝수(1), 홀수(0)");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.println("짝수 정답 입니다.");
			}
			else if(select == 0) {
				System.out.println("홀수 오답 입니다");
			}
		}
		else if((num%2) != 0){
			System.out.println("숫자가 짝수(1), 홀수(0)");
			int select = sc.nextInt();
			if(select == 0) {
				System.out.println("홀수 정답 입니다.");
			}
			else if(select == 1) {
				System.out.println("짝수 오답 입니다");
			}
		}
	}
}
