package yumin.submit08;

import java.util.*;

public class submit08 {
    public static void main(String[] args) {

//먼저 빈 HashSet을 하나 만들고

        HashSet<Integer> makeLotto = new HashSet<Integer>();


        // while문 내에서 빈 HashSet에 랜덤 로또 번호를 HashSet의 사이즈가 6개가 될 때까지 넣는다.

        for (int i = 0; makeLotto.size() < 6; i++) {

            int rand = (int) (Math.random() * 45) + 1;

            makeLotto.add(rand);

            System.out.println(makeLotto);

        }

//        while(temp.size() < 6){
//        temp.add(int(Math.random()*45)+1);
//          if(temp.size() == 6){
//              break;
//          }
//        }
//        for(Integer num : temp){
//            result.add(num);
//        }

//이후 HashSet을 ArrayList로 변환한 다음

        ArrayList<Integer> myLotto = new ArrayList<>();

        myLotto.addAll(makeLotto);


        System.out.println("\n===================로또시뮬레이션=====================\n");

//        int[] winLotto = {11, 21, 22, 30, 39, 44};
//
//        int num = 0;
//
//        while (true) {
//            int[] lotto = makeLotto();
//            num++;
//            int count = 0;
//
//            for (int i = 0; i < lotto.length; i++) {
//                if (winLotto[i] == lotto[i]) {
//                    count++;
//                }
//
//            }
//
//            if (count == 6) {
//                System.out.println("당첨!!");
//                System.out.println(num + "회 구매");
//                System.out.println(num * 1000L + "원 씀");
//                break;
//
//            } else {
//                System.out.println(count + "개 맞춤. 현재 " + num + "회 구매");
//            }
//
//        }
        //winLotto와 lotto의 숫자 6개가 일치하는지 확인
        //winLotto와 lotto의 각 인덱스 자리의 숫자가 일치하는 개수 카운트

        //lotto는 ArrayList lotto는 배열


        // , 오름차순으로 ArrayList를 정렬하여 리턴한다.


        System.out.println("\n======================1번끝=====================\n");

        System.out.println(myLotto);

        System.out.println("\n======================1번답=====================\n");


        HashMap<String, String> infoMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        infoMap.put("a001", "1234a");
        infoMap.put("b001", "1234b");
        infoMap.put("c001", "1234c");
        infoMap.put("d001", "1234d");
        infoMap.put("e001", "1234e");

        // .containsKey(값)
        // Map 내부 요소 중에 괄호 안 값과 같은 Key가 존재하면 true, 없으면 false

        // System.out.println(stuMap.containsKey("둘째"));
        // System.out.println(stuMap.get("둘째") != null); // 위와 같음

        System.out.println(infoMap.get(1));

        while (true) {
            System.out.println("아이디를 입력해주세요");
            System.out.print(">>>");
            String inputText = scan.nextLine();

            System.out.println("비밀번호를 입력해주세요");
            System.out.print(">>>");
            String inputText2 = scan.nextLine();

            if (infoMap.containsKey(inputText)) {

                if (infoMap.equals(inputText) && (infoMap.equals(inputText2))) {
                    System.out.println("로그인 성공");

                } else {
                    System.out.println("비밀번호가 틀렸습니다.");
                    break;
                }

            } else {
                System.out.println("존재하지 않는 아이디 입니다.");
                break;
            }

        }

    }

    public static int[] makeLotto() {

        int[] numArr = new int[6];
        int idx = 0;

        while (true) {
            // 랜덤 숫자 생성
            int rand = (int) (Math.random() * 45) + 1;

            // 랜덤 숫자가 현재 배열 내 존재하는지 체크
            boolean isDuple = false;
            for (int i = 0; i < numArr.length; i++) {
                if (numArr[i] == rand) {
                    // 랜덤 숫자가 현재 배열에 존재함
                    isDuple = true;

                }

            }
            // 위 for문이 끝날때까지 if문이 단 한번이라도 실행이 되었는지 체크
            // isDuple이 false일때 rand를 배열에 담기
            if (!isDuple) {
                numArr[idx] = rand;
                idx++;

            }

            if (idx == 6) {
                break;
            }

        }

        Arrays.sort(numArr);


        return numArr;


    }
}











