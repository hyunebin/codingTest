package array_ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 최대값 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numberic = new int[9];
        for(int i=0; i < numberic.length; i++ ){
            numberic[i] = sc.nextInt();
        }
        int[] cp_numberic = numberic.clone();
        Arrays.sort(numberic);

        for(int j =0; j< numberic.length; j++){
            if(numberic[numberic.length-1] == cp_numberic[j]){
                System.out.println(cp_numberic[j]);
                System.out.println(j+1);
            }
        }

    }
}
