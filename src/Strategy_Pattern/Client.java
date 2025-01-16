package Strategy_Pattern;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter array size :-");
        n=sc.nextInt();
        int[] A=new int[n];
        System.out.println("Enter array elements :-");
        for(int i=0;i<n;i++)
            A[i]=sc.nextInt();
        Sorter sorter=new Sorter(A);
        int[] sorted=sorter.sortArray();
        System.out.println("Sorted Array :-");
        for(Integer num : sorted) {
            System.out.println(num);
        }
    }
}
