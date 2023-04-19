package org.theceshop;

public class Project3AddTo10 {

    public static void printCombinationsThatEqual10(int[] nums) {
        if (nums.length <= 1) {
            System.out.println("Please enter at least 2 numbers");
        } else {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == 10) {
                        System.out.println(nums[i] + " + " + nums[j] + " = 10");
                    }
                }
            }
        }
    }

//    Playing around with a recursion solution
//    public static void printCombinations(int[] nums) {
//        printCombinations(nums, 0, 1);
//    }
//
//    private static void printCombinations(int[] nums, int i, int j) {
//        if (i >= nums.length - 1) {
//            return;
//        }
//        if (j >= nums.length) {
//            printCombinations(nums, i + 1, i + 2);
//            return;
//        }
//        if (nums[i] + nums[j] == 10) {
//            System.out.println(nums[i] + " + " + nums[j] + " = 10");
//        }
//        printCombinations(nums, i, j + 1);
//    }
}
