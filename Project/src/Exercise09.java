import java.util.Scanner;


public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum =0;
		int[]Scores = null;
		Scanner scanner = new Scanner (System.in);
		
		while(run) {
			printMenu();
		
		int selectNo = scanner.nextInt();
		switch(selectNo) {
		
		case 1:
			System.out.println("학생수> ");
			studentNum = scanner.nextInt();
			break;
		
		case 2:
			Scores = inputScores(studentNum,Scores,scanner);
			break;
		case 3:
		printScores(Scores,studentNum);
			break;

		case 4:
			if(studentNum >0) {
			sumValue(studentNum,Scores);
			avgValue(studentNum,Scores);
			}
			break;
			default:
			run = false;
		}
		}
		
		System.out.println("프로그램 종료");
		}
			 
	protected static int[] inputScores(int studentNum, int[] Scores, Scanner scanner) {
		if(studentNum > 0) {
			Scores = new int[studentNum];
			for(int i=0; i<studentNum; i++) {
			System.out.println("scores[" +i+ "]>");
				Scores[i] = scanner.nextInt();
		}
		}else {
			System.out.println("1.학생수를 입력하시오.");}
		return Scores;
	}
	protected static void printMenu() {
		System.out.println("-------------------------------------------");
		System.out.println("1.학생수  | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("-------------------------------------------");
		System.out.println("선택>");
	}
	private static void sumValue(int studentNum, int[]Scores) {
		if(studentNum > 0) {
			int max = Scores[0];
				for(int i=1; i<studentNum; i++) {
				if(max < Scores[i]) {
					max = Scores[i];
				}
				System.out.println("최고점수 : "+ max);
				}
		}
				
	}
	private static void avgValue(int studentNum, int[]Scores){
		int sum = 0;
		for(int i=0; i<studentNum; i++) {
			sum += Scores[i];
		}
		System.out.println("평균점수 : "+(sum/studentNum));
		return;
	}
	public static void printScores(int[]Scores,int studentNum){
		if(studentNum > 0) {
			for(int i=0; i<studentNum; i++) {
				System.out.println("scores[" +i+ "] : "+Scores[i]);
	}
	
		}
	}
}

