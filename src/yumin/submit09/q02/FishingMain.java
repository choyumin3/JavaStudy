package yumin.submit09.q02;

import java.util.ArrayList;
import java.util.Scanner;

public class FishingMain {

    public static void main(String[] args) {


        ArrayList<Fish> fishList = new ArrayList<>();


        fishList.add(new Fish("고등어", 5000));
        fishList.add(new Fish("광어", 25000));
        fishList.add(new Fish("우럭", 27000));
        fishList.add(new Fish("참돔", 30000));
        fishList.add(new Fish("돌돔", 35000));
        fishList.add(new Fish("능성어", 70000));
        fishList.add(new Fish("다금바리", 120000));

        Scanner scan = new Scanner(System.in);

        // 잡은 물고기를 담을 가방
        ArrayList<Fish> fishBag = new ArrayList<>();

        int count = 10;

        while (true) {
            System.out.println("행동을 선택해주세요.");
            System.out.println("1. 낚시하기 | 2. 잡은 물고기 목록 | 3. 떠나기");
            System.out.print(">>> ");

            int select = Integer.parseInt(scan.nextLine());
            int idx = 0;

            if (select == 1) {
                // TODO 낚시하기
                // 랜덤한 물고기를 낚아서 fishBag에 담기
                // fishList에서 랜덤한 인덱스에 있는 Fish 객체를 꺼내기
                // fishList 는 인덱스가 0~6, 0~6 사이의 랜덤 숫자를 획득


                int rand = (int) (Math.random() * 100) + 1;

                for(int m = 10; m <0 ; m--)



                // rand - > 1~10 -> 10%
                if(rand <= 5) {
                    // 다금바리
                    idx = 6;
                }else if(rand <= 15){
                    idx = 5;
                }else if(rand <= 27){
                    idx = 4;
                }else if (rand<= 40){
                    idx = 3;
                }else if (rand<= 55){
                    idx =2;
                }else if (rand<= 70){
                    idx =1;
                }else {
                    idx =0;
                }

                int rand2 = (int)(Math.random()*100)+1;
                if (rand2 <= 5){


                    System.out.println("낚싯대가 부셔졌습니다");

                   boolean broken = (select == 1) == false ;


                }boolean borken;
                // 5% 확률로 낚시대가 뿌셔질 수 있음
                // 낚시대가 뿌셔지면 더이상 낚시하기 불가능


                System.out.println(fishList.get(idx).getName() + "을 잡았다~!!");
                fishBag.add(fishList.get(idx));

                // 낚시하기 선택시
                // 다금바리 5% 확률
                // 능성어 10% 확률
                // 돌돔 12% 확률
                // 참돔 13% 확률
                // 우럭 15% 확률
                // 광어 15% 확률
                // 고등어 30% 확률 로 잡히도록 코드 수정


            } else if (select == 2) {
                // TODO 잡은 물고기 목록 보기
                System.out.println("내가방 =====================");
                int total =0;
                for(int i = 0; i < fishBag.size(); i++){
                    System.out.println(fishBag.get(i));
                    total += fishBag.get(i).getPrice();
                }

                System.out.println("총 0원====================");

            } else if (select == 3) {
                // TODO 종료
                break;
            }
            System.out.println();
        }


    }
}
