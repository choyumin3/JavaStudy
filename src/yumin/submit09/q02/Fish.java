package yumin.submit09.q02;

public class Fish {

    public String name; /* 물고기 이름*/
    public int price; // 물고기싯가

    public Fish (){

    }


    public Fish(String name, int price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
        
        
        
    }
}

