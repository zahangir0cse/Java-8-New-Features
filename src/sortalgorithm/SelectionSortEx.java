package sortalgorithm;

public class SelectionSortEx {

    public static void selectionSort(int[] args) {
        for (int i = 0; i < args.length; i++) {
            int index = i;
            for (int j = i + 1; j < args.length; j++) {
                if (args[j] < args[index]) {
                    index = j;
                }
            }
            int smallerNumber = args[index];
            args[index] = args[i];
            args[i] = smallerNumber;

        }
    }

    public static void main(String[] args) {
        int[] arr1 = {9, 14, 3, 2, 43, 11, 58, 22};
        System.out.println("Before Selection Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        selectionSort(arr1);//sorting array using selection sort  

        System.out.println("After Selection Sort");
        for (int i : arr1) {
            System.out.print(i + " ");
        }

    }
}
