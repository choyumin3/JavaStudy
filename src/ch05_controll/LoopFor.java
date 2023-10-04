package ch05_controll;

public class LoopFor {
    public static void main(String[] args) {

        // 반복문
        // for문

        // 콘솔창에 1부터 10까지 출력

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

        int one = 1;
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);

        System.out.println("\n================\n");

        // 반복문 사용
        // ; 를 기준으로
        // 초기화식 ; 조건식 ; 증감식
        // 초기화식에는 for문의 반복횟수를 결정해주는 변수를 선언
        // 증감식에는 for문이 반복될때마다 변수의 증가량 지정
        // 조건식에는 for문이 반복되는 기준을 정한다.
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }


        // for문 내부 변수 i는 for문 내에서 선언되고, for문 종료시 제거된다.
        // = 변수의 스코프
//        System.out.println(i);

//        for(int i = 1 ; i <= 10 ; i++ ){
//            System.out.println(i);

//            for문 내부 변수 i는 for문의 반복횟수를 조정하기 위함이
//            주 목적이므로 꼭 i를 for문 내에서 쓸 필요는 없다.
//            i는 단순 변수명일뿐이므로, i가 아닌 다른 단어를 사용해도 된다.
        one = 1;
        // 10번 반복하는 for문
        for (int number = 0; number < 10; number += 1) {
            System.out.println(one++);
        }

        // 정말 많이 쓰게될 for문 형식
        // 20번 반복하는 for문
        System.out.println("시작");
        for (int i = 0; i < 20; i++) {
        }
        System.out.println("끝");

        System.out.println("\n===============================\n");

        // 1부터 20까지 더한 값?
        // 변수의 스코프를 이용한 for문

        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += i;
        }

        System.out.println(sum);

        // 1부터 40까지 중에 짝수끼리만 더한 값?

        // 자동 줄맞춤 [Ctrl + Alt + l]

        sum = 0;
        for (int i = 1; i <= 40; i++) {
            if (i % 2 == 0)
                sum += i;
        }


        System.out.println("\n=============================================\n");


        //break 문
        // 반복문을 종료시키는데 사용
        // 반복횟수를 줄여서 실행속도를 향상시키는데 사용

        // 내 이름을 유니코드로 표현한다면?
        // 유니코드 0 ~ 70000 중에서 찾기
        char word = 0;
        for (int i = 0; i < 70000; i++) {
            if (word == '조') {
                System.out.println(i);
                System.out.println(word);
                // break문이 실행되면 가까운 반복문(for, while)
                // 하나를 즉시 종료한다.
                break;
            }
            word++;
        }


        System.out.println("\n=======================================\n");

        // continue 문

        // 구구단을 출력하는 중에, 너무 쉬운 1,2,3은 출력 안한다.
        for (int i = 1; i <= 9; i++) {
            if (i < 4) {
                // 반복문 내에서 contunue가 실행되면
                // 바로 다음 반복문으로 넘어간다.
                // (continue 아래 코드는 실행되지 않음)
                continue;
            }
            System.out.println("8 x " + i + " = " + (8 * i));

        }

        System.out.println("\n==========================================\n");

        // 찐 구구단(2단~9단) 출력
        // 2 x 2 = 4
        // 2 x 3 = 6
        // 2 x 9 = 18
        // 3 x 2 = 6
        // 3 x 3 = 9
        // 3 x 9 = 27
        // 9 x 2 = 18
        // 9 x 3 = 27
        // 9 x 9 = 81

        // 이중 for문 사용

        for (int left = 2; left <= 9; left++) {
            for (int right = 2; right <= 9; right++) {
                System.out.println(left + "x" + right + "=" + (left * right));

            }
            System.out.println("----------------");

        }

        /*
            디버깅 모드

            코드라인 좌측 (라인 숫자 적혀있는 부분)을 마우스 좌클릭하면
            breakpoint가 생성된다.

            생성된 breakpoint는 다시 클릭하면 제거된다.

            breakpoint를 생성한 후 디버깅모드 실행시
            (상단 벌레모양 버튼 클릭 또는 [Shift + F9])
            컴퓨터가 코드를 위에서부터 실행하다가 breakpoint가 있는 지점에
            멈춰서 대기를 한다.

            이후 하단 Debug 탭의 Step Over [F8] 를 실행하면
            한단계씩 실행이 이루어진다.

            코드를 한줄한줄 실행해보며 컴퓨터가 정확히 어디를 실행하고
            그때마다 변수에 어떤 값이 담기고 있는지 확인할 때 사용

            디버깅 모드 종료하려면 중지버튼(Terminate) [Ctrl + F2]



         */
        System.out.println("\n=================================\n");

        // 트리

        //     *
        //    **
        //   ***
        //  ****
        // *****

        // i=0 일때, 공백 4칸 + * 1개
        // i=1 일때, 공백 3칸 + * 2개
        // i=2 일때, 공백 2칸 + * 3개

        for (int i = 0; i < 5; i++) {


            String blank = "";
            for (int k = 0; k < 4 - i; k++) {
                blank += " ";
            }

            String stars = "";
            for (int k = 0; k < i + 1; k++) {
                stars += "*";
            }

            System.out.println(blank + stars); // *
        }

        System.out.println("\n=====================================\n");

        //트리
        //     *       5번  // 1,2,3,4,6,7,8,9번
        //    ***      4,5,6번  // 1,2,3,7,8,9번
        //   *****     3,4,5,6,7번   //1,2,8,9번
        //  *******    2,3,4,5,6,7,8번   //1,9번
        // *********   1,2,3,4,5,6,7,8,9번

        // i=0 일때 , 공백 4칸 , *은1개
        // i=1 일때 , 공백 3칸 , *은3개
        // i=2 일때 , 공백 2칸 , *은5개

        for (int i = 0; i < 5; i++) {

            String blank = "";
            for (int k = 0; k < 4-1; k++) {
                blank += "  ";
            }
            String stars = "";
            for (int k = 0; k < (i*2)+1; k++){
                stars+= "*";
            }
            System.out.println(blank + stars);

        }


//        *******
//           *****
//            ***
//             *
    }

}


// 짝수일때만(조건) sum에 i를 더한다.





