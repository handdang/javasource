package findnum;

import java.util.Scanner;

public class FindNum {
	//�ʵ�
	int comNum;
	int userNum;
	//������
	FindNum() {};
	//�޼���(���)
	
	//��ǻ�Ͱ� �������� ����� ���� �޼ҵ�
	void makeComNum() {
		comNum = (int)(Math.random()*10); //comNum�� ���Է�
		System.out.println(comNum);
	}
	//����ڰ� ���ڸ� �Է��ϴ� �޼ҵ�
	void getUserNum() {
		Scanner sc = new Scanner(System.in);
		//���� �Է¹ޱ����� Scanner���
		userNum = sc.nextInt();
	}
	
	//�� ���ڸ� ���ϴ� �޼ҵ�
	void compareNum() {
		//��ǻ�Ͱ� �������� ���� ���ڸ� Ȯ���ϴ� �޼ҵ�
		makeComNum();
		
		//����ڰ� ���� ���ڸ� Ȯ���ϴ� �޼ҵ�
		getUserNum();
		
		//�����϶� ������ӵ�����.
		while(true) {
			//��ǻ�� ���ڿ� ����� ���ڰ� ������
		if(comNum == userNum) {
			System.out.println("�����Դϴ�.");
			//�����϶� break�ɰ� ���� ���´�.
			break;
		}else {
			System.out.println("�����̾ƴմϴ�.");
			getUserNum();
		}
		}
	}
}
