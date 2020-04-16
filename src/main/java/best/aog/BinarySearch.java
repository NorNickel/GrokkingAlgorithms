package best.aog;

public class BinarySearch {
    public static final int NOT_FOUND = -1;

    public static int binarySearch(int[] sortedArray, int item){
        return binarySearch(sortedArray, 0, sortedArray.length - 1, item);
    }

    public static int binarySearch(int[] sortedArray, int low, int high, int item) {
        if (low >= high) {
            return NOT_FOUND;
        }
        int middleIndex = low + (high - low) / 2;
        int middleValue = sortedArray[middleIndex];
        if (middleValue > item){
            return binarySearch(sortedArray, low, middleIndex, item);   //recursion
        } else if  (sortedArray[middleIndex] < item) {
            return binarySearch(sortedArray, middleIndex + 1, high, item);  //recursion
        } else {
            return middleIndex;
        }
    }

}
