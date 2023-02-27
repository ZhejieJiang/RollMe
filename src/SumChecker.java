import java.util.ArrayList;

public class SumChecker {

    public static boolean canAddUp(ArrayList<Integer> numbers, int targetSum) {
        // Create an ArrayList to store the sums of all subsets of numbers
        ArrayList<Integer> subsetSums = new ArrayList<Integer>();

        // Add 0 as the initial sum to subsetSums
        subsetSums.add(0);

        // Loop through each number in the input list
        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);

            // Create a new ArrayList to store the sums of subsets that include the current number
            ArrayList<Integer> newSums = new ArrayList<Integer>();

            // Loop through each sum in subsetSums and add the current number to it
            for (int j = 0; j < subsetSums.size(); j++) {
                int sum = subsetSums.get(j) + currentNumber;

                // If the sum is equal to the target sum, return true
                if (sum == targetSum) {
                    return true;
                }

                // Add the sum to newSums
                newSums.add(sum);
            }

            // Add all sums in newSums to subsetSums
            subsetSums.addAll(newSums);
        }

        // If no subset of numbers adds up to the target sum, return false
        return false;
    }
}