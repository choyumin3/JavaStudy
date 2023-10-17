package yumin.submit09.q01;

import java.beans.ConstructorProperties;

public class Product {

    public String name;
    public int price;


public Product (){

}

    public Product(String name, int price) {
        this.name = name;
        this.price = price;

    }

    @Override
    public String toString() {
        return "제품명:" + name +
                ", 가격" + price
                ;

        // private String name; /* 제품명 */
        // private int price;   /* 가격 */

//        public product() {
//
//        }
//        }
//
//
//        @Constructor
//        @Getter
//        @Setter
    }
}