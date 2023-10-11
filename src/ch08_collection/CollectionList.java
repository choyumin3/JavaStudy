package ch08_collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class CollectionList {

    public static void main(String[] args) {
        // 리스트(ArrayList)

        // 리스트 객체 선언

        ArrayList<String> students = new ArrayList<String>();
        ArrayList<String> students2 = new ArrayList<>();
        // 다형성을 이용한 선언
        List<String> students3 = new ArrayList<>();

        // <> 제너릭 안에는 참조타입 객체만 담을 수 있다.
        // 숫자를 담는 컬렉션 리스트를 선언하고자 한다면??\
        // 기본타입의 경우 Wrapper Class를 이용한다.
        ArrayList<Integer> intList = new ArrayList<>();

        // Wrapper Class는 기본 타입의 데이터를 참조 타입의 객체로
        // 사용해야하는 경우 사용된다.

        int num = 23;

        // 기본타입의 데이터를 Wrapper Class의 객체로 변환
        // = 박싱(boxing)
        // deprecated => 지원종료
        Integer numObj = num;

        System.out.println(numObj);
        System.out.println(numObj + 7); // 기본타입 int와 별 차이 못느낌

        //Wrapper Class에 저장된 값을
        // 기본 타입의 데이터로 꺼내기
        // = 언박싱(Unboxing)
        int val = numObj.intValue();
        System.out.println(val);

        // 오토 언박싱

        int val2 = numObj;

        // 오토박싱과 오토언박싱이 자동으로 이루어지기 때문에
        // 기본타입에 대해 Wrapper Class를 이용한다해도
        // 아무런 불편함을 느끼지 못한다.


        System.out.println("\n=================================================\n");

        // ArrayList에 값 담기
        // .add() 사용

        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        // intList.add(1,2,3,4,5);  한번에 여러개의 값 못담음

        // 배열과 달리 컬렉션은 println()에 찍어보면
        // 내부 요소들이 잘 출력이 된다.
        System.out.println(intList);

        students.add("지우");
        students.add("성복");
        students.add("장선");
        students.add("탸곤");
        students.add("창연");

        // 제너릭 타입과 일치하는 데이터만 추가 가능
//        students.add(10);

        System.out.println("\n==============================\n");


        System.out.println(students);

        System.out.println(students.size());

        ArrayList<String> tempList = new ArrayList<>();
        System.out.println(tempList.size());

        // 인덱싱
        // .get(인덱스)

        System.out.println(students.get(2));

        // 해당 인덱스의 값 변경
        // .set(인덱스, 변경값)
        students.set(2, "유민");
        System.out.println(students);

        //. contains(객체)
        // 리스트 안에 해당 객체가 존재하면 true, 없으면 false를 리턴
        // 나중에 클래스로 만든 객체들을 담게되면 잘 동작 안한다.
        System.out.println(students.contains("유민"));

        // .indexOf(객체)
        // 리스트 안에 해당 객체가 존재하면 해당 인덱스 리턴, 없으면 -1 리턴
        System.out.println(students.indexOf("유민"));

        // .isEmpty()
        // 리스트가 비어있으면 true, 아니면 false 리턴
        // .size() == 0 와 같다.
        System.out.println(students.isEmpty());
        System.out.println(students.size() == 0);

        // .remove( 인덱스 )
        // 해당 인덱스의 데이터를 삭제;
        students.remove(2);
        System.out.println(students);
        System.out.println(students.size());
        System.out.println(students.get(2));

        //.clear()
        // 리스트를 비움 ( size가 0이 됨)
        students.clear(); // 기존에 생성된 리스트 내부 요소 제거
        System.out.println(students);

        // 리스트를 초기화해도 된다(init)
        students = new ArrayList<>(); // 새롭게 생성된 빈 리스트로 변경

        System.out.println("\n==========================================\n");

        // for문으로 ArrayList 내부 요소 제어
        students.add("지우");
        students.add("성복");
        students.add("장선");
        students.add("태곤");
        students.add("창연");


        // 학생 이름 앞에 넘버링 추가
        // 1. 지우
        // 2. 성복
        // 3. 장선 . .
        for (int i = 0; i < students.size(); i++) {

            students.set(i, (i + 1) + ". " + students.get(i));

        }
        System.out.println(students);

        System.out.println("\n=============================\n");

        // 정렬
        // 오름차순 정렬
        Collections.sort(intList);
        System.out.println(intList);


        //내림차순 정렬
        Collections.sort(intList, Collections.reverseOrder());
        intList.sort(Collections.reverseOrder());
        System.out.println(intList);


        // 정수를 담을 수 있는 ArrayList 객체를 생성하고,
        // 10부터 20 사이의 랜덤 숫자를 10개 담으시오. (10도 나오고 20도 나올 수 있어야 함)

        // 10번 반복하는 for문에서 매번 10부터 20 사이의 랜덤 숫자를 얻어서(randInt) 해당
        // ArrayList 객체에 add


        // 랜덤숫자 생성
        // 생성된 숫자 intList에 담

        System.out.println("\n=====================================\n");

        // 버블정렬(알고리즘)
        int[] intArr = {3, 5, 8, 2, 4, 1};
        ArrayList<Integer> numList = new ArrayList<>();

        numList.add(3);
        numList.add(5);
        numList.add(8);
        numList.add(2);
        numList.add(4);
        numList.add(1);

        System.out.println(numList);

        for (int k = 0; k < numList.size() - 1; k++) {

            for (int i = 0; i < numList.size() - 1; i++) {
                // 왼쪽이 오른쪽보다 큰지 비교렬 = 오름차순
                // 왼쪽이 오른쪽보다 작은지 비교 = 내림차순
                if (numList.get(i) > numList.get(i + 1)) {
                    // 자리바꾼다.
                    int tmp = numList.get(i);
                    numList.set(i, numList.get(i + 1));
                    numList.set(i + 1, tmp);

                }

            }

        }
        System.out.println(numList);

        System.out.println("\n=================================================\n");
        System.out.println(students);

        ArrayList<String> copystu = students;

        System.out.println(students);
        System.out.println(copystu);

        copystu.add("6. 민재");

        System.out.println(copystu);
        System.out.println(students);


        //리스트 복사 1
        ArrayList<String> copyList = new ArrayList<>();


        // stundets의 모든 요소가 copyList에 담긴다.
        copyList.addAll(students);

        // 리스트 복사 2
        ArrayList<String> copyList2 = new ArrayList<>(students);

        // 리스트 복사 3
        ArrayList<String> copyList3 = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            copyList3.add(students.get(i));
        }

        System.out.println("\n==================================\n");

        // advanced for 향상된 for문
        // (특정 프로그래밍 언어에서는 이를 foreach문이라 한다)
        for (int i = 0; i < students.size(); i++) {

            System.out.println(students.get(i));

        }

        // ArrayList<String>
        for (String stu : students) {
            System.out.println(stu);
        }

        // 인덱스가 존재하는 List 에서는 향상된 for문이 그렇게 크게
        // 메리트가 있지는 않다. 그냥 딱 코드 살짝 압축되는 정도

        System.out.println("\n=====================================\n");

        // 자바의 forEach문
        students.forEach(new Consumer<String>() {

            @Override
            public void accept(String s) {

            }
        });


        // -> 람다식 표현. 코드를 보다 간결하게 작성할 수 있다.
        // 자바스크립트는 => 를 쓴다.
        students.forEach(stu -> System.out.println(stu));

        // 명령어가 2줄 이상인 경우 중괄호 사
        students.forEach
            (stu -> {
                System.out.println(stu);
                System.out.println(stu);
            });
        }
    }


