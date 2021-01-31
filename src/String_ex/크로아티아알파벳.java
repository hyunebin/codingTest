package String_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;


public class 크로아티아알파벳 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();


        String[] alpabet = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for(int i = 0; i < alpabet.length; i++){
            word=word.replaceAll(alpabet[i], "0");
        }

        System.out.println(word.length());

    }
}
