package co.rohit.dsa;

import java.util.Arrays;

public class LongestConsecutiveSequenceBruteForce {

    public static void main(String [] args) {
        int[] arr = {100,4,200,1,3,2};

        int longestSeq = getLongestSequence(arr);

        System.out.println("Longest Consecutive Sequence of array " + Arrays.toString(arr) + " is -> " + longestSeq);
    }

    public static int getLongestSequence(int[] arr) {
        int longestSeq = 0;

        for (int num : arr) {

            int currNum = num;
            int tempLongSeq = 0;

            while(contains(currNum, arr)) {
                tempLongSeq++;
                currNum++;
            }

            longestSeq = Math.max(tempLongSeq, longestSeq);
        }
        return longestSeq;
    }

    public static boolean contains(int currNum, int[] arr) {
        boolean contains = false;
        for (int num : arr) {
            if (currNum == num) {
                contains = true;
                break;
            }
        }
        return contains;
    }
}
