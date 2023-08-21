package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public static int sequence(int[] arr) {
        int sum = 0;
        int max = 0;
        for(int i = 0; i < arr.length;i++) {
            int keepInt = arr[i];
            for(int j = i + 1; j < arr.length;j++) {
                if(j == i + 1) {
                    sum = keepInt + arr[j];
                }
                else {
                    sum+= arr[j];
                    max = Math.max(max, sum);
                }
            }
            sum = 0;
        }
        return max;
    }
}