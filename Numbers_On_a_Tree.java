import java.util.Scanner;
public class Numbers_On_a_Tree {

      public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String info = sc.nextLine();
        String[] info2 = info.split(" ");
        int depth = Integer.valueOf(info2[0]);
        long total = (long)Math.pow(2, depth + 1) - 1;
        if(info2.length == 1){
            System.out.println(total);
            return;
        }
        String direction = info2[1];


     int j = 0;
     long[] graph = new long[(int) total];
     for(long i = total; i > 0; i --){
        graph[j] = i;
        j ++;
     }

     int answer = 1;
     for(char k : direction.toCharArray()){
        if(k == 'L'){
            answer = answer * 2;
        }
        else {
            answer = answer * 2 + 1;
        }
     }

     System.out.println(graph[answer - 1]);
     
    }
}
