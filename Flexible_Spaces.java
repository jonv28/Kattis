import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Flexible_Spaces {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int num_part = sc.nextInt();
        int[] parts = new int[num_part + 1];
        parts[num_part] = length;
        for(int i = 0; i < num_part; i++){
            parts[i] = sc.nextInt();
        }

        Arrays.sort(parts);
        SortedSet<Integer> ans = new TreeSet<Integer>();

        for(int i = 0; i < num_part + 1; i ++){
            ans.add(parts[i]);
            for(int j = i + 1; j < num_part + 1; j ++){
                ans.add(parts[j] - parts[i]);
            }
        }
        
        for(int i : ans){
            System.out.println(i);
        }

        sc.close();

    }
    
}
