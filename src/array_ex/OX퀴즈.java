    package array_ex;

    import java.util.Arrays;
    import java.util.Scanner;
    //https://st-lab.tistory.com/50 참고
    public class OX퀴즈 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int amount = sc.nextInt();
            String[] array = new String[amount];

            for(int i = 0; i < array.length; i++){
                array[i] = sc.next();
            }

            for(int i =0; i < array.length; i++){
                int count = 0;
                int result = 0;

                for(int j =0; j < array[i].length(); j++){
                    if(array[i].charAt(j) == 'O'){
                        count++;
                    }else{
                        count = 0;
                    }

                    result += count;
                }

                System.out.println(result);
            }




        }
    }

