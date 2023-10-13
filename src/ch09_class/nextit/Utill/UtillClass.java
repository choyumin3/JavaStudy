package ch09_class.nextit.Utill;

import java.util.Scanner;

public class UtillClass {

    // avg를 소수 셋째자리에서 반올림하여
    public static void playPokemon() {
        Scanner scan = new Scanner(System.in); // importclass??
        // 포켓몬스터
        int hp = 100;
        // 이 while문의 이름이 outer가 됨
        outer:
        while (true) {
            System.out.println("야생의 피카츄를 만났습니다.");
            System.out.println("행동을 선택해주세요");
            System.out.println("1. 공격 | 2. 도망");
            System.out.println(">>> ");

            int command = Integer.parseInt(scan.nextLine());

            if (command == 1) {
                while (true) {
                    System.out.println("공격 방법 선택");
                    System.out.println("1. 몸통박치기 | 2. 하이드로펌프 | 3. 취소");
                    System.out.println(">>> ");

                    int attack = Integer.parseInt(scan.nextLine());

                    if (attack == 1) {
                        System.out.println("몸통박치기 시전");
                        hp -= 20;
                    } else if (attack == 2) {
                        System.out.println("하이드로 펌프");
                        hp -= 40;
                    } else if (attack == 3) {
                        // 취소
                        // 가까운 반복문 1개를 즉시 종료
                        // 내부 while문만 종료된다.
                        break;
                    }

                    if (hp <= 0) {
                        System.out.println("피카츄를 잡았다~!!");
                        // 외부 while문을 종료 시키려면??

                        // system.exit(0); // 프로그램 종료
                        // 외부 while문에 네임태그 설정

                        //break outer; // 해당 이름을 가진 while문 종료
                        // 리턴타입이 void 이더라도 return은 사용이 가능하다.
                        // 메소드 내에서 return이 실행되면 해당 메소드는 즉시 종료된다.


                    }
                    return;
                }

            } else if (command == 2) {
                System.out.println("도망갔습니다");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    public static long recFactorial(int num) {

        return num * recFactorial(num - 1);
        // return 5 * refactorial(4)
        // return 5 * 4 * refactorial(3)
        // return 5 * 4 * 3 * refactorial(2)
        // return 5 * 4 * 3 * 2 * refactorial(1)


    }


    public static void recPrintNum(int num) {
        System.out.println(num); // 10
        recPrintNum(num - 1); // 파라미에

        // 자기자신을 호출(= 재귀함수)
        // 무한 반복 실행을 주의
        if (num == 1) {
            return; // 메소드 즉시 종료


        }
    }

    public static void printNum(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }


    public static long factorial(int n) {
        long num = 1;
        for (int i = 1; i <= n; i++) {
            num *= i;

        }
        return num;


    }


    public static void makeCard(String name, int kor, int eng, int math) {
        System.out.println("이름: " + name);
        System.out.println("국어: " + kor);
        System.out.println("영어: " + eng);
        System.out.println("수학: " + math);

        double avg = (double) (kor + eng + math) / 3;
        // avg를 소수 셋째자리에서 반올림하여 소수 둘째자리로 만들기
        // Math.round() 는 소수 첫째자리에서 반올림한 정수 값을 리턴
        // 우리만의 반올림 메소트 myRound()를 만들어보자!!

        avg = myRound(avg, 3);

        System.out.println("평균: " + avg);

        String deg = "C";
        if (avg >= 90) {
            deg = "A";
        } else if (avg >= 80) {
            deg = "B";
        }
        System.out.println("등급 " + deg);


    }

    public static void print(String word) {
        System.out.println(word);


    }

    /**
     * 입력한 소수를 소수 n번째 자리로 반올림하여 리턴해주는 함수
     *
     * @param num 반올림 하고자 하는 소수
     * @param n   소수 n번째 자리를 지정하는 정수
     * @return 반올림된 소수 리턴
     */
    public static double myRound(double num, int n) {
        // Math.round() 은 소수 첫째자리에서 반올림한 정수 리턴
        // 3.141592
        // Math.round(3.141592) => 3 리턴

        // 3.141592 에 10을 곱함(10의 1승) => 31.41592
        // Math.round(31.41592) => 31 리턴
        // 리턴값에 10을 나눔(10의 1승) => 3.1

        // 3.141592 에 100을 곱함(10의 2승) => 314.1592
        // Math.round(314.1592) => 314 리턴
        // 리턴값에 100을 나눔(10의 2승) => 3.14

        // num 에 10^n 곱한 후 Math.round()를 적용한 값에
        // 10^n 나누기

        //1. 10^n 값을 구한다.
        // math.pow(10,n): 10에 n승값을 리턴
        // 2. num에 10^n을 곱한다.
        //3. 2번 값에 Math.round()를 적용한다.
        //4. 3번값에 10^n을 나눈다.
        //5. 4번 값을 리턴한다.

        int one = 1;
        // one에 10을 n번 곱함
        for (int i = 0; i < n; i++) {
            one *= 10;
        }

        return (double) Math.round(num * one) / one;
    }

    public static int myAbs(int num) {
        if (num < 0) {
            // num가 음수일때만 실행
            // 음수인 num을 양수로 바꿔주기
            // 음수에 -1을 곱하면 양수가 된다.
            num *= -1;

        }
        return num;

    }

    // 기본적으로 변수와 같이 메소드명은 중복 선언할 수 없다.
    // 하지만 하나의 클래스 내에서 이름이 같은 메소드명을
    // 파라미터가 다르게 선언하면 중복 선언할 수 있다.
    // => 메소드 오버로딩 (Method Overloading)

    public static void print(int word) {
        System.out.println(word);

    }


    public static void print(double word) {
        System.out.println(word);

    }

    public static void printSum(int startNumber, int endNumber) {
        int sum = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            sum += i;

        }
        System.out.println(startNumber + "부터 " + endNumber + " 까지 " + sum);
    }

    public static int returnSum(int startNumber, int endNumber) {
        int sum = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            sum += i;

        }
        // sum 값을 리턴
        return sum;
    }

}
