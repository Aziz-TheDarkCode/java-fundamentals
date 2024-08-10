package ComputeArray;

public class ComputeArray {
    public static int[] computeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            switch (array[i] % 3) {
                case 0:
                    array[i] *= 5;
                    break;
                case 1:
                    array[i] += 7;
                    break;
                case 2:
                    break;
            }
        }
        return array;
    }
}
