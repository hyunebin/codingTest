package for_ex;

//    문제
//        자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
//
//    입력
//        첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

import java.util.Scanner;

public class N찍기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n <= 100000  && n > 0);
        for(int i =0; i <n; i++){
            System.out.println(n-i);
        }

    }
}
