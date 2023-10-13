package yumin.submit09.q01;

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
    }
}