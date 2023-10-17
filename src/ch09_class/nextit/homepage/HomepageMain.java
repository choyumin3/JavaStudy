package ch09_class.nextit.homepage;

import java.util.Scanner;


public class HomepageMain {

    public static void main(String[] args) {
        // 회원가입, 로그인, 회원목록
        // 로그인 후 게시판 진입
        // 글목록, 글쓰기, 글조회
        // 회원: 아이디, 비밀번호, 닉네임
        // 게시글: 글번호, 글제목, 글내용, 작성자(닉네임)

        // 곧 회원가입을 할때마다 Member 객체를 생성할거고
        // 생성된 Member 객체들은 MemberDB 안에 담을거야.
        // 생각해보니 MemberDb라는 객체는 딱 하나만
        // 생성해서 쓰겠네? -> 싱글톤(Singleton) 패턴 적용
        MemberDB memDB = MemberDB.getInstance();
        BoardDB boardDB = BoardDB.getInstance();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("행동을 선택해주세요.");
            System.out.println("1.회원가입 | 2. 로그인 | 3. 회원목록 | 4. 종료");
            System.out.println(">>> ");

            int command = Integer.parseInt(scan.nextLine());

            if (command == 1) {
                //회원가입
                System.out.println("아이디를 입력해주세요.");
                System.out.print(">>> ");
                String inputId = scan.nextLine();

                System.out.println("비밀번호를 입력해주세요.");
                System.out.print(">>> ");
                String inputPw = scan.nextLine();

                System.out.println("닉네임을 입력해주세요");
                System.out.print(">>> ");
                String inputName = scan.nextLine();

                Member mem = new Member(inputId, inputPw, inputName);
                // 회원가입시, 중복된 아이디를 입력했다면 회원가입을 진행시키지 않음

                memDB.signUp(mem);


                memDB.signUp(mem);
                System.out.println("회원가입 성공!! 로그인해주세요.");


                System.out.println("회원가입 성공!! 로그인해주세요.");


            } else if (command == 2) {
                //로그인

                System.out.println("아이디를 입력해주세요.");
                System.out.print(">>> ");
                String inputId = scan.nextLine();

                System.out.println("비밀번호를 입력해주세요.");
                System.out.print(">>> ");
                String inputPw = scan.nextLine();


                // 로그인의 결과가 실패면 result 는 null
                // 로그인의 결과가 성공이면 result는 null이 아님
                Member result = memDB.login(inputId, inputPw);

                System.out.println(result);

                if (result != null) {
                    // 로그인 성공
                    System.out.println("로그인 성공!!" + result.getName() + "님 환영합니다.");

                    // 게시판 진입
                    while (true) {
                        // 게시물 목록 출력
                        boardDB.printBoard();

                        System.out.println("행동을 선택해주세요.");

                        System.out.println("1. 글쓰기 | 2. 글보기 | 3. 로그아웃");

                        System.out.println(">>> ");

                        int select = Integer.parseInt(scan.nextLine());

                        if (select == 1) {
                            //글쓰기
                            System.out.println("글 제목 입력: ");
                            String inputTitle = scan.nextLine();

                            System.out.println("글 내용 입력: ");
                            String inputContent = scan.nextLine();

                            boardDB.writeBoard(inputTitle, inputContent,result.getName());



                        } else if (select == 2) {
                            //글보기
                            System.out.println("글 번호 입력: ");
                            int no = Integer.parseInt(scan.nextLine());

                            boardDB.readBoard(no);


                        } else if (select == 3) {
                            //로그아웃
                            break;
                        } else {
                            // 로그인 실패
                            System.out.println("잘못 입력하셨습니다.");
                        }
                    }


                } else if (command == 3) {
                    //회원 목록
                    memDB.showMemList();
                } else if (command == 4) {
                    //종료
                    System.out.println("종료하였습니다.");
                    break;

                } else {
                    System.out.println("잘못 입력하셨습니다.");
                }

            }


        }
    }
}

