package String_ex;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//문제
//알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
public class 알파벳찾기 {
    public static void main(String[] args) throws Exception{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine(); // 버퍼로 읽어오고

        for(char i = 'a' ; i <= 'z'; i ++){ // a부터 z까지 비교하게됨
            System.out.print(word.indexOf(i) + " "); // indexof는 문자열에서 해당 문자를 찾고 있으면 index번호를 리턴 없으면 -1 리턴
        }
    }
}
