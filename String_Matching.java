
import java.util.Scanner;

public class String_Matching {

    static void KMP(String pat, String text){
        int m = pat.length();
        int n = text.length();
        int j = 0;

        //preprocessing pi
        int[] pi = new int[m];
        int len = 0;
        int i = 1;
        pi[0] = 0;
        
        while(i < m){
            if(pat.charAt(i) == pat.charAt(len)){
                len ++;
                pi[i] = len;
                i ++;
            }

            else{
                if(len != 0){
                    len = pi[len - 1];
                }
                else {
                    pi[i] = len;
                    i++;
                }
            }
        }
        
        i = 0;
        while(i < n){
            if(pat.charAt(j) == text.charAt(i)){
                j++;
                i++;
            }

            if(j == m){
                System.out.print((i - j) + " ");
                j = pi[j - 1];
            }
            
            else if (i < n && pat.charAt(j) != text.charAt(i)){
                if(j != 0){
                    j = pi[j - 1];
                }
                else {
                    i = i + 1;
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String pattern = sc.nextLine();
            String word = sc.nextLine();
            KMP(pattern, word);
            System.out.println();
            if(!sc.hasNext()){
                break;
            }

        }
        
        
    }
}