package for_ex;

import java.util.Scanner;

public class 합 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        if(num >0 && num < 10001){
            for(int i =1; i <=num; i++){
                result +=i;
            }
        }else {
            System.exit(0);
        }
        System.out.println(result);
    }
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(plus(num));
//    }
//
//    public static int plus(int a) {
//        if (a == 1) {
//            return 1;
//        } else {
//            return a + plus(a - 1);
//        }
//    }
}
