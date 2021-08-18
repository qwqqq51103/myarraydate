/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 陣列;

/**
 *
 * @author qwqqq
 */
public class BubbleDemo {
    public static void main(String[] args) {
        int N = 10000;
        //10個數字
        int[] nums = new int[N];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 100 + 1);
            System.out.print(nums[i] + "\t ");
        }
        System.out.println("");
        
        long startime = System.currentTimeMillis();
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = 0; j < nums.length - i - 1; j++) {
                if(nums[j] < nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println("排序後 : ");
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
        long endtime = System.currentTimeMillis();
        System.out.println("\n排序經耗時" +(endtime - startime) + "毫秒");
    }
}
