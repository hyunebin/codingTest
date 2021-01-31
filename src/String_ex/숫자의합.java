package String_ex;

import java.util.Scanner;

//문제
//        N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
//입력
//첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

//자리수로 나누는것또한 좋은방법인듯
//        int t = 0;
//        while(n_num != 0) {
//            t += (n_num % 10);
//            n_num = (n_num / 10);
//        }
public class 숫자의합 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number = sc.nextInt();
        String numbers = sc.next();

        for(int i =0; i < number; i++){
            sum += Character.getNumericValue(numbers.charAt(i));
        }

        System.out.println(sum);
    }
}
