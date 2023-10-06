package yumin.submit04;

import java.util.Scanner;

public class Submit04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int elevatorA = 10;
        int elevatorB = 4;

        while (true) {
            System.out.println("================ 희영빌딩 엘리베이터 ================");
            System.out.println("엘리베이터 A 위치: " + elevatorA);
            System.out.println("엘리베이터 B 위치: " + elevatorB);
            System.out.print("몇층에 계시나요?[종료하시려면 q 또는 exit 입력] ");
            String inputText = scan.nextLine();

            if(inputText.equals("q") || inputText.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
                int floor = Integer.parseInt(inputText);


                if (Math.abs(elevatorA - floor) < Math.abs(elevatorB - floor)) {  // a와 b의 절댓값 비교해서 층수차이가 적은 a층을 이동시킴
                    System.out.println("승강기 A가" + floor + "층으로 이동하였습니다");
                    elevatorA = floor;
                } else if (Math.abs(elevatorA - floor) > Math.abs(elevatorB - floor)) { // b가 크면 b를 이동시킴
                    System.out.println("승강기 B가" + floor + "층으로 이동하였습니다");
                    elevatorB = floor;
                } else if (Math.abs(elevatorA - floor) == Math.abs(elevatorB - floor)) { // 같으면 층수를 뺀 값이 양수이면 a를 이동시킴 , 아니면 b를 이동시킴

                    if (elevatorA - elevatorB > 0) {
                        System.out.println("승강기 A가" + floor + "층으로 이동하였습니다");
                        elevatorA = floor;
                    } else {
                        System.out.println("승강기 B가" + floor + "층으로 이동하였습니다");
                        elevatorB = floor;
                    }
                }




        }

    }


}

