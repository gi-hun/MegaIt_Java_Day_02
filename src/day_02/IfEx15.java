/*
 * # ATM[1단계] : 이체하기
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */
//01:23-01:33
package day_02;

import java.util.Scanner;

public class IfEx15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
		
		System.out.println("이체할 계좌번호를 입력해주세요");
		int your_input = sc.nextInt();
		
		if(your_input == yourAcc) {
			System.out.println("이체할 금액을 입력 해주세요");
			int money = sc.nextInt();
			if(money > myMoney) {
				System.out.println("한도 초과");
			}
			else {
				myMoney = myMoney- money;
				yourMoney = yourMoney + money;
				System.out.println("내 잔액: " + myMoney);
				System.out.println("이체한 통장 잔액" + yourMoney);
			}
		}
		
		else
			System.out.println("계좌 번호를 확인해주세요");
		
	}
}
