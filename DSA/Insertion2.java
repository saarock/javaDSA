public class Insertion2 {

//    public static void chaeck(int[] b) {
//        for (int i=0; i<b.length; i++) {
//            System.out.println(b[i]);
//        }

//    }
    public static void main(String[] args) {
        int arr[] = {4,1,4,4,45,56,6,7,2,323,70,3,6367,5,23,53,456,35,8};
        for (int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while (j>=0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1] = current;



        }
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//        chaeck(arr);
    }
}
