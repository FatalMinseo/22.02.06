
public class Ex01 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
			} else {
				sum += i;
			}
		}
		System.out.println("รัวี : " + sum);
	}
}
