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
			System.out.println("�л���> ");
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
		
		System.out.println("���α׷� ����");
		}
			 
	protected static int[] inputScores(int studentNum, int[] Scores, Scanner scanner) {
		if(studentNum > 0) {
			Scores = new int[studentNum];
			for(int i=0; i<studentNum; i++) {
			System.out.println("scores[" +i+ "]>");
				Scores[i] = scanner.nextInt();
		}
		}else {
			System.out.println("1.�л����� �Է��Ͻÿ�.");}
		return Scores;
	}
	protected static void printMenu() {
		System.out.println("-------------------------------------------");
		System.out.println("1.�л���  | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
		System.out.println("-------------------------------------------");
		System.out.println("����>");
	}
	private static void sumValue(int studentNum, int[]Scores) {
		if(studentNum > 0) {
			int max = Scores[0];
				for(int i=1; i<studentNum; i++) {
				if(max < Scores[i]) {
					max = Scores[i];
				}
				System.out.println("�ְ����� : "+ max);
				}
		}
				
	}
	private static void avgValue(int studentNum, int[]Scores){
		int sum = 0;
		for(int i=0; i<studentNum; i++) {
			sum += Scores[i];
		}
		System.out.println("������� : "+(sum/studentNum));
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

