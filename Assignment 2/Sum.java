//as for the picture you upload, i am sorry to say that my requirement is to write the same function as the video, not screenShot. Then you did not get the score for that part. I can not open the earth.class. you can explain this to me in flock if you feel anything wrong.

public class sum {
    public static void main(String args[]) {
        int[] a = {2, 7, 11, 15};
        twosum(a, 9);
    }

    static void twosum(int a[], int target) {
        int index1 = -1, index2 = -1;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) ;
                {
                    System.out.println("index 1:" + i+1);
                    System.out.println("index 2:" + j+1);
                    return;
                }
            }
        }
        System.out.println("not found");
    }
}
