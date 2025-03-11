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

        System.out.print("1방 숙박비를 입력하세요 : ");
        int roomCost = scanner.nextInt();

        int totalDays = staying + 1;

        int numberOfRooms = sizeofmember / 2;
        if (sizeofmember % 2 != 0) {
            numberOfRooms += 1;
        }

        int totalFlightCost = flight * sizeofmember;
        int totalRoomCost = numberOfRooms * roomCost * staying;
        int totalCost = totalFlightCost + totalRoomCost;

        System.out.println(sizeofmember + "명의 " + destination +
                " " + staying + "박 " + totalDays + "일의 여행에는 "
                + numberOfRooms + "개 필요하며 경비는 " + totalCost + "원입니다");

        scanner.close();
    }
}

