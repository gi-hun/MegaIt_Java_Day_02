/*
 * # 코인 게임
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */
//12:40-12:43
package day_02;


import java.util.Scanner;
import java.util.Random;

public class RandomEx02 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int coin = ran.nextInt(2);
		
		System.out.println("앞(1), 뒷(0)면을 선택하시오");
		int select = sc.nextInt();
		
		if(coin == select)
			System.out.println("정답");
		else if(coin != select)
			System.out.println("꽝");
	}
}

//내가 푼것이랑 정답이랑 다르면 어떻하죠?
// 최댓값 풀 때 나는 삼항 연산자 아니면 if문 중첩으로 풀었는데 정답을 달랐다 -> 정답 알고리즘이 좋아서 외움
//나머지 문제는 알고리즘은 거의 비슷했음
