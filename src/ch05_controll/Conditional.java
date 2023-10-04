package ch05_controll;

public class Conditional {

    static String today = "월요일";

    public static void main(String[] args) {
        // 조건문


        // if문
        int price = 30000;
        int myMoney = 10000;

        // myMoney 가 price보다 작으면 "돈이 부족합니다" 문구를 출력
        // 조건 안에는 boolean 타입의 결과가 들어간다.
        // 프로그래밍에서 괄호가 열렸으면 닫히는 부분이 있어야 한다.
        // if문의 소괄호 안 조건이 true면 중괄호 내부 코드 실행
        // false면 중괄호 내부 코드가 실행되지 않음
        if (myMoney < price) {
            System.out.println("돈이 부족합니다.");
        }

        // 괄호만 잘 지키면 한줄로 써도 된다.
        // 중괄호 블록{} 안 명령어가 한줄 뿐 이라면
        // 중괄호 블록을 생략할 수 있다.


        System.out.println("\n=======================================\n");

        // 변수의 사용범위(Scope)
        // 중괄호 블록{} 안에 선언된 변수는 (지역 변수)
        // 해당 중괄호 블록{} 밖에서 사용할 수 없다.
        String review = "맛있어요~";
        if (review.length() < 10) {
            // warning이 메모리에 등록
            String warning = "리뷰는 10글자 이상 작성해주세요";
        }   // 메모리에서 warning은 삭제

        // warning 존재를 모른다.
//        system.out.println(warning);

        // 전역 변수
        // class 중괄호 블록 안에 선언된 변수
        // 해당 클래스 내 어디서든 사용이 가능하다.

        System.out.println(today);

        // 조건에 따른 변수 값 변화
        String warning = "";
        if (review.length() < 10) {
            warning = "리뷰는 10글자 이상 작성해주세요.";
        }

        System.out.println(warning);

        // 삼항연산자는 조건에 따른 변수 값 변화시 사용하면 좋다.
        warning = (review.length() < 10) ? ("리뷰는 10글자 이상 작성해주세요.") : ("통과");

        System.out.println("\n================================================\n");

        // else와 else if

        int numZero = 0;

        if (numZero < 0) {
            System.out.println("numZero가 0보다 작다.");
        } else {
            // 위 if문 조건이 false면 else 내부 코드가 실행

            System.out.println("numZero 가 0보다 같거나 크다.");
        }

        // 주민번호 뒷자리의 첫번째 숫자가 홀수면 남성, 짝수면 여성
        int idBack = 3;
        if (idBack % 2 == 1) {
            //홀수
            System.out.println("남성");
        } else {
            // 짝수
            System.out.println("여성");
        }

        numZero = 0;
        if (numZero < 0) {
            System.out.println("numZero가 0보다 작다");

        } else if (numZero == 0) {
            System.out.println("numZero가 0이다");
        } else {
            System.out.println("numZero가 0보다 크다.");
        }

        System.out.println("\n================================\n");

        // 세상 모든 가전제품에는 프로그래밍 코드가 들어가있다.
        // 리모콘은 전원 버튼 하나로 on/off 가 가능하다.

        // isPoweron은 전원이 켜져있으면 true, 꺼져있으면 false
        boolean isPowerOn = false;

        // 전원버튼 누르기
        if (isPowerOn == false) {
            System.out.println("TV를 켭니다.");
            isPowerOn = true;
        } else if (isPowerOn == true) {
            System.out.println("TV를 끕니다.");
            isPowerOn = false;

        }


        if (!isPowerOn) { // isPowerOn은 true/false 두가지 케이스 뿐
            System.out.println("TV를 켭니다.");
        } else {
            System.out.println("TV를 끕니다.");
        }
        isPowerOn = !isPowerOn;

        // boolean 타입의 true/false 성질을 마치 스위치의 on/off처럼
        // 사용하는 변수를 토글(toggle) 혹은 플래그(flag) 라고 부른다.

        System.out.println("\n============================================\n");

        // 이중삼항연산자로 점수에 따른 등급 표현 - > if문
        int score = 85;
        String grade = "";

        // if, else if, else 를 이용해서
        // score가 90 이상이면 grade는 "A"
        // score가 80 이상이면 grade는 "B"
        // 나머지는 grade가 "C"

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else {
            grade = "C";
        }
        System.out.println(grade);

        // 코드라인 줄이기
        grade = "C";
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        }
        System.out.println(grade);

        score = 92;


        // 순서에 유의해야 한다.
        if (score >= 80) {
            grade = "B";
        } else if (score >= 90) {
            grade = "A";
        } else {
            grade = "C";
        }
        System.out.println(grade); //B가 나와버림

        System.out.println("\n=================================================\n");

        // 회원가입 조건체크
        // 이름은 한글자 이상
        // 나이는 14세 이상
        // 휴대폰 번호는 10자리 또는 11자리
        String name = "길똥이";
        int age = 20;
        String phone = "01073987332";

        if (name.length() > 0) {
            // 이름 조건 통과
            if (age >= 14) {
                // 나이 조건 통과
                if (phone.length() == 10 || phone.length() == 11) {
                    // 휴대폰 조건 통과
                    System.out.println("회원가입 성공");
                } else {
                    // 휴대폰 조건 불통과
                    System.out.println("회원가입 불가");
                }
            } else {
                // 나이 조건 불통과
                System.out.println("회원가입 불가");
            }
        } else {
            // 이름 조건 불통과
            System.out.println("회원가입 불가");
        }

        // 논리연산자를 이용하여 개선
        if (name.length() > 0 && (age >= 14)
                && (phone.length() == 10 || phone.length() == 11)) {
            System.out.println("회원가입 성공");
        } else {
            System.out.println("회원가입 실패");
        }

        System.out.println("\n========================================\n");

        // switch문
        // 특정 변수에 대한 값에 따라 다른 구문을 실행하는 경우 사용

        // 여러분들의 교육기간(단위: 월)

        int month = 2;

        if (month == 0) {
            System.out.println("자바, DB 배우는 중");
        } else if (month == 1) {
            System.out.println("자바, 화면구현 배우는 중");
        } else if (month == 2) {
            System.out.println("자바FX 프로젝트(우웩)");
        } else if (month == 3) {
            System.out.println("JSP-스프링, SPA 배우는 중");
        } else if (month == 4) {
            System.out.println("팀 프로젝트 하는중");
        } else {
            System.out.println("취업, 수료");
        }

        // 위의 if문을 switch문으로 변경
        // switch() 소괄호 안에 변수를 넣는다.
        switch (month) {
            case 0:
                System.out.println("자바, DB 배우는 중");
                break;

            case 1:
                System.out.println("자바, 화면구현 배우는 중");
                break;
            case 2:
                System.out.println("자바FX 프로젝트(우웩)");
                break;
            case 3:
                System.out.println("JSP-스프링, SPA 배우는 중");
                break;
            case 4:
                System.out.println("팀 프로젝트 하는중");
                break;
            default:    // if문의 else에 해당
                System.out.println("취업, 수료");
                break;
        }

        // month에 대한 계절을 출력해주는 switch문 만들어보기
        month = 11;
        if (month <= 4) {
            System.out.println("봄");
        } else if (month <= 8) {
            System.out.println("여름");
        } else if (month <= 10) {
            System.out.println("가을");
        } else if (month <= 12) {
            System.out.println("겨울");
        }

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;

            case 3:
            case 4:
            case 5:

                System.out.println("봄");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;

            case 9:
            case 10:
            case 11:

        }

        int sum = 0;
        // 실행결과는 같은데 for문의 실행 횟수는 더 적다.
        // (프로그램 실행 속도 증가 = 성능 증가)
        for (int i = 0; i <= 40; i += 2) {
            //i=0 , i=2 , i=4
            sum += i;

        }
        System.out.println(sum);

        //0부터 2까지 0.2마다 출력
        // 소수인 double, float 타입의 연산은 정확하지 않으므로 비추천
        for (double i = 0; i <= 2; i += 0.2) {
            System.out.println(i);

        }

        // 0부터 2까지 0.2마다 출력
        for (int i = 0; i <= 20; i += i + 2) {
            System.out.println((double) i / 10);
        }

        System.out.println("\n===================================\n");

        // 구구단 2단
        // 2 x 1 = 2
        // 2 x 2 = 4
        // 2 x 3 = 6

        for (int i = 1; i <= 9; i++) {
            System.out.println("2 x " + i + " = " + (i * 2));

        }

        System.out.println("\n====================================\n");

//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("***");
//        System.out.println("****");
//        System.out.println("*****");
//        System.out.println("******");

        // 위의 코드를 for문을 이용하여 같은 결과가 나오도록 만들기

        String star = "";
        for (int i = 0; i < 5; i++) {
            star += "*";
            System.out.println(star);

        }

        for (String i = "*"; i.length() <= 5; i += "*") {
            System.out.println(i);
        }

        System.out.println("\n========================================\n");

        // 나머지 연산자(%) 의 사용 예시
        // for문 내에서 순환하는 숫자에 대해 사용하면 좋다.

        // 국수공장에서 면 20cm 뽑고 있다.
        for (int i = 0; i < 20; i++) {
            System.out.println("||||||||");

            // i가 4, 9, 14 일때 절단 시키기
            if (i == 4 || i == 9 || i == 14) {
                System.out.println("--------");
            }

            // 4, 9, 14, 19, 24, ... 는
            // 전부 5로 나누었을때의 나머지가 4인 숫자들
            if (i % 5 == 4) {
                System.out.println("--------");
            }

        }

        // 라면 공장에서 면을 30cm 뽑고 있는데
        // 6cm 마다 잘라주어야 한다.
        // ////////
        // \\\\\\\\
        // ////////
        // \\\\\\\\
        for (int i = 0; i < 30; i++) {
            System.out.println("////////");
            if (i % 6 == 0) {
                System.out.println("---------");
                if (i % 2 == 0) {
                    System.out.println("\\\\\\\\");

                }
            }
        }


        for (int i = 0; i < 30; i++) {
            if (i % 2 == 0) { //홀짝 판별을 위함
                System.out.println("////////");
            } else if (i % 2 == 1) {
                System.out.println("\\\\\\\\\\\\\\\\");
            }
            if (i % 6 == 5) {
                System.out.println("--------");
            }

            // i가 5, 11 , 17 , 23, .... 일때 자른다.
            // 6으로 나누었을때, 나머지가 5인 숫자.
            // 조건을 체크하는 목적이 다른 if문은 서로 분리해야 한다.


            System.out.println("\n============================================\n");


        }

        int num = 10;
        for (int i = 0; i < 10; i++) {
            System.out.println(num--);
        }
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("\n===========================================\n");

        // for문으로 String을 가지고 놀기

        // 숫자형 문자열의 각 자리수를 더한 결과 얻기
        // submit02에서 했던걸 for문을 이용해서 해결

        String example = "37845";

        example.substring(0, 1);
        example.substring(1, 2);
        example.substring(2, 3);
        example.substring(3, 4);
        example.substring(4, 5);

        // 문자열의 길이만큼 반복 실행

        int result = 0;
        for (int i = 0; i < example.length(); i++) {
            System.out.println(example.substring(i, i + 1));
            result += Integer.parseInt(example.substring(i, i + 1));
            System.out.println(result);


        }

        System.out.println("\n====================================\n");

        // 슈의 갯수는?
        String syu = "슈슈슈슈ㅠ슈ㅠ슈ㅠ슈ㅠ슛슛";

        // syusyu 에서 "슈"가 몇글자 들어가있는지 세어보기
        // (눈으로 세어보니 7개있음)

        // syusyu에서 한글자씩 잘라서 "슈"와 일치하는지 체크
        // 개수 체크

        // syusyu에서 한글자씩 잘라서
        // "슈"와 일치하는지 체크
        // 개수체크

        int count = 0;
        for (int i = 0; i < syu.length(); i++) {
            System.out.println(syu.substring(i, i + 1).equals("슈"));

            if (syu.substring(i, i + 1).equals("슈")) {
                count += 1;
            }

        }
        System.out.println("슈의 갯수 :"+ count);




    }
}

