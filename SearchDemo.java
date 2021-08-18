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
public class SearchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 10;
        int[] nums = new int[N];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = ((int)(Math.random()*10000)) % 1001;
        }
        System.out.println("數組的數字");
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println();
        //查找數組中的數字 沒有找到就-1
        int SearchNums;
        int SearchIndex = -1;
        System.out.println("輸入要查找的數字 : ");
        SearchNums = sc.nextInt();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == SearchNums) {
                SearchIndex = i; //找到了立即退出
                break;
            }
        }
        if(SearchIndex == -1) {
        System.out.println("沒有找到");
        }else{
            System.out.println("找到了在第" + SearchIndex + "個");
        }
    }
}
