import java.util.Scanner;

public class chapter1_5{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = scanner.nextInt();
		
		int red = age / 10;
		int blue = age % 10;
		int bluenew = blue / 5;
		int yellow = 0;
		
		if(red == 0 ) {
			if(age ==0) {
				System.out.print("나이는 양수로만 입력하세요.");
				System.exit(0);
			}
			else if(blue >= 1 && blue < 5 && bluenew == 0) {
				yellow = blue;
				System.out.print("노란 초 : " + yellow + "개. 총 " + yellow + "개 입니다.");
				}
			else if(blue == 5) {
				blue = 1;
				System.out.print("파란 초 : " + blue + "개. 총 " + blue + "개 입니다.");
				}
			else if(bluenew == 1 && blue > 5 && blue <10){
				yellow = (blue % 5);
				blue = 1;
				System.out.print("파란 초 : " + blue + "개 "+ "노란 초 : " + yellow + "개. 총 "
				+ (blue+yellow)+ "개 입니다.");
				}
		}else {
			if(blue == 0 && bluenew ==0) {
				System.out.print("빨간 초 : " + red + "개. 총 " + red + "개 입니다.");
			}
			else if(blue >= 1 && blue < 5 && bluenew == 0) {
				yellow = blue;
				System.out.print("빨간 초 : " + red + "개, " + "노란 초 : " + yellow + "개. 총 " + (red+yellow) + "개 입니다.");
				}
			else if(blue == 5) {
				blue = 1;
				System.out.print("빨간 초 : " + red + "개, " + "파란 초 : " + blue + "개. 총 " + (red+blue) + "개 입니다.");
				}
			else if(bluenew == 1 && blue > 5 && blue <10) {
				yellow = blue % 5;
				blue = 1;
				System.out.print("빨간 초 : " + red + "개, " + "파란 초 : " + blue + "개, " + "노란 초 : " + yellow + "개. 총 " + (red+bluenew+yellow) + "개 입니다.");
				}
		}
	
	scanner.close();
	}
}
	