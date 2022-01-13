import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Bank_Queue{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int curTime = 0;
        int curP = N - 1;
        Long totalMoney = (long) 0;
        boolean[] times = new boolean[T];
        Person[] people = new Person[N];
        
        for(int i = 0; i < N; i ++){
            Person newPerson = new Person(sc.nextInt(), sc.nextInt());
            people[i] = newPerson;
        }

        Arrays.sort(people, new Person(0,0)); 

        while(curTime < T && curP >= 0 ){
           Person curPerson = people[curP];
           
            for(int time = curPerson.time; time >= 0; time --){
                if(!times[time]){
                    times[time] = true;
                    curTime ++;
                    totalMoney += curPerson.money;
                    break;
                }
            }
            curP --;

            
        }

        System.out.println(totalMoney);
    }
}


class Person implements Comparator<Person>{

    int money;
    int time; 
    public Person(int money, int time){
        this.money = money;
        this.time = time;
    }
    @Override
    public int compare(Person p1, Person p2) {
         if(p1.money == p2.money){
			if(p1.time < p2.time){
				return -1;
			}
			else if (p1.time > p2.time){
				return 1;
			}
			else{
				return 0;
			}
		}

		else if(p1.money > p2.money){
			return 1;
		}
		else {
			return -1;
		}
    }



    
}