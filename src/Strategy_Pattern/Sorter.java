package Strategy_Pattern;

public class Sorter {
    int[] A;
    SortStrategy strategy;

    public Sorter(int[] A) {
        this.A=A;
        strategy=getStrategy();
    }

    public int[] sortArray() {
        strategy.sort(this.A);
        return this.A;
    }

    private SortStrategy getStrategy() {
        if(this.A.length<=10)
            return new SelectionSortStrategy();
        else
            return new QuickSortStrategy();
    }
}
