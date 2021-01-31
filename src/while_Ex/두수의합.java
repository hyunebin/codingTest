package while_Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 두수의합 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> result = new ArrayList<Integer>();


        while(true){
            int first_num = sc.nextInt();
            int second_num = sc.nextInt();
            result.add(first_num + second_num);

            if(first_num == 0 && second_num == 0){
                break;
            }
        }

       for(int i =0; i<result.size()-1; i++){
           System.out.println(result.get(i));
       }

    }
}