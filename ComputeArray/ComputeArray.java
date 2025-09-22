public class ComputeArray {
    public static int[] computeArray(int[] array) {
        // your code here
        if (array == null) {
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                array[i] *= 5;
            }
            if (array[i] % 3 == 1) {
                array[i] += 7;
            }
        }
        return array;
    }
}

// 45 20 8 23 8 0 89