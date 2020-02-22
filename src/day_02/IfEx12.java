/*
 * # 최대값 구하기[1단계]
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */
//12:26-12:32

package day_02;

import java.util.Scanner;

public class IfEx12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 A를 입력해주세요");
		int A = sc.nextInt();
		System.out.println("정수 B를 입력해주세요");
		int B = sc.nextInt();
		System.out.println("정수 C를 입력해주세요");
		int C = sc.nextInt();
		
		int max = A;
		
		if(max < B) {
			max =B;
		}
		if(max < C) {
			max = C;
		}
		
		System.out.println("최댓값:" + max);
	}
}
