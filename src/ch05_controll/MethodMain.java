package ch05_controll;

public class MethodMain {
    public static void main(String[] args) {

        // 메소드 = method = 함수 = function
        // 굳이 나누자면
        // 메소드는 클래스에 종속된 함수를 말하며,
        // 함수는 클래스에 독립적인 함수를 말한다. ( 신경쓰지 않아도 된다 )

        // 1부터 100까지 다 더하면 결과는?

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;

        }
        System.out.println(sum);


        for (int i = 30; i <= 60; i++) {
            sum += i;

        }
        System.out.println(sum);

        for (int i = 25; i <= 50; i++) {
            sum += i;

        }
        System.out.println(sum);


        //main method 끝


        //메소드의 선언
        //public : 접근 제어자
        //static : 정적 메소드 선언
        //void : 함수의 리턴값이 없음을 의미 (리턴값이 있으면 이 자리에 리턴값의 타입을 적어준다)
        //printSum은 함수명을 의미 ( 선언한 메소드를 실행시 함수명을 이용)
        //소괄호() 안에는 입력받을 파라미터를 선언


        System.out.println("\n==============================================\n");

        //위 작업을 메소드로 만들기
        // a부터 b까지 더한 결과는?

        // 함수의 실행 - > 함수명();
        System.out.println("printSum 실행 전");
        printSum(10, 20);
        System.out.println("printSum 실행 후");


        printSum(5, 10);
        printSum(70, 90);

        // 함수를 쓰면 좋은점
        // 실행부의 코드가 간결해진다(= 가독성이 좋아진다)
        // 중복된 코드를 한 곳에서 관리할 수 있으므로
        // 수정할 때 용이하다 !!!!

        // 리턴값이 존재하는 함수?
        String fruits = "Apple";
        System.out.println(fruits.substring(1, 3)); // "pp" 를 리턴

        // 리턴값이 존재하는 함수 만들기
        returnSum(1, 3);  // 실행만 하고 리턴값을 사용하지 않는 상황
        System.out.println(returnSum(1, 3));

        // 리턴값을 변수에 담을 수 있다.
        int num = returnSum(1, 3);
        System.out.println(num);

        // 리턴 값이 없으면 (void) 변수에 담을 수 없다.
//        int n = printSum(1 , 3);

        System.out.println("\n======================================\n");

//        System.out.println(); 를 파이썬처럼 print() 로 만들어 쓰기
        print("우리의 println");
        System.out.println("우리의 println");

        System.out.println(returnSum(1, 3));
        print(returnSum(1, 3));

        System.out.println("\n================================================\n");

        // Math.abs() : 절대값을 리턴해주는 함수
        int rst = Math.abs(-10);
        System.out.println(rst);

        rst = myAbs(-10);

        System.out.println("\n===================================================\n");

        // 메소드 makeCard 메소드 만들기
        // 파라미터로 이름, 국영수 점수를 넣으면

        // ==== 성적표 ====
        // 이름 : 유민
        // 국어 : 90
        // 영어 : 87
        // 수학 : 79
        // 평균 : 85.45
        // 등급 : B
        // ===============
        // 위와 같이 콘솔창에 성적표가 출력되도록 한다.
        // (평균이 90점 이상이면 A, 80점 이상이면 B, 그 외 C)

        makeCard("유민", 90, 87, 79);

        // 함수명:myAbs
        // 파라미터타입: int
        // 리턴타입 : int
        // 파라미터로 음수가 들어오면 양수로 바꿔서 리턴
        // 양수가 들어오면 양수 그대로 리턴

    }//main 메소드 끝


    public static void makeCard(String name, int kor, int eng, int math){
        System.out.println("이름: "+ name);
        System.out.println("국어: "+ kor);
        System.out.println("영어: "+ eng);
        System.out.println("수학: "+ math);

       double avg  = (double)(kor + eng + math) / 3;
       // avg를 소수 셋째자리에서 반올림하여 소수 둘째자리로 만들기
        // Math.round() 는 소수 첫째자리에서 반올림한 정수 값을 리턴
        // 우리만의 반올림 메소트 myRound()를 만들어보자!!

        avg = myRound(avg, 3);

        System.out.println("평균: " + avg);

       String deg = "C";
       if(avg >=90) {
           deg = "A";
       }else if(avg >=80) {
           deg = "B";
       }
        System.out.println("등급 " + deg);


    } public static void print(String word){
        System.out.println(word);


    }

    /**
     * 입력한 소수를 소수 n번째 자리로 반올림하여 리턴해주는 함수
     * @param num 반올림 하고자 하는 소수
     * @param n 소수 n번째 자리를 지정하는 정수
     * @return 반올림된 소수 리턴
     */
    public  static double myRound(double num, int n){
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
        for(int i = 0; i <n; i++){
            one *= 10;
        }

        return (double)Math.round(num * one) / one;
    }

    public static int myAbs(int num){
        if(num < 0 ){
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
public static void printSum(int startNumber,int endNumber){
        int sum = 0;
        for(int i = startNumber ; i <= endNumber ; i++){
            sum += i;

        }
    System.out.println(startNumber+ "부터 " + endNumber+ " 까지 " +  sum);
}
public  static int returnSum(int startNumber, int endNumber){
    int sum = 0;
    for(int i = startNumber ; i <= endNumber ; i++){
        sum += i;

    }
        // sum 값을 리턴
    return sum;
}



}





