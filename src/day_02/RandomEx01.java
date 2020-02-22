package day_02;

import java.util.Random;

public class RandomEx01 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int rNum = ran.nextInt(3);
		System.out.println(rNum);
		
		rNum = ran.nextInt(5) + 1;
		System.out.println(rNum);
		
		rNum = ran.nextInt(7) - 3;
		System.out.println(rNum);
	}
}


/*int rnum 메모리 공간 생성후

rnum 선언 하지 않고
다시 int rnum = ~ 선언해주면 
error나는 이유가 rnum이라는 변수 이름으로 이미 메모리 공간 할당 해줬는데
또 다른 공간을 할당하려고 하는데 변수 이름이 같아서 그런건가요?*/