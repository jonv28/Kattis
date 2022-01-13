import java.util.Scanner;

public class Natrij {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split(":");
        long time1 = Integer.valueOf(s[0])*3600 + Integer.valueOf(s[1])*60 + Integer.valueOf(s[2]);
        s = sc.next().split(":");
        long time2 = Integer.valueOf(s[0])*3600 + Integer.valueOf(s[1])*60 + Integer.valueOf(s[2]) + 24 *60 * 60;

        time2 -= time1;

        String seconds = (int) time2 % 60 + ""; 
        String minutes = (int) ((time2 % 3600) / 60) + "";
        String hours = (int) (time2/3600) % 24 + "";

        if(!(seconds.length() == 2)){
            seconds = "0" + seconds;
        }

        if(!(minutes.length() == 2)){
            minutes = "0" + minutes;
        }

        if(!(hours.length() == 2)){
            hours = "0" + hours;
        }
        String ans = hours + ":" + minutes + ":" + seconds;

        if(ans.equals("00:00:00")){
            ans = "24:00:00";
        }
        System.out.println(ans);


    }
    
}
