package for_ex;

import java.util.Scanner;

public class 구구단 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();
        if(dan <=10 && dan >0){
            for(int i =1; i<= 9; i++){
                System.out.printf("%d * %d = %d \n", dan, i, dan * i );
            }
        }
    }

}
