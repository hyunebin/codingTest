package String_ex;
//다시보자..
import java.util.LinkedList;
import java.util.Scanner;

public class 그룹단어체커 {
    static int N = 0;
    static int K = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //sc에 대해서 입력을 받고
        int cnt = 0; //cnt를 세기위한 변수
        N = Integer.parseInt(sc.nextLine()); //입력을 받고
        for (int i = 0; i < N; i++) {
            boolean isGrp = true; // 그룹단어 체크
            String line = sc.nextLine();// 체크할 단어를 받는다.
            LinkedList<Character> l = new LinkedList<Character>(); // 캐릭터를 확인하기 위한 linkedlist
            for (int j = 0; j < line.length() - 1; j++) {// 리스트의 크기만큼 확인할 껀데
                if (l.contains(line.charAt(j))) // 단어의 처음부터 끝을 확인했을때 리스트 들어있다면
                    isGrp = false;
                if (line.charAt(j) != line.charAt(j + 1)) {
                    l.add(line.charAt(j));
                }
            }
            if (l.contains(line.charAt(line.length() - 1))) {
                isGrp = false;
            }

            if(isGrp)
                cnt++;
        }
        System.out.println(cnt);
    }
}