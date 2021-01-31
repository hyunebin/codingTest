package for_ex;

import java.util.Scanner;

public class 두수의합 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int Calc_num = sc.nextInt();
        int[] result = new int[Calc_num];

        for(int i=0; i < Calc_num; i++){
            int num_first = sc.nextInt();
            int num_second = sc.nextInt();

            result[i] = num_first + num_second;
        }

        for(int i=0; i < result.length; i++){
            System.out.printf( "Case #%d: %d\n",i+1,result[i]);
        }

//        for (int i: result){
//            System.out.println(i);
//        }

    }
}