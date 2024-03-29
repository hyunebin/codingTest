package array_ex;
//첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
//
//둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
//
//출력
//각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
// 입력을 3번을 받자..
import java.util.Arrays;
import java.util.Scanner;

public class 평균은넘겠지 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] array = new String[Integer.parseInt(sc.nextLine())];
        Float[] avg = new Float[array.length];
        float average = 0;

        for(int i =0; i< array.length; i++){
            array[i] = sc.nextLine(); //배열을 String으로 입력받아서 정리함
        }

        for(int i =0; i< array.length; i++){
            String[] a =array[i].split(" "); // String으로 받은 배열을 하나씩 비교하기 시작
            int sum = 0;
            int count = 0;

            for(int j =1; j < a.length; j++){
                sum += Float.parseFloat(a[j]);
            }
            average = sum / Float.parseFloat(a[0]);

            for(String k :  a){
                if(Float.parseFloat(k) > average){
                    count++;
                }
            }
            avg[i] = (count / ((float)a.length-1)) * 100;

        }

        for(int i =0; i < avg.length; i++){
            System.out.printf("%.3f", avg[i]);
            System.out.println("%");
        }
    }
}
