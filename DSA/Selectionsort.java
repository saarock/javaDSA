public class Selectionsort {
    public static void main(String[] args) {
//        This is the selection sort
        int[] arr = {1, 5, 2,3 , 4, 8, 6, 7};
        for (int i = 1; i < arr.length; i++) {
//            System.out.println(arr[i]);
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int changeArray = arr[i];
                    arr[i] = arr[j];
                    arr[j] =  changeArray;
                }

            }

        }

        for (int i =0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
