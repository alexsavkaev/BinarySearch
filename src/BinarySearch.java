public class BinarySearch {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        System.out.println(binarySearch(data, 17));
    }
    public static int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

