package day_02;

import java.util.Random;

public class IfEx17_answer {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int rNum = ran.nextInt(50) + 1;
		System.out.println("���� = "
				+ ""
				+ "" +rNum);
		
		int x = rNum/10;     //�����ڸ�
		int y = rNum%10;     //�����ڸ�
		
		int cnt = 0;
		
		if(x == 3 || x == 6 || x == 9) {
			cnt++;
		}
		if(y == 3 || y == 6 || y == 9) {
			cnt++;
		}
		if(cnt ==2 )
			System.out.println("¦¦");
		else if(cnt == 1)
			System.out.println("¦");
		else
			System.out.println(rNum);
	}
}
