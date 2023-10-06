package yumin.submit03;

public class submit03 {

    public static void main(String[] args) {


        int c = 1;
        for (int i = 1; i < 10; i++) {
            c *= i;

            System.out.println(c);
        }

        String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
        int w = 0;
        for (int i = 0; i < findWally.length(); i += 2) {
            String subStr = (findWally.substring(i, i + 2));
// 마지막 i가 59 - > 마지막이 58이 되도록 수
            if (subStr.equals("월리")) {

                w += 1;

            }
        }
        System.out.println(w);
        String stars = "*****";

        stars.substring(0, 5); // 어 ?? 0, 5 두번 째 1, 5
        stars.substring(1, 5); //
        stars.substring(2, 5); //
        stars.substring(3, 5);
        stars.substring(4, 5);
        stars.substring(5, 5);

        String C = "";
        for (int i = 0; i < stars.length(); i++) {

            C = stars.substring(i, stars.length());

            System.out.println(C);
        }

        String inputText = "내일부터 추석이당~";
// -> ~당이석추 터부일내
// ~ -> inputText.substring(9,10) i가 0일때 10
// 당 -> inputText.substring(8,9) i가 1일때 9
// 이 -> inputText.substring(7,8) i가 2일때 8
// 내 -> inputText.substring(0,1) i가 3일때 7

        System.out.println(inputText.length()); // 10글자



String reverse = "";
for(int i = inputText.length();i>0; i++){
reverse += inputText.substring(i , i+1);
    System.out.println(i + ": " + reverse);
}
    for(int i = 0; i< inputText.length(); i++){
        reverse += inputText.substring(9-i, 10-i);
        System.out.println(i + ": " + reverse);
}



    }
}

