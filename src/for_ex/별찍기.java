package for_ex;

import java.util.Scanner;

public class 별찍기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i <=n; i++){
            for(int j=0; j<i; j++){
                System.out.printf("%s","*");
            }
            System.out.println();
        }
    }
}
