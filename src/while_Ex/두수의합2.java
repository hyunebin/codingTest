package while_Ex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 두수의합2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList result = new ArrayList<Integer>();

        while (sc.hasNextLine()){
            String number = sc.nextLine();
            StringTokenizer st = new StringTokenizer(number);
            if(!number.isEmpty()){
                result.add(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            }else{
                break;
            }
        }

        for (int i =0; i < result.size(); i++){
            System.out.println(result.get(i));
        }

    }
}
