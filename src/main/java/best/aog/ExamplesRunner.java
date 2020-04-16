package best.aog;

public class ExamplesRunner {

    public static void main(String[] args) {
        //runBinarySearchExample();
        runMergerSortExample();
    }

    private static void runBinarySearchExample() {
        int[] exampleArray = getIntArrayExample();
        printArray(exampleArray);
        System.out.println("Position of 2: " + BinarySearch.binarySearch(exampleArray, 2));
        System.out.println("Position of 5: " + BinarySearch.binarySearch(exampleArray, 5));
        System.out.println("Position of 9: " + BinarySearch.binarySearch(exampleArray, 9));
        System.out.println("Position of 1 in empty array: " + BinarySearch.binarySearch(new int[] {}, 1));
    }

    private static void runMergerSortExample() {
        int[] array = getRandomIntArrayExample(50);
        System.out.println("Unsorted array:");
        printArray(array);
        MergeSort.mergeSort(array);
        System.out.println("Sorted array:");
        printArray(array);
        array = getRandomIntArrayExample(0);
        MergeSort.mergeSort(array);
        System.out.println("Sorted empty array:");
        printArray(array);
    }

    private static int[] getIntArrayExample(){
        return new int[]{1, 2, 5, 7, 8, 9, 11};
    }

    private static int[] getRandomIntArrayExample(int size){
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int)(100 * Math.random());
        }
        return result;
    }

    private static void printArray(int[] array){
        System.out.print("Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.print("\n");
    }
}
