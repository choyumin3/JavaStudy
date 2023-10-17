package yumin.submit10;

public class Book {

//    도서 번호와 도서 제목, 그리고 대여 여부를 필드변수로
//    포함하는 Book 클래스를 만들어주세요. 대여 여부의
//    기본값(디폴트값)은 false로 해주세요


    private int no;                         /* 도서 번호 */
    private String name;                    /* 도서 제목 */
    private boolean lent = false;           /* 대여 여부 */

    public Book() {
    }

    public Book(int no, String name, boolean lent) {
        this.no = no;
        this.name = name;
        this.lent = lent;
    }

    @Override
    public String toString() {
        return "Book{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", lent=" + lent +
                '}';
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLent() {
        return lent;
    }

    public void setLent(boolean lent) {
        this.lent = lent;
    }
}
