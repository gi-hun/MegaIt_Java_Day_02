//������ �� �ܿ��

package day_02;

import java.util.Scanner;

public class IfEx18_answer {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̿��� ������ ���� �Է��ϼ��� : ");
		int station = scan.nextInt();
		
		int fee = 0;
		if(1 <= station && station <= 5) {
			fee = 500;
		}else if(6 <= station && station <= 10) {
			fee = 600;
		}else {
			if(station % 2 == 1) {
				fee =  (station - 10) / 2 * 50;
                fee = fee + 650;
			}else{
               fee = (station - 10) / 2 * 50;
               fee = fee + 600;
            }
			
		}
		
		System.out.println("��� = " + fee + "��");
		
	}
}
