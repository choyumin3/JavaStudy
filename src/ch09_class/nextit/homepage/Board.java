package ch09_class.nextit.homepage;

public class Board {
    private int no;                     /* 글 번호 */
    private String title;               /* 글 제목 */
    private String content;             /* 글 내용 */
    private String name;                /* 작성자 닉네임 */

    @Override
    public String toString() {
        return "Board{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Board() {
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Board(int no, String title, String content, String name) {
        this.no = no;
        this.title = title;
        this.content = content;
        this.name = name;
    }
}

