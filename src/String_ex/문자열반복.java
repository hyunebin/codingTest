package String_ex;
//문제
//문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//조건
//첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다.
//둘째 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8),
//셋째 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다.
public class 문자열반복 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int  testcase = Integer.parseInt(br.readLine()); // 첫째에 필요한 테스트 케이스

        for(int i = 0; i< testcase; i++){ // 테스트 케이스만큼 반복
            String[]  str = br.readLine().split(" ");// 테스트 케이와 문자열 S가 공백으로 구분되어 주어짐으로 split으로 나눠줌
            String s = str[1]; // 반복할려는 문자열
            for(int j =0; j < s.length(); j++){ // 문장에서 한글자씩
                for(int k =0; k < Integer.parseInt(str[0]); k++){// 반복횟수만큼 반복하겠다.
                    System.out.print(s.charAt(j));
                }
            }

        }
    }
}
