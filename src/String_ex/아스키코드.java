package String_ex;

import java.util.Scanner;

public class 아스키코드 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        System.out.println((int)a.toCharArray()[0]);
    }
}
