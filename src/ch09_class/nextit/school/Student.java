package ch09_class.nextit.school;

import ch09_class.nextit.Utill.UtillClass;

public class Student {

    // 필드변수를 private으로 두고
    // 필드변수에 대해 Getter, Setter를 만드는 행위
    // 캡슐화 (Encapsulation)
    private String name;
    private int kor;
    private int eng;
    private int math;
    private double avg;

    // 값을 입력받는 생성자
    // 단축키 [Alt + Insert ] - Constructor
    // 접근제어자
    // public : 해당 필드변수, 메소드, 생성자를 다른 패키지(폴더)에서 사용 가능
    // private : 현재 팡리 내에서만 사용 가능
    // (default): 접근제어자 기입 안한 상태, 같은 패키지 내에서만 사용가능
    // protected:


    public Student() {
    }

    public Student(String name, int kor, int eng, int math, double avg) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        calAvg();
    }

    // kor, eng, math로부터 평균을 계산하여 avg에 적용 메소드
    private void calAvg(){
        this.avg = UtillClass.myRound(((kor + eng + math) / 3.0),2);
    }

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        calAvg();
//           this(name,kor,eng,math, (kor + eng + math)/3.0;


    }

    @Override
    public String toString() {
        return
                name + ", 국어: " +  kor +

                ", 영어: " + eng +
                ", 수학: " + math +
                ", 평균: " + avg ;
    }

    // 값을 넘겨주는 메소드
    public int getMath() {
        return this.math;

    }

    // 값을 수정하는 메소드
    public void setMath(int math){
        this.math = math;
        calAvg();

    }

    // private 인 필드변수에 대한 get메소드 set메소드를
    // Getter Setter 라고 부른다.
    // [Alt + Insert] 를 이용하여 자동으로 만들 수 있다.


    public void setName(String name) {
        this.name = name;
    }

    public void setKor(int kor) {
        this.kor = kor;
        calAvg();
    }

    public void setEng(int eng) {
        this.eng = eng;
        calAvg();
    }






    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public double getAvg() {
        return avg;
    }



}














