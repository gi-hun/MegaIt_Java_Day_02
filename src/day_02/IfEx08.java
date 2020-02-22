package day_02;

import java.util.Scanner;

public class IfEx08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키를 입력해주세요");
		int height = sc.nextInt();
		
		if(height >=120) {
			System.out.println("놀이기구를 사용할 수 있습니다.");
		}
		if(height < 120) {
			System.out.println("부모님과 같이 오셨습니까?");
			int answer = sc.nextInt();
			
			if(answer == 1) {
				System.out.println("놀이기구를 사용할 수 있습니다.");
			}
			else if(answer == 0) {
				System.out.println("놀이기구를 사용할 수 없습니다.");
			}
		}
	}
}
