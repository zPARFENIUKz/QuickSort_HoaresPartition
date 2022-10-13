public class QuickSort {

    public static void quickSort(final int[] arr){
        if (arr == null) return;
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(final int[] arr, final int lowIndex, final int highIndex){
        if (lowIndex < highIndex){
            final int pivotIndex = partition(arr, lowIndex, highIndex);
            quickSort(arr, lowIndex, pivotIndex);
            quickSort(arr, pivotIndex + 1, highIndex);
        }
    }

    private static int partition(final int[] arr, final int lowIndex, final int highIndex){
        final int pivot = arr[lowIndex];
        int leftPtr = lowIndex, rightPtr = highIndex;
        while (true){
            while(arr[leftPtr] < pivot) ++leftPtr;
            while(arr[rightPtr] > pivot) -- rightPtr;
            if (leftPtr >= rightPtr){
                return rightPtr;
            }
            swap(arr, leftPtr, rightPtr);
            ++leftPtr;
            --rightPtr;
        }
    }



    private static void swap(final int[] arr, final int index1, final int index2){
        final int buf = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = buf;
    }
}
