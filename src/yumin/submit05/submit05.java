package yumin.submit05;

public class submit05 {
    public static void main(String[] args) {

        System.out.println(3 % 3);

        makeTree(5);
        makeTree(7);

        System.out.println("\n==============================\n"); // 1번끝

        String example = "로꾸꺼 로꾸꺼";
        String result = reverseStr(example);
        System.out.println(result);

        System.out.println("\n=============================\n"); //2번끝

        String myBinaryStr = makeBinary(23);
        System.out.println(myBinaryStr);

         makeTriangle(7);


    }// 메소드끝
    public static void makeTriangle(int floor){

        // i=0, balnk=3 star=1
        // i=1, blank=2, star=1, blank=1, star=1
        // i=2, balnk=1, star=1, blank=3, star=1
        // i=3, blank=0, star=7

        // i=0, balnk=4 star=1
        // i=1, blank=3, star=1, blank=1, star=1
        // i=2, balnk=2, star=1, blank=3, star=1
        // i=3, blank=1, star=1, blank=5, star=1
        // i=4, blank=0, star=9,

        // i=0, balnk=5 star=1
        // i=1, blank=4, star=1, blank=1, star=1
        // i=2, balnk=3, star=1, blank=3, star=1
        // i=3, blank=2, star=1  blank=5, star=1
        // i=4, blank=1, star=1, blank=7, star=1
        // i=5, blank=0, star=11
        for(int i = 0; i <floor; i++){
            String leftblank = "";
            for(int k = 0; k < (floor-1)-i;k++){
                leftblank += " ";
            }
            if ( i==0){
                //맨 위층
                System.out.println(leftblank + "*");
            }else if(i==floor){
                // 맨 밑에층
                String star = "";
                for(int s = 0;s< (floor*2)-1; s++){
                    star += "*";
                }
            }else{
                //중간층
                String innerBlank = "";
                for(int b = 0; b < (i*2)-1; b++){
                    innerBlank += " ";
                }
                System.out.println(leftblank + "*" + innerBlank + "*");
            }
        }
    }


    public static String makeBinary(int n){

        // 문자열 변수를 하나 선언해서
        String empty = "";

        // 입력받은 정수를 2로 나눈 나머지를 문자열 변수에 더한다.
        //empty += n % 2;  -> 23 % 2 = 1
        //         11 % 2;  ->11 % 2 = 1
        //         5  % 2;  -> 5 % 2 = 1
        //                     2 % 2 = 0
        //                     1 % 2 = 1

        while(n >= 1){
            empty += n%2;
            n=n/2;

        }

        // 이진수로 만들어진 문자열 변수를 거꾸로(로꾸꺼) 뒤집은 다음 리턴
        String reverse1 = "";
        for (int i = 0; i < empty.length(); i++){
            reverse1 += empty.substring((empty.length()-1-i),empty.length()-i);

        }




        return reverse1 ;
    }



    public static String reverseStr(String example) {
        String reverse = "";


        for (int i = 0; i <= example.length() - 1; i++) {
            reverse += example.substring((example.length() - 1) - i, (example.length()) - i);


        }
        return reverse;
    }

    public static void makeTree(int n) {
        for (int i = 0; i < n; i++) {

            String blank = " ";
            for (int k = 0; k < (n - 1) - i; k++) {
                blank += " ";
            }
            String stars = " ";
            for (int k = 0; k < (i * 2) + 1; k++) {
                stars += "*";
            }
            System.out.println(blank + stars);

        }

    }
}
