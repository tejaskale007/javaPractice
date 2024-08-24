import java.util.Arrays;

class ThreeSum {
    void find3Numbers(int[] A, int arr_size, int sum)
    {
        int l, r;
        Arrays.sort(A);

        for (int i = 0; i < arr_size - 2; i++) {
            l = i + 1;
            r = arr_size - 1;
            while (l < r) {
                if (A[i] + A[l] + A[r] == sum) {
                    System.out.print("Triplet is " + A[i] + ", " + A[l] + ", " + A[r]);
                    return;
                }
                else if (A[i] + A[l] + A[r] < sum)
                    l++;

                else
                    r--;
            }
        }
    }

    public static void main(String[] args)
    {
        ThreeSum triplet = new ThreeSum();
        int[] A = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int arr_size = A.length;

        triplet.find3Numbers(A, arr_size, sum);
    }
}
