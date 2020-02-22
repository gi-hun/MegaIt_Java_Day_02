package day_02;

import java.util.Scanner;

class IfEx09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 2:30 ~ 2:50(20분)
		
		int dbID= 1234;
		int dbPW = 1111;
		
		System.out.println("ID를 입력해주세요");
		int ID = sc.nextInt();
		
		if(ID != dbID) {
			System.out.println("ID를 확인해주세요");
		}
		else if(ID == dbID) {
			System.out.println("PW를 입력해주세요");
			int PW = sc.nextInt();
			
			if(PW != dbPW) {
				System.out.println("PW를 확인해주세요");
			}
			else if(PW == dbPW) {
				System.out.println("로그인 성공");
			}
		}
	}
}
