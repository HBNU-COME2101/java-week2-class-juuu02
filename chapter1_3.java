import java.util.Scanner;

public class chapter1_3{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("생일을 입력하세요 : ");
		int birthday = scanner.nextInt();
		String birthdayStr = birthday + "";
		
		String year = birthdayStr.substring(0,4);
		String month = birthdayStr.substring(4,6);
		String date = birthdayStr.substring(6,8);
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(date + "일");
		
		scanner.close();
	}
}