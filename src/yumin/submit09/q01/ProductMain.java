package yumin.submit09.q01;

import java.util.ArrayList;

public class ProductMain {

    public static void main(String[] args) {

        //제품명: 냉장고, 가격: 2000000
        //제품명: TV, 가격: 1000000
        //제품명: 에어컨, 가격: 800000
        //제품명: 컴퓨터, 가격: 1300000
        //제품명: 선풍기, 가격: 100000

        Product ice = new Product("냉장고", 2000000);
        Product tv = new Product("TV", 1000000);
        Product air = new Product("에어컨", 800000);
        Product compu = new Product("컴퓨터", 1300000);
        Product fan = new Product("선풍기", 100000);

        System.out.println(ice);
        System.out.println(tv);

        ArrayList<Product> eleList = new ArrayList<>();

        eleList.add(ice);
        eleList.add(tv);
        eleList.add(air);
        eleList.add(compu);
        eleList.add(fan);

        System.out.println(eleList.size());

        for (int k = 0; k < eleList.size() - 1; k++) {

            for (int i = 0; i < eleList.size() - 1; i++) {


                if (eleList.get(i).price < eleList.get(i + 1).price) {

                    Product tmp = eleList.get(i);
                    eleList.set(i, eleList.get(i + 1));
                    eleList.set(i + 1, tmp);


                    System.out.println(eleList);
                }


            }
            for (int i = 0; i < eleList.size(); i++) {
                System.out.println(eleList.get(i));
            }


        }

        for (int i = 0; i < eleList.size(); i++) {
//ArrayList를 순회하면서 담겨져 있는 객체의 name이 TV인 경우 그때의 인덱스를 출력
            if (eleList.get(i).name=="TV") {

                System.out.println(eleList.indexOf(eleList.get(i)));

            }


        }
    }
}