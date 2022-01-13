import java.util.Scanner;

public class Doorman {

    public static void main(String[] args)
    {
    
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        String n = sc.next();
        char[] s = new char[n.length()];

        for(int i = 0; i < n.length(); i ++){
            s[i] = (n.charAt(i));
        }
        int man = 0;
        int woman = 0;
        int difference = 0;
        for(int i = 0; i < n.length(); i ++){
            if(s[i] == 'W'){
                difference = Math.abs(man - (woman +1));
                if(difference > max){
                    
                    if(i != s.length - 1 && s[i + 1] == 'M'){
                        man ++;
                        s[i + 1] ='W';
                        
                    }
                    else {
                        break;
                    }
                }

                else{
                    woman ++;
                }
            }
            else if(s[i] == 'M'){
                difference = Math.abs((man + 1) - woman);
                if(difference > max){
                    
                    if(i != s.length - 1 && s[i + 1] == 'W'){
                        woman ++;
                        s[i + 1] ='M';
                    }
                    else {
                        break;
                    }
                }
                
                else{
                    man ++;
                }
             

        }
        
    }

    System.out.println(woman + man);
}
}
