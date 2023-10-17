package yumin.submit10;

import java.util.ArrayList;
import java.util.Scanner;

public class LibararyMain {
    public static void main(String[] args) {

        String strBooks = "삼국지, 해리포터와 마법사의 돌, 해리포터와 비밀의 방 , 해리포터와 아즈카반의 죄수,해리포터와 불사조 기사단," +
                " 해리포터와 혼혈왕자, 해리포터와 죽음의 성물,어린왕자," +
                " 나의 라임 오렌지나무, 이것이 자바다, 좋은생각, 반지의 제왕: 반지 원정대," +
                " 반지의 제왕: 두 개의 탑, 반지의 제왕: 왕의 귀환, 토익보카, 개미";


        strBooks.split(",");



        String[] book = strBooks.split(",");

        for(int i = 0 ; i < book.length; i++){
            System.out.println(book[i]);
        }






//        책입고 책대여 책목록 책검색 종료
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("행동을 선택해 주세요");
            System.out.println("1. 책 입고 | 2. 책 대여 | 3. 책 목록 | 4. 책 검색 | 5. 종료");
            System.out.print(">>> ");

            int command = Integer.parseInt(scan.nextLine());

            if (command == 1) {
                // 책 입고

            } else if (command == 2) {
                // 책 대여
            } else if (command == 3) {

            } else if (command == 4) {

            } else if (command == 5) {
                System.out.println("도서 시스템을 종료합니다");

                break;
            }


        }

    }
}
