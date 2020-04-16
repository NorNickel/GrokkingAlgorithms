package best.aog;

public class ExamplesRunner {

    public static void main(String[] args) {
        runBinarySearchExample();
    }

    private static void runBinarySearchExample() {
        int[] exampleArray = getIntArrayExample();
        printArray(exampleArray);
        System.out.println("Position of 2: " + BinarySearch.indexOf(exampleArray, 2));
        System.out.println("Position of 5: " + BinarySearch.indexOf(exampleArray, 5));
        System.out.println("Position of 6: " + BinarySearch.indexOf(exampleArray, 6));
    }

    private static int[] getIntArrayExample(){
        return new int[]{1,2,2,2,2,3,5,5,5,5,5,5,5,5,7,7,8,8,8};
    }

    private static void printArray(int[] array){
        System.out.print("Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
