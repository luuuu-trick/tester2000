package sortalgs;


public class Insertion_Sort {
public static void insertionSort(Integer[] array) {
    int size = array.length;
    if(array.length == 1){
        return;
    }
    for (int step = 1; step < size; step++) {
        int key = array[step];
        int j = step - 1;
        // Compare key with each element on the left of it until an element smaller than it is found.
        while (j >= 0 && key < array[j]) {
            array[j + 1] = array[j];
            j--;
        }
        // Place key at after the element just smaller than it.
        array[j + 1] = key;
    }
}
}

/**
 *
 * @author luisb
 */