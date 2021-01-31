package array_ex;

import java.util.Scanner;

public class 평균은넘겠지2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        float percent = 0;

        for(int i =0; i < num; i++){
            int student = sc.nextInt();
            int count=0;
            float sum = 0;
            float avg = 0;
            int[] score = new int[student];

            for(int j =0; j < score.length; j++){
                score[j] = sc.nextInt();
                sum +=score[j];
            }

            avg = sum / student;

            for(int k : score){
                if(avg < k){
                    count++;
                }
            }

            percent=(float)count/student*100;
            System.out.printf("%.3f",percent);
            System.out.println("%");

        }
    }
}
