package lottoProgram;

import java.util.Arrays;

public class LottoProgram {
    public static void main(String[] args) {

        int lotto[] = new int[5];	// 로또 번호를 입력받을 배열을 선언해준다.

        System.out.println("로또 번호 : ");
        for(int i = 0; i < lotto.length; i++) {
            int num = (int)(Math.random() * 100) + 1;	// 1~100까지의 임의의 수를 받는다.
            lotto[i] = num;
            for(int j = 0; j < i; j++) {	// 중복된 번호가 있으면 이전 포문으로 돌아가 다시 시행한다.
                if(lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
            System.out.println(lotto[i] + " ");	// 로또번호를 출력한다.

        }
        Arrays.sort(lotto);
        for (int x : lotto)
            System.out.print("["+x+"]");
        System.out.println();

        int middle = lotto[lotto.length/2];
        System.out.println("중앙값 : "+middle);
        int max = lotto[lotto.length-1];
        System.out.println("최대값 : "+max);
        int min = lotto[0];
        System.out.println("최소값 : "+min);


    }
}
