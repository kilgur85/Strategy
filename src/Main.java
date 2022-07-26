import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,15,22,68,2,44,3,50};
Sorter sorter = new Sorter();
sorter.setStrategy(new SelectionsSort());
sorter.executesort(array);
System.out.println(Arrays.toString(array));

    }
}
