public class Sorter {
    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void executesort(int[] array){
        strategy.methodOfSort(array);
    }
}

