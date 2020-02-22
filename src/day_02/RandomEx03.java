/*
 * # ´çÃ·º¹±Ç[1´Ü°è] 30%ÀÇ ´çÃ·È®·ü
 */
//12:46-12:48

package day_02;

import java.util.Random;

public class RandomEx03 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int rotto = ran.nextInt(10);
		
		if(rotto < 3)
			System.out.println("´çÃ·!");
		else
			System.out.println("²Î!");
	}
}
