package day_02;

import java.util.Random;

public class IfEx17_answer {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int rNum = ran.nextInt(50) + 1;
		System.out.println("¹®Á¦ = "
				+ ""
				+ "" +rNum);
		
		int x = rNum/10;     //½ÊÀÇÀÚ¸®
		int y = rNum%10;     //ÀÏÀÇÀÚ¸®
		
		int cnt = 0;
		
		if(x == 3 || x == 6 || x == 9) {
			cnt++;
		}
		if(y == 3 || y == 6 || y == 9) {
			cnt++;
		}
		if(cnt ==2 )
			System.out.println("Â¦Â¦");
		else if(cnt == 1)
			System.out.println("Â¦");
		else
			System.out.println(rNum);
	}
}
