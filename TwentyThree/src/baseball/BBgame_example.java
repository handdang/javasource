package baseball;

import java.util.Scanner;


public class BBgame_example {
	//�ʵ� 
	int comNum[] = new int[3];
	int userNum[] = new int[3];
	
	//������
	BBgame_example(){};
	//�޼ҵ�
	void makeComNum() {
		while(true) {
			if((comNum[0]!= comNum[1])&&
					(comNum[0]!=comNum[2])&&
					(comNum[1]!= comNum[3]));
			break;
		}
		
		for(int i=0; i<comNum.length; i++) {
		comNum[i] = (int)((Math.random()*10));
		System.out.println(comNum[i]);
		}
		}

	void getUserNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		for(int i=0; i<userNum.length; i++) {
		System.out.println(i + 1 +"�� °�� :");
		userNum[i] = sc.nextInt();
		
		if(userNum[i]>=10 || userNum[i]<1) {
			System.out.println("1-9�� ���ڸ� �Է��ϼ���");
			System.out.print(i+1+"��° �� : ");
			userNum[i] = sc.nextInt();
		}
		
		}
	}
	void compareNum() {
		makeComNum();
		getUserNum();
	while(true) {
		int strike = 0;
		int ball = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(comNum[i] == userNum[j] && i ==j) {
					strike = strike +1;
				}else  if(comNum[i] == userNum[j] && i!= j) {
					ball = ball + 1;
				}
			}
		}
		
		if(strike == 3) {
			System.out.println("�����Դϴ�.");
			
		}else {
			System.out.println(strike + "strike, " + ball +
					"ball \n");
			getUserNum();
		}
		
	}
	}
}



