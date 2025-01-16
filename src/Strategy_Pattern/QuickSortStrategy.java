package Strategy_Pattern;

import java.util.Random;

public class QuickSortStrategy implements SortStrategy {
    @Override
    public int[] sort(int[] A) {
        System.out.println("Quicksort algorithm used");
        int n=A.length;
        quickSort(A,0,n-1);
        return A;
    }

    private void quickSort(int[] A, int left, int right) {
        if(left>=right)
            return;
        int pivot=partition(A,left,right);
        quickSort(A,left,pivot-1);
        quickSort(A,pivot+1,right);
    }

    private int partition(int[] A, int left, int right) {
        Random random=new Random();
        int index=random.nextInt(right-left+1)+left;
        swap(A,index,right);
        int pivot=A[right];
        int i=left-1, j;
        for(j=left;j<=right-1;j++) {
            if(A[j]<pivot) {
                i++;
                swap(A,i,j);
            }
        }
        swap(A,i+1,right);
        return (i+1);
    }

    private void swap(int[] A, int index1, int index2) {
        int temp=0;
        temp=A[index1];
        A[index1]=A[index2];
        A[index2]=temp;
    }
}
