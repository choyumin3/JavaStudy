package ch09_class.nextit;

import ch09_class.nextit.school.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class NextitMain {

    public static void main(String[] args) {
        String gyName = "강연";
        int gyAge = 27;
        int gyLevel = 1;
        int gyExp = 40;

        String ymName = "유민";
        int ymAge = 27;
        int ymLevel = 1;
        int ymExp = 30;

        // 하루가 지나서 경험치가 오른다.
        gyExp += 30;
        ymExp += 30;

        // 이틀이 지남
        gyExp += 30;
        ymExp += 30;

        // 삼일이 지남
        gyExp += 30;
        ymExp += 30;

        // 경험치가 100 이상이 되면 레벨업
        if (gyExp >= 100) {
            gyLevel++;

            // exp가 120일때 레벨업 -> exp 20 남도록

            gyExp %= 100; // 경험치 100으로 나눈 나머지

        }

        if (ymExp >= 100) {
            ymLevel++;
            ymExp %= 100;
        }

        // 상태 확인
        System.out.println(gyName);
        System.out.println(gyLevel);
        System.out.println(gyExp);

        System.out.println(ymName);
        System.out.println(ymLevel);
        System.out.println(ymExp);

        System.out.println("\n==============================\n");

        // 클래스로부터 객체 생성
        NextStudent gangyeon = new NextStudent();

        // 객체의 속성(=필드변수)에 접근
        System.out.println(gangyeon.name);
        System.out.println(gangyeon.age);
        System.out.println(gangyeon.level);
        System.out.println(gangyeon.exp);

        // 필드 변수에 값을 담아주지 않으면
        // 생성된 객체의 필드 변수들은 초기값(default)인 상태
        // 숫자 : 0, boolean : false, 참조타입 : null

        gangyeon.name = "강연";
        gangyeon.age = 27;
        gangyeon.level = 1;
        gangyeon.exp = 40;

        System.out.println(gangyeon);

        System.out.println(gangyeon.name);
        System.out.println(gangyeon.age);
        System.out.println(gangyeon.level);
        System.out.println(gangyeon.exp);

        // 하루가 지남
        gangyeon.exp += 30;
        System.out.println(gangyeon.exp);

        // 이틀이 지남
        gangyeon.exp += 30;
        System.out.println(gangyeon.exp);

        if (gangyeon.exp >= 100) {
            gangyeon.level += 1;
            gangyeon.exp %= 100;

        }

        // 삼일이 지남
        // 객체의 메소드 실행
        gangyeon.oneDayLater();

        System.out.println("\n=============================\n");

        NextStudent yumin = new NextStudent();


        yumin.name = "유민";
        yumin.age = 27;
        yumin.level = 1;
        yumin.exp = 30;

        // 1~3일이 지남
        yumin.oneDayLater();
        yumin.oneDayLater();
        yumin.oneDayLater();

        // 동일한 클래스로부터 생성된 객체들은
        // 같은 속성(필드변수)과 메소드를 가지고 있으나
        // 속성의 값은 개별적이다.

        // 한번에 속성값 확인하기
        // 객체를 println()에 집어넣었을때
        // 자동으로 toString()의 리턴값이 출력된다.
        System.out.println(gangyeon.toString());
        System.out.println(yumin);
        System.out.println(String.valueOf(yumin));


        //toString()이 있으면 필요없음
        gangyeon.printState();
        yumin.printState();

        System.out.println("\n===============================\n");

        // 필드값을 입력 받는 생성자(Constructor) 로 객체를 생성하기
        // new NextStudent() 에서 NextStudent() 을 생성자라고 부른다.
        // 파라미터를 입력받지 않는 생성자를 기본 생성자라고 부른다.


        NextStudent minjae = new NextStudent("민재", 21, 1, 30);

        System.out.println(minjae);


        NextStudent taegon = new NextStudent("태곤", 36, 3, 30);
        NextStudent changyeon = new NextStudent("창연", 32, 4, 30);

        // 생성자를 추가해서 level = 1을 굳이 입력하지 않아도 되도록 만들기
        NextStudent jiwoo = new NextStudent("지우", 27, 40);
        System.out.println(jiwoo);

        System.out.println("\n==================================\n");

        NextStudent jiwooBot = jiwoo;

        System.out.println(jiwooBot);
        System.out.println(jiwoo);

        jiwooBot.name = "지우봇";

        NextStudent taegonBot = new NextStudent(taegon.name, taegon.age, taegon.level, taegon.exp);

        System.out.println(taegonBot);

        gangyeon.oneDayLater();
        yumin.oneDayLater();
        jiwoo.oneDayLater();
        taegon.oneDayLater();
        changyeon.oneDayLater();


        // 여러개의 객체를 한번에 다루기
        ArrayList<NextStudent> stuList = new ArrayList<NextStudent>();
        //[NextStudent{이름: '강연', 나이:27, 레벨:2, 경험치:67}, NextStudent{이름: '유민', 나이:27, 레벨:2, 경험치:48}, NextStudent{이름: '지우봇', 나이:27, 레벨:1, 경험치:61}, NextStudent{이름: '태곤', 나이:36, 레벨:3, 경험치:70}, NextStudent{이름: '창연', 나이:32, 레벨:4, 경험치:60}]

        stuList.add(gangyeon);
        stuList.add(yumin);
        stuList.add(jiwoo);
        stuList.add(taegon);
        stuList.add(changyeon);

        System.out.println(stuList);

        for (int i = 0; i < stuList.size(); i++) {
            System.out.println(stuList.get(i));
        }

        //NextStudent{이름: '강연', 나이:27, 레벨:2, 경험치:67}
        //NextStudent{이름: '유민', 나이:27, 레벨:2, 경험치:48}
        //NextStudent{이름: '지우봇', 나이:27, 레벨:1, 경험치:61}
        //NextStudent{이름: '태곤', 나이:36, 레벨:3, 경험치:70}
        //NextStudent{이름: '창연', 나이:32, 레벨:4, 경험치:60}

        // 하루가 더 지났습니다..
        for (int i = 0; i < stuList.size(); i++) {
            stuList.get(i).oneDayLater();
        }


        for (NextStudent stu : stuList) {
            System.out.println(stu);
        }

        // 5일이 한번에 지난다.
        for (int k = 0; k < 5; k++) {
            for (int i = 0; i < stuList.size(); i++) {
                stuList.get(i).oneDayLater();
            }
        }
        for (NextStudent stu : stuList) {
            System.out.println(stu);
        }


        // 굳이 객체를 변수에 담은 후 리스트에 추가하지 않아도 된다.
        NextStudent jangseon = new NextStudent("장선", 30, 30);
        stuList.add(jangseon);

        stuList.add(new NextStudent("창연", 34, 80));

        for (NextStudent stu : stuList) {
            System.out.println(stu);
        }

        // 등수와 함께 출력
        for (int i = 0; i < stuList.size(); i++) {
            System.out.println((i + 1) + "등 " + stuList.get(i));
        }

        for (int k = 0; k < 100; k++) {
            for (int i = 0; i < stuList.size(); i++) {
                stuList.get(i).oneDayLater();
            }
        }
        for (NextStudent stu : stuList) {
            System.out.println(stu);
        }


        System.out.println("\n=================================\n");

        // stuList에 담겨있는 학생들의 레벨을 기준으로 정렬

        for (int k = 0; k < stuList.size() - 1; k++) {

            for (int i = 0; i < stuList.size() - 1; i++) {
                // 왼쪽이 오른쪽보다 큰지 비교렬 = 오름차순
                // 왼쪽이 오른쪽보다 작은지 비교 = 내림차순
                if (stuList.get(i).level > stuList.get(i + 1).level) {
                    // 자리바꾼다.
                    NextStudent tmp = stuList.get(i);
                    stuList.set(i, stuList.get(i + 1));
                    stuList.set(i + 1, tmp);

                }

            }

        }


        System.out.println("\n====================================\n");

        // Collections.sort() 사용
        // stulist.get(i) < stuList.get(i+1) 와 유사한 상태가 되어서
        // 정렬을 싴리 수 없음
        // -> 정렬 기준을 알려주면 해결가능
        Collections.sort(stuList, new Comparator<NextStudent>() {
            @Override
            public int compare(NextStudent stuA, NextStudent stuB) {
                // 기준
                // 왼쪽 stuA의 level에서 오른쪽 stuB의 level을 뺀 값이
                // 양수인지 음수인지에 따라 내부적으로 자리를 바꾼다.
                // stuA.level - stuB.level : 오름차순
                // stuB.level - stuA.level : 내림차

                return stuA.level - stuB.level;
            }
        });

        // 등수와 함께 출력
        for (int i = 0; i < stuList.size(); i++) {
            System.out.println((i + 1) + "등 " + stuList.get(i));
        }

        Collections.sort(stuList, (stuA, stuB) -> stuB.level - stuA.level);
        Collections.sort(stuList, (stuA, stuB) -> {
            return stuB.level - stuA.level;
        });


    }


}

