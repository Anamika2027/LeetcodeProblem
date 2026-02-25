import java.util.Scanner;
import java.util.PriorityQueue;
public class heap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            pq.add(sc.nextInt());
        }

        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());

    }
}