package credit;

import java.util.Scanner;

public class Credit {
    public static void main(String[] args) {

        System.out.print("점수를 입력하세요. : ");
        Scanner scanner = new Scanner(System.in);

        String sungJuk = scanner.nextLine();
        int jumsu = (Integer.parseInt(sungJuk))/10;
        char grade;


        switch (jumsu) {
            case 9 :
                grade = 'A';
                break;

            case 8 :
                grade = 'B';
                break;

            case 7 :
                grade = 'C';
                break;

            case 6 :
                grade = 'D';
                break;

            default:
                grade = 'F';
                break;

        }
        System.out.println("입력한 사람의 점수는 "+grade+"입니다." );
    }
}