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


/*int rnum �޸� ���� ������

rnum ���� ���� �ʰ�
�ٽ� int rnum = ~ �������ָ� 
error���� ������ rnum�̶�� ���� �̸����� �̹� �޸� ���� �Ҵ� ����µ�
�� �ٸ� ������ �Ҵ��Ϸ��� �ϴµ� ���� �̸��� ���Ƽ� �׷��ǰ���?*/