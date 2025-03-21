public class InversionCount {

    // Function to count inversions in the array
    public static int countInversions(int[] array) {
        int invCount = 0;
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
              
                if (array[i] > array[j]) {
                    invCount++;
                }
            }
        }
        
        return invCount;
    }

    public static void main(String[] args) {
        int[] array = { 5, 3, 2, 4, 1 };
        System.out.println("Total Inversions: " + countInversions(array));
    }
}
