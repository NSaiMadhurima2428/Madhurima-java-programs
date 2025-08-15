import java.util.Arrays;
class ArrayDeletion {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int position = 2;
        if (position < 0 || position >= arr.length) {
            System.out.println("Invalid position");
            return;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == position) continue;
            newArr[j++] = arr[i];
        }
        System.out.println("After deletion: " + Arrays.toString(newArr));
    }
}
