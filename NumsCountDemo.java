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
public class NumsCountDemo {
    public static void main(String[] args) {
        //隨機數組求偶基數
        Scanner sc = new Scanner(System.in);
        final int N = 500;
        int[] nums = new int[N];
        //賦予他值
        for(int i = 0; i < nums.length; i++) {
            //隨機亂數
            nums[i] = ((int)(Math.random() * 10000)) % 1001;
        }
        //打印數組中的字
        System.out.println("數組的數字");
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
        //求偶基數幾個
        System.out.println();
        int count1 = 0, count2 = 0; //偶基數的次數
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                count1++;
            }else{
                count2++;
            }
        }
        System.out.printf("偶數有%d個,基數有%d個", count1, count2);
    }
}
               
