package if_ex;

import java.util.Scanner;

class 두수비교 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();


        if(A-B>0){
            System.out.println(">");
        }else if(A == B){
            System.out.println("==");
        }else {
            System.out.println("<");
        }
    }
}
