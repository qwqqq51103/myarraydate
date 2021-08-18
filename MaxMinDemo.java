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
import java.util.Scanner;
public class MaxMinDemo {
    public static void main(String[] args) {
        //設定一個數組
        final int N = 10;
        int[] nums = new int[N];
        for(int i = 0; i < nums.length; i++) {
            //給這個數組隨機的數字
            nums[i] = ((int) (Math.random() * 10000))% 1001; //1~1000隨機
        }
        //打印數組中的隨機數字
        System.out.println("數組中的數字");
        for(int i = 0; i < nums.length; i ++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println();
        //開始找出最大值最小值
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < nums.length; i++) {
            if (max < nums[i]){
                max = nums[i];
            }
            if(nums[i] < min){
                min  = nums[i];
            }
        }
        System.out.println("最大數 : " + max );
        System.out.println("最小數 : " + min );
    }
}
