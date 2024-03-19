import java.util.Arrays;

public class Ordenacao {

    public static void Bubble (int[] array) {
        int numero = array.length;
        for (int i = 0; i < numero-1; i++) {
            for (int j = 0; j < numero-i-1; j++) {
                if (array[j] > array[j+1]) {
                   
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    
    
    public static void Selection(int[] array) {
        int numero = array.length;
        for (int i = 0; i < numero-1; i++) {
            int minimo = i;
            for (int j = i+1; j < numero; j++) {
                if (array[j] < array[minimo]) {
                    minimo= j;
                }
            }
            
            int temp = array[minimo];
            array[minimo] = array[i];
            array[i] = temp;
        }
    }

    public static void Insertion(int[] array) {
        int numero = array.length;
        for (int i = 1; i < numero; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    
    public static void main(String[] args) {
        int[] array = {8, 4, 7, 1};
        
        // Bubble Sort
        int[] arrayBubble = Arrays.copyOf(array, array.length);
        Bubble(arrayBubble);
        System.out.println("Ordenacao em Bubble Sort: " + Arrays.toString(arrayBubble));
        
        
        int[] arraySelection = Arrays.copyOf(array, array.length);
        Selection(arraySelection);
        System.out.println("Ordenacao em Selection Sort: " + Arrays.toString(arraySelection));
        
        
        int[] arrayInsertion = Arrays.copyOf(array, array.length);
        Insertion(arrayInsertion);
        System.out.println("Ordenacao em Insertion Sort: " + Arrays.toString(arrayInsertion));
    }
}