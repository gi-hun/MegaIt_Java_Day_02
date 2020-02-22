/*
 * # 지하철 요금 계산
 * 1. 이용할 정거장 수를 입력받는다.
 * 2. 다음과 같이 정거장 수에 따라 요금이 정산된다.
 * 3. 요금표
 * 1) 1~5	: 500원
 * 2) 6~10	: 600원
 * 3) 11,12 : 650원
 * 4) 13,14 : 700원
 * 5) 15,16 : 750원
 * ... 
 */
//02:19-02:24

package day_02;


import java.util.Scanner;

public class IfEx18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 정거장을 이용할 것 인가?");
		int user = sc.nextInt();
		
		if(user >= 15)
			System.out.println("750원");
		else if(user >= 13)
			System.out.println("700원");
		else if(user >= 11)
			System.out.println("650원");
		else if(user >= 6)
			System.out.println("600원");
		else if(user >= 1)
			System.out.println("550원");
	}
}
