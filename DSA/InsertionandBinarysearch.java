public class InsertionandBinarysearch {
//    This ia the selection sort and the binary search;
//    With the help of the selection sort
    public static void sortTheValue(int[] arr) {
       
//        Let's applying the insertio  sort

        for (int i =1; i<arr.length; i++) {
            System.out.println(arr[i]);
            int current = arr[i];
            int j = i-1;
            while (j>=0 && current< arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;

        }
        System.out.println("Aayush banset is.");
//        return newArray;
    }
    public static void main(String[] args) {

        System.out.println("Welcome to the backtracking");
//        System.out.println("mY NAME IS aAYUSH BSERT]");
        int[] unsortedArray = {3,6,72,6,8,5,8,5,3,3,7,4};
        sortTheValue(unsortedArray);
        int[] arr = {1,7,9,13,32,33,42,54,56,1000};
        System.out.println(unsortedArray[2]+ "This is");
        for (int i=0; i<arr.length; i++) {
//            Now this the sorted array in the insending order show we can used the binary search here;
            System.out.println(unsortedArray[i] + "S");
        }

//        Get the middle value from the array;
        int mid = arr.length/2;
        int findValue = 1000;
        System.out.println(mid +"This is the mid value");
        if(arr[mid] <= findValue) {
            System.out.println("Loop should be Go on the right path");
            for (int j =mid; j<arr.length; j++) {
                if(arr[j] == findValue) {
                    System.out.println(arr[j] + "Is matched in the index number"+ " =>>>>>" +j);
                } else {
                    System.out.println("Value Doesnot exist");
                }
            }

        } else if (arr[mid]  >= findValue) {
            System.out.println("Loop should be opposite");
            for (int i=mid; i>=0; i--) {
                if(arr[i] == findValue) {
                    System.out.println(arr[i] + "value is matched on the index number" + "=>>>> " + i);
                }  else {
                    System.out.println(arr[i] + "Value doesnot matched");
                }
            }

        } else {
            System.out.println(arr[mid] + ":Value matched on the index no " + mid);
        }
    }
}
