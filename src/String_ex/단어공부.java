package String_ex;
//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
//
//입력
//첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
//알파벳 출력시 a + 1 = b것을 생각해보자
//       for(int i =0; i < word.length(); i++){
//            for(int j =0; j < aplhabet.length(); j++){
//                if(word.charAt(i) == aplhabet.charAt(j)){
//                    word_count[j]++;
//                }
//            }
//        }

public class 단어공부 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine(); // 입력을 받고
        word = word.toUpperCase(); // 소문자 대문자 구분이 없어야 함으로
        int[] word_count = new int[26];// 알파벳은 26개가 존재
        int max = 0; //  대소비교를 위한 변수
        int index = 0;// 인덱스를 표현하기 위한 변수

        for(int i =0; i < word.length(); i++){ // 내가 받은 단어의 길이만큼
            int alpabet = word.charAt(i); //단어의 알파벳을 하나씩 가져옴
            word_count[alpabet-65]++; // 알파벳 -65 를 하면 알파벳의 위치가 나오게된다. 아스키코드의 A의 값  65
        }

        for(int i = 0; i< word_count.length; i++){
            if(max < word_count[i]){ //여기서 최대값을 가져오게 된다.
                max = word_count[i] ;
                index = i + 65; // 최대가 있는 인덱스를 찾았음으로 순서와 알파벳 A의 int값을 더해주면 출력가능
            }else if(max == word_count[i]){
                index ='?';
            }
        }
        System.out.println((char)(index));
    }
}
