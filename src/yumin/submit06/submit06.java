package yumin.submit06;

public class submit06 {
    public static void main(String[] args) {

        String[] nameList = {"이정재", "김혜수", "이병헌", "송중기", "유아인", "류준열", "공유", "마동석", "이종석", "황정민", "박소담",
                "이선균", "이성민", "최민식", "이동휘", "권상우", "소지섭", "공효진", "조정석", "허성태", "이하늬"};

        // for문으로 각각의 요소에 접근,

        String firstName = "";
        int lee = 0;
        for (int i = 0; i < nameList.length; i++) {

            if (nameList[i].substring(0, 1).equals("이")) {

                lee += 1;
            }


        }
        System.out.println("이씨 성을 가진 배우가 총 " + lee + "명 있습니다");
        System.out.println("\n======================================\n");
        //for문 바깥에 int 변수 하나 선언해둔 뒤,
        int max = 0;
        int min = 0;

        //크다면 int 변수에 해당 요소의 값 저장


        int[] intArr = {23, 456, 213, 32, 464, 1, 2, 4};
        // for문을 돌리면서 각각의 요소가 int 변수보다 큰지 비교
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] > max) {
                max = intArr[i];

            }
        }
        System.out.println("최대값" + max);

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < max) {
                max = intArr[i];


            }
        }
        System.out.println("최소값" + max);


    }

}
