public class addtozero {
    public static void main (String args[]) {
        int[] a = {-2,-1, 0, 1, 2, 3};
        addtozeros(a, 0);
    }
    static void addtozeros(int a[],int target){

        for (int i=0;i<a.length;i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == target) {
                        System.out.println("{"+a[i]+" " +a[j]+" "+a[k]+"}" );

                    }
                }
            }


        }
    }
        }
