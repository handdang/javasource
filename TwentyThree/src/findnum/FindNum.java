package findnum;

import java.util.Scanner;

public class FindNum {
	//필드
	int comNum;
	int userNum;
	//생성자
	FindNum() {};
	//메서드(상수)
	
	//컴퓨터가 랜덤으로 만드는 숫자 메소드
	void makeComNum() {
		comNum = (int)(Math.random()*10); //comNum에 값입력
		System.out.println(comNum);
	}
	//사용자가 숫자를 입력하는 메소드
	void getUserNum() {
		Scanner sc = new Scanner(System.in);
		//갑을 입력받기위해 Scanner사용
		userNum = sc.nextInt();
	}
	
	//두 숫자를 비교하는 메소드
	void compareNum() {
		//컴퓨터가 랜덤으로 넣은 숫자를 확인하는 메소드
		makeComNum();
		
		//사용자가 넣은 숫자를 확인하는 메소드
		getUserNum();
		
		//정답일때 까지계속돌린다.
		while(true) {
			//컴퓨터 숫자와 사용자 숫자가 같을때
		if(comNum == userNum) {
			System.out.println("정답입니다.");
			//정답일때 break걸고 빠져 나온다.
			break;
		}else {
			System.out.println("정답이아닙니다.");
			getUserNum();
		}
		}
	}
}
