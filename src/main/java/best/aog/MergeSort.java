package best.aog;

public class MergeSort {
    public static void mergeSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    public static void mergeSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        mergeSort(array, low, middle);
        mergeSort(array, middle + 1, high);
        merge(array, low, middle, high);

/*

    // Method with full copy of array always

        int[] buffer = new int[array.length];
        System.arraycopy(array, low, buffer, 0, array.length);

        int indexLeft = low, indexRight = middle + 1;

        for (int i = low; i <= high; i++) {
            if (indexLeft > middle) {
                array[i] = buffer[indexRight];
                indexRight++;
            } else if (indexRight > high) {
                array[i] = buffer[indexLeft];
                indexLeft++;
            } else if (buffer[indexLeft] < buffer[indexRight]) {
                array[i] = buffer[indexLeft];
                indexLeft++;
            } else {
                array[i] = buffer[indexRight];
                indexRight++;
            }
        }
 */
    }

    private static void merge(int[] array, int low, int middle, int high) {
        int bufferSize = high - low + 1;
        int[] buffer = new int[bufferSize];
        System.arraycopy(array, low, buffer, 0, bufferSize); // copy just needed elements

        int highBuffer = bufferSize - 1, middleBuffer = highBuffer - (high - middle);
        int indexLeft = 0, indexRight = middleBuffer + 1;

        for (int i = low; i <= high; i++) {
            if (indexLeft > middleBuffer) {
                array[i] = buffer[indexRight];
                indexRight++;
            } else if (indexRight > highBuffer) {
                array[i] = buffer[indexLeft];
                indexLeft++;
            } else if (buffer[indexLeft] < buffer[indexRight]) {
                array[i] = buffer[indexLeft];
                indexLeft++;
            } else {
                array[i] = buffer[indexRight];
                indexRight++;
            }
        }
    }
}
