package day_02;

import java.util.Scanner;

class IfEx09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 2:30 ~ 2:50(20��)
		
		int dbID= 1234;
		int dbPW = 1111;
		
		System.out.println("ID�� �Է����ּ���");
		int ID = sc.nextInt();
		
		if(ID != dbID) {
			System.out.println("ID�� Ȯ�����ּ���");
		}
		else if(ID == dbID) {
			System.out.println("PW�� �Է����ּ���");
			int PW = sc.nextInt();
			
			if(PW != dbPW) {
				System.out.println("PW�� Ȯ�����ּ���");
			}
			else if(PW == dbPW) {
				System.out.println("�α��� ����");
			}
		}
	}
}
