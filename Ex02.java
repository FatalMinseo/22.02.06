import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] score = new int[3];
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			sum += score[i];
		}
		double avg = (double)sum/3;
		System.out.println("Java ���� : " + score[0]);
		System.out.println("DB ���� : " + score[1]);
		System.out.println("Python ���� : " + score[2]);
		System.out.println("���� : "+sum);
		System.out.println("��� : "+String.format("%.2f",avg));
		sc.close();
	}
}
