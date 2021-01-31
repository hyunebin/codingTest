    package String_ex;

    import java.io.BufferedReader;
    import java.io.IOError;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.StringTokenizer;

    public class 상수 {
        public static void main(String[] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            String first_num = (st.nextToken());
            String new_num1 = "";
            String secound_num = (st.nextToken());
            String new_num2 = "";

            int a = first_num.length();
            int b = secound_num.length();

            for(int i = a-1; i >= 0;i--){
                new_num1 += first_num.charAt(i);
            }

            for(int i = b-1; i >= 0;i--){
                new_num2 += secound_num.charAt(i);
            }

            if(Integer.parseInt(new_num1) > Integer.parseInt(new_num2)){
                System.out.println(new_num1);
            }else{
                System.out.println(new_num2);
            }





        }
    }
