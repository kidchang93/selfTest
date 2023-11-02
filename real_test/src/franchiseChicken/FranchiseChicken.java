package franchiseChicken;

import java.util.Scanner;

public class FranchiseChicken {


    // 본사로부터 각 지점장 교육을 위해 방문하여 출석체크중
    private String name; // 브랜드 네임
    private int store;   // 몇 호점인지
    private String branch;  // 어디 지점인지

    public void inputData() {

        Scanner sc = new Scanner(System.in);
        System.out.print("브랜드 : ");
        name = sc.nextLine();
        System.out.print("점포 번호 : ");
        store = Integer.parseInt(sc.nextLine());
        System.out.print("점포 위치 : ");
        branch = sc.nextLine();
    }
    public void outputData(){
        System.out.println("브랜드 : "+name);
        System.out.println("점포 번호 : "+store);
        System.out.println("점포 위치 : "+branch);

    }

    public static void main(String[] args) {
        FranchiseChicken franchiseChicken = new FranchiseChicken();

        franchiseChicken.inputData();

        System.out.println("--- 확인 되었습니다. ---");

        franchiseChicken.outputData();
    }
}
