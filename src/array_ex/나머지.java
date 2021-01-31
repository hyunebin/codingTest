package array_ex;

//문제
//        두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
//
//        수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
//
//        출력
//        첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.

//이때 중복을 제거하는 방법은 set를 사용하거나 직접 라이브러리 함수를 구성한다. 라이브러리 함수가 조금더 빠르다고 한다.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class 나머지 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<Integer>();
        int[] numberic = new int[10];

        for(int i =0; i < numberic.length; i++){
            numberic[i] =  sc.nextInt() % 42;
            hashSet.add(numberic[i]);
        }

        System.out.println(hashSet.size());
    }
}

//직접 구현하는 법은 arrayList를 사용 향상된 eachfor문을 사용하여 List의 contain메소드를 사용하여 중복을 걸러낸다.