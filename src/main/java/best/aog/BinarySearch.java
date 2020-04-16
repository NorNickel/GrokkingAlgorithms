package best.aog;

public class BinarySearch {
    public static final int NOT_FOUND = -1;

    public static int indexOf(int[] sortedArray, int item){
        return indexOf(sortedArray, item, 0, sortedArray.length - 1);
    }

    public static int indexOf(int[] sortedArray, int item, int right, int left) {
        if (left - right == 1){
            if (sortedArray[left] == item) {
                return left;
            }
            return NOT_FOUND;
        }
        int middle = (left + right) / 2;
        if (sortedArray[middle] >= item){
            return indexOf(sortedArray, item, right, middle);  //recursion
        } else {
            return indexOf(sortedArray, item, middle, left);   //recursion
        }
    }
}
