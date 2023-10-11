package yumin.submit07;

import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.util.ArrayList;
import java.util.Collections;

public class submit07 {
    public static void main(String[] args) {

        ArrayList<Integer> subList = new ArrayList<>();

        // 랜덤숫자 10번 담기
        for (int i = 0; i < 10; i++) {
            // = 랜덤숫자 생성하면서 담는 행동 10번 반복
            int rand = (int) (Math.random() * 11) + 10;


            subList.add(rand);
// 10~20 랜덤숫자 생성
            // Math.random() : 0 ~ 1 사이의 소수 ( 1은 안나옴)
            // Math.random() * 10 : 0 ~ 10 사이의 소수 ( 10은 안나옴 )
            // (int)(Math.random() * 10) : 0 ~ 9 사이의 정수
            // (int)(Math.random() * 10 + 10 : 10 ~ 19 사이의 정수
            // (int)(Math.random() * 11 + 10 : 10 ~ 20 사이의 정수
            // (int)(Math.random() * (b - a + 1) + a : a ~ b 사이의 정수

//. contains(객체)
//        // 리스트 안에 해당 객체가 존재하면 true, 없으면 false를 리턴
//        // 나중에 클래스로 만든 객체들을 담게되면 잘 동작 안한다. students.contains("유민")

        }


        System.out.println("\n=================================================\n");

        ArrayList<Integer> newList = new ArrayList<Integer>();


        for (int i = 0; i < subList.size(); i++) {

            // newList에 intList의 값을 옮긴다.
            // 값을 옮길때 newList 안에 intList.get(i)의 값이 존재하는지 체크
            // 존재하지 않을때만 옮긴다.

            if (newList.contains(subList.get(i)) == false) {

                newList.add(subList.get(i));


            }

        }
        System.out.println(newList);

        for (int i = 0; i < subList.size(); i++) {
            // i가 0일때, intlist.get(0) 과 index 9,8,7,6,5,4,3,2,1 와 비교
            // i가 1일때, intlist.get(0) 과 index 9,8,7,6,5,4,3,2 와 비교
            // i가 2일때, intlist.get(0) 과 index 9,8,7,6,5,4,3 와 비교

            for (int k = subList.size() - 1; k > i; k--) {
                if (subList.get(i) == subList.get(k)) {
                    subList.remove(k);
                }
            }


        }
        System.out.println(subList);
        System.out.println("\n==========================================\n");
        Collections.sort(subList);

        System.out.println(subList);

        Collections.sort(subList, Collections.reverseOrder());
        System.out.println(subList);

        System.out.println("\n=================================================\n");

        ArrayList numList = new ArrayList();

        System.out.println("\n=================================\n");

        ArrayList<String> wifeList = new ArrayList<>();

        wifeList.add("냉장고");
        wifeList.add("로봇청소기");
        wifeList.add("세탁기");
        wifeList.add("에어컨");

        // System.out.println(wifeList); [냉장고, 로봇청소기, 세탁기, 에어컨]


        ArrayList<String> husbList = new ArrayList<>();

        husbList.add("노트북");
        husbList.add("TV");
        husbList.add("에어컨");
        husbList.add("플레이스테이션");
        husbList.add("로봇청소기");

        // System.out.println(husbList); [노트북, TV, 에어컨, 플레이스테이션, 로봇청소기]
        //============================================================================
        //1. 서로 사고 싶은 물건 목록을 새로운 리스트에 담아 콘솔에 출력해주세요(교집합)
        //
        //Hint
        // 아내의 구매목록 리스트를 for문을 이용하여 순회하고,
        //각 구매 물품이 남편의 구매목록 리스트에 존재하는지 체크한다.
        //만약 존재한다면 빈 리스트에 해당 물품을 저장한다.
        //빈 리스트를 하나 만들고,
        ArrayList<String> wishList = new ArrayList<>();

        for (
                int i = 0; i < wifeList.size(); i++) {

            for (int k = 0; k < husbList.size(); k++)
                if ((wifeList.get(i)).contains(husbList.get(k)))

                    wishList.add(wifeList.get(i));


        }
        System.out.println(wishList);

        for (String string : wifeList) {

            for (String s : husbList)
                if (string.contains(s))

                    wishList.add(string);

            // Hint
            // 빈 리스트를 하나 만들고, 아내의 구매목록을 전부 담는다.
            //이후 남편의 구매목록 리스트를 for문을 이용하여 순회하고,
            //남편의 구매 물품이 빈 리스트에 존재하지 않는다면 빈 리스트에 해당 물품을 추가한다.


        }

//        빈 리스트를 하나 만들고, 아내의 구매목록을 전부 담는다.
        wishList = new ArrayList<>();
        wishList = wifeList;

//                이후 남편의 구매목록 리스트를 for문을 이용하여 순회하고,
        for (
                int i = 0; i < husbList.size(); i++) {
//        남편의 구매 물품이 빈 리스트에 존재하지 않는다면 빈 리스트에 해당 물품을 추가한다.
            if (wishList.contains(husbList.get(i))) {

            } else {
                wishList.add(husbList.get(i));

            }

        }
        System.out.println(wishList);
////
////        ArrayList<String> wishList = new ArrayList<>();
//
//        for(int i = 0; i < husbList.size(); i++){
//
//            // husbList.get(i)의 값이 wishList 안에 없어야 추가
//        boolean isContain = false;
//            for(int k = 0; k < wishList.size(); k++){
//                if(wishList.get(k).eqauls(husbList.get(i))) == true {
//                    wishList.add(husbList.get(i));
                }

            }






