package Array.HomeWorkQuestions;

public class duplicateElements {
    //    WAP to find the duplicate elements from the given array of elements.
    public static void findDuplicates(int[] arr) {
        System.out.print("Duplicate elements: ");
        boolean hasDuplicates = false;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;  // Duplicate found, break inner loop
                }
            }
            // Check if we've already printed this duplicate before
            if (isDuplicate) {
                boolean alreadyPrinted = false;
                for (int k = 0; k < i; k++) {
                    if (arr[k] == arr[i]) {
                        alreadyPrinted = true;
                        break;
                    }
                }
                if (!alreadyPrinted) {
                    System.out.print(arr[i] + " ");
                    hasDuplicates = true;
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 2};
        findDuplicates(arr);
    }
}






