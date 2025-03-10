import java.util.Scanner;

public class chapter1_4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("여행지를 입력하세요 : ");
		String destination = scanner.nextLine();
		
		System.out.print("인원수를 입력하세요 : ");
		int sizeofmember = scanner.nextInt();
		
		System.out.print("숙박일을 입력하세요 : ");
		int staying = scanner.nextInt();
		
		System.out.print("1인당 항공료를 입력하세요 : ");
		int flight = scanner.nextInt();
		
		System.out.print("1인당 숙박비를 입력하세요 : ");
		int hotel = scanner.nextInt();
		
		int stayings = staying + 1;
		
		int numberofRoom = sizeofmember/2;
		
		int plusRoom = sizeofmember % 2;
		
		if (plusRoom != 0) {
			numberofRoom += 1;
		}
		
		int amount = flight + hotel;
		
		System.out.print(sizeofmember + "명의 " + destination +
				" " + staying + "박 " + stayings + "일의 여행에는 "
				+ numberofRoom + "개 필요하며 경비는 " + amount + "원입니다");
		
		scanner.close();
	}

}
