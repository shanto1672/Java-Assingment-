/**
 *Problem number 7.3
 */
public class SumWithoutSmallest {
    public static void main(String[] args) {
        int sum = 0, smallest = 10000;
        System.out.println("Enter the array size");
        int[] numbers = {5, 4, 6, 7, 12, 8, 50, 13, 15, 2, 1};
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                if(i!=0) {
                    sum = sum + smallest;
                }
                smallest = numbers[i];

            } else sum = sum + numbers[i];
        }
        int diff;
        diff=sum-smallest;

        System.out.println("The Difference = "+diff);
    }

}