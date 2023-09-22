package yumin.submit02;

import java.util.Scanner;

public class submit02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("이름을 입력해 주세요.");
        System.out.println(">>> ");

        String name = scan.nextLine();

        System.out.println("국어 점수를 입력해 주세요.");
        System.out.println(">>> ");

        String kor = scan.nextLine();

        System.out.println("영어 점수를 입력해 주세요.");
        System.out.println(">>> ");

        String eng = scan.nextLine();

        System.out.println("수학 점수를 입력해 주세요.");
        System.out.println(">>> ");

        String mat = scan.nextLine();

        int intkor = Integer.parseInt(kor);
        int inteng = Integer.parseInt(eng);
        int intmat = Integer.parseInt(mat);


        System.out.println("이름 :"+ name);
        System.out.println("국어 :"+ kor);
        System.out.println("영어 :"+ eng);
        System.out.println("수학 :"+ mat);

//        double avg = (double( intkor + inteng + intmat ) / 3;



        System.out.println("평균 :"+ ( intkor + inteng + intmat ) / (double)3);

//        소수 둘째자리 하는법 ??

//        System.out.printf("평균: %.2f", avg);


//        숫자열 변환 int x = Integer.parseInt(x);
//        문자열 -> 문자열 변환
//         System.out.println(x.replace("바꾸고싶은문자","바꾸고싶은문"));
//
//         숫자형 문자열을 정수로 형변환
//        String strNum = "123";
//
//        int num = Integer.parseInt(strNum);
//        System.out.println(num + 2);

//        System.out.println(fruits.indexOf("Banana"));
         int example = 278;

         String examplee = example + "";


        System.out.println(examplee);


//String str 1 = strEx.substring(0,1); // "2"
//String str 1 = strEx.substring(1,2); // "7"
//String str 1 = strEx.substring(2,3); // "8"




        System.out.println(examplee.substring(0,1));
        System.out.println(examplee.substring(1,2));
        System.out.println(examplee.substring(2,3));



       int a = Integer.parseInt(examplee.substring(0,1));
       int b = Integer.parseInt(examplee.substring(1,2));
       int c = Integer.parseInt(examplee.substring(2,3));

        System.out.println( a+b+c);


//        숫자를 문자열로 바꾸는법
//        String strEx = Integer.toString(example);
//        String strEx = "" + 278 ;  (자동 형변환 이용)

//        "









































    }

}
