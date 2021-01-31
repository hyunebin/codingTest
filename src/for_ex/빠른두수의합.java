package for_ex;

import java.io.*;
import java.util.StringTokenizer;

public class 빠른두수의합 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(bufferedReader.readLine());
        int a = 0;
        int b = 0;
        for(int i=0; i < num; i++){
            String input_s = bufferedReader.readLine();
            StringTokenizer stringTokenizer = new StringTokenizer(input_s);
            a = Integer.parseInt(stringTokenizer.nextToken());
            b = Integer.parseInt(stringTokenizer.nextToken());;

            bufferedWriter.write(Integer.toString(a+b));
            bufferedWriter.newLine();

        }

        bufferedWriter.flush();



    }
}

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        String input_s = br.readLine();
//        StringTokenizer input = new StringTokenizer(input_s); //한줄씩 읽어온걸 반환해줄것
//        int a = Integer.parseInt(input.nextToken());// 첫번째 인자를 불러오는법
//        int b = Integer.parseInt(input.nextToken());// 두번째 인자를 불러옴
//
//        bw.flush();
//        bw.close();

// String[] array = input_s.split(" ");//공백마다 끊어서 배열에 저장하던가
