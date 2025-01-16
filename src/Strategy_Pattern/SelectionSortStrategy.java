package Strategy_Pattern;

public class SelectionSortStrategy implements SortStrategy {
    @Override
    public int[] sort(int[] A) {
        System.out.println("Selection sort algorithm used");
        int n=A.length, i, j, min_index=-1;
        for(i=0;i<n-1;i++) {
            min_index=i;
            for(j=i+1;j<n;j++) {
                if(A[j]<A[min_index])
                    min_index=j;
            }
            swap(A,i,min_index);
        }
        return A;
    }

    private void swap(int[] A, int index1, int index2) {
        int temp=0;
        temp=A[index1];
        A[index1]=A[index2];
        A[index2]=temp;
    }
}
