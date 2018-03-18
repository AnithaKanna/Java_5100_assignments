public class LongestContinousArray {
    public static void main(String args[]) {
        int[] array = {1, 3, 5, 4,7};
        int length = 1;
        int i, j;
        int a = array[1] - array[0];

        for (i = 0; i < array.length; i++) {

            for (j = i + 1; j < array.length; j++) {

                if ((array[j] - array[i]) == a && (array[j]>array[i])) {
                    length++;
                    }
                    else
                    break;

            }

        }
        System.out.println("the output is:" + length);
    }
}