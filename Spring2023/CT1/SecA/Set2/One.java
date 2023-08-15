package Spring2023.CT1.SecA.Set2;

public class One {
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 6, 2};
        int[] arr2 = {2, 3, 4, 5};
        int[] arr3 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] > arr2[i] ? arr1[i] : arr2[i];
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
