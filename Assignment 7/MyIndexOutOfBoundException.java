public class MyIndexOutOfBoundException {


    public MyIndexOutOfBoundException() {
        int[] array = new int[10];
        int i = 0;
        int lowerbound = array[0];
        int upperBound = array.length;
        int index = array[i];


        for (i = 0; i < array.length; i++) {
            if (array[i] == 10) {
                System.out.println("Error Message:  Index:" + index + " LowerBound:" + lowerbound + " upperBound:" + upperBound);
            }
        }
    }
    public static void main(String args[]) {
        int[]array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


    }
            }



