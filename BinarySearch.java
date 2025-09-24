public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 8, 9};
        int target = 7;

        int low = 0, high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("Element " + target + " found at index " + mid);
                found = true;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element " + target + " not found");
        }
    }
}
