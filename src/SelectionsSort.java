public class SelectionsSort implements Strategy {


    @Override
    public int[] methodOfSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }

            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }return array;
    }
}


