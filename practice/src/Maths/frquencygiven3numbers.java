package Maths;

public class frquencygiven3numbers {
    public static int findUnique(int[] arr) {
        int result = 0;

        for (int i = 0; i < 32; i++) { // 32 bits for an integer
            int sum = 0;
            int mask = (1 << i);

            for (int num : arr) {
                if ((num & mask) != 0) {
                    sum++;
                }
            }

            if (sum % 3 != 0) {
                result |= mask;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4};
        int uniqueNumber = findUnique(arr);
        System.out.println("The unique number is: " + uniqueNumber);
    }
}
