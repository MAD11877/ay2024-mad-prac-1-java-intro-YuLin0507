import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        /**
         * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
         * Print out the mode (highest occurrence) from the set of integers. 
         *    e.g.
         *     > 5
         *     > 2
         *     > 4
         *     > 1
         *     > 3
         *     > 4
         *     4
         * 
         *    e.g.
         *     > 4
         *     > 2
         *     > 2
         *     > 3
         *     > 3
         *     2
         * Hint: Use a loop to get input. Use another 2 loops to find the mode
         */
         
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        
        int[] numbers = new int[count];
        int maxNumber = Integer.MIN_VALUE;
        // Find the maximum number to determine the size of the frequencies array
        for (int i = 0; i < count; i++) {
            int num = in.nextInt();
            numbers[i] = num;
            if (num > maxNumber) {
                maxNumber = num;
            }
        }

        int[] frequencies = new int[maxNumber + 1]; // frequencies array size dynamically determined
        
        // Loop to update frequencies array
        for (int num : numbers) {
            frequencies[num]++;
        }
        
        // Find the mode (number with highest frequency)
        int mode = -1;
        int maxFrequency = 0;
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > maxFrequency) {
                maxFrequency = frequencies[i];
                mode = i;
            }
        }
        
        // Print the mode
        System.out.println(mode);
        
        // Close the scanner to release resources
        in.close();
    }
}
