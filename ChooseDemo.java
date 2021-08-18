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
public class ChooseDemo {
    public static void main(String[] args) {
        int N = 10000;
        int[] nums = new int[N];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 1000 + 1);
//            System.out.print(nums[i]);
//            if((i + 1) % 20 == 0 ) {
//            System.out.println();
//            }else{
//                System.out.print("\t");
//            }
        }
        
        long startime  = System.currentTimeMillis();
        //冒泡排序
        for(int i = 0; i < nums.length -1; i++) {
            for(int j = 0; j < nums.length - 1 - i; j++) {
                if(nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        long endtime  = System.currentTimeMillis();
        System.out.println("冒泡排序耗時 : " + (endtime - startime) + "毫秒");
        //選擇排序
        //原理 :每次循環交換i 與 minImdex的值
        startime  = System.currentTimeMillis();
        for(int i = 0; i < nums.length; i++) {
            int min = nums[i]; //假設i是最小值
            int minIndex = i; //最小值的索引
            //內循環找最小值
            for(int j = i + 1; j < nums.length; j++) {
                if(min > nums[j]) {
                    min = nums[j];
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        endtime  = System.currentTimeMillis();
        System.out.println("選擇排序耗時 : " + (endtime - startime) + "毫秒");
//        System.out.println("排序後 : ");
//        for(int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i]);
//            if((i + 1) % 20 == 0 ){
//                System.out.println();
//            }else{
//                System.out.print("\t");
//            }
//        }
    }
}
