package if_ex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class 알람시계 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Hour = sc.nextInt();
        int Minute = sc.nextInt();

        if(Minute >= 45){
            System.out.println(Hour + " " + (Minute-45));
        }else{
            if (Hour == 0){
                System.out.println(23+ " "+ (15+Minute));
            }else {
                System.out.println(Hour-1 + " "+ (60-45+Minute));
            }
        }
    }
}
