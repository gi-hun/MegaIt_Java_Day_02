package day_02;

import java.util.Scanner;

public class IfEx08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ű�� �Է����ּ���");
		int height = sc.nextInt();
		
		if(height >=120) {
			System.out.println("���̱ⱸ�� ����� �� �ֽ��ϴ�.");
		}
		if(height < 120) {
			System.out.println("�θ�԰� ���� ���̽��ϱ�?");
			int answer = sc.nextInt();
			
			if(answer == 1) {
				System.out.println("���̱ⱸ�� ����� �� �ֽ��ϴ�.");
			}
			else if(answer == 0) {
				System.out.println("���̱ⱸ�� ����� �� �����ϴ�.");
			}
		}
	}
}
