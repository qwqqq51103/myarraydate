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
public class BinarySearchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {3,5,6,8,9,10,15,23,34,45,57,88,99};
        //2分法原理
        //首先要先把數組升序排列
        //1.如果key小於中間元素，只需要數組前一半元素中查找
        //2.如果key和中間元素相等，匹配成功
        //3.如果key大於中間元素，只需要在數組的後一半查找
        System.out.println("輸入查找的數字 : ");
        int SearchNums = sc.nextInt();
        //不確定找幾次
        boolean isFind = false; //是否找到
        int low = 0; //最小值是索引0
        int hight = nums.length -1; //最大值是數組的-1
        int delIndex = -1;  //刪除元素的索引
        int count = nums.length; //當前數組元素的總個數
        while(hight >= low) {
        //計算中間值
        int mid = (hight + low) / 2;
        if(SearchNums < nums[mid]) { //1.如果key小於中間元素，只需要數組前一半元素中查找
            hight = mid - 1;
        }else if(SearchNums > nums[mid]) { //3.如果key大於中間元素，只需要在數組的後一半查找
             low = mid + 1;
        }else{//2.如果key和中間元素相等，匹配成功
            System.out.println("找到了 索引 : " + mid);
            delIndex = mid; 
            isFind = true;
            break;
        }
        }
        if(!isFind || delIndex == -1) {
            System.out.println("沒有找到");
            System.exit(0);
    }
        //刪除數組中元素
        //1.找到要刪元素的索引 delIndex
        //2.從索引元素開始 後面一個元素賦值給前面的一個元素 -覆蓋
        //3.數組總長度-1
        count--;
        for(int i = delIndex; i < count; i++) {
            nums[i] = nums[i+1];
        }
        for(int i = 0; i < count; i++) {
            System.out.print(nums[i] + ", ");
        }
}
}
