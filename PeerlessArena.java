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
public class PeerlessArena {
    public static void main(String[] args) {
        //絕代江湖
        String str = ("【 初顧茅廬 】");
        String NameCheck;  //確認名字
        String PlayerName; //初始名字
        //NPC數組
        String[] NpcName ={"江小魚","花無缺","鐵心蘭","燕南天","蘇櫻"}; //名字
        String[] NpcLevelName = {"江湖人","江湖十奇","武尊","武皇","至尊武皇"}; //等級稱號
        int[] NpcLoves = {100,100,100,100,100,-1}; //NPC好感度
        int[] NpcLevel = {0,0,0,0,0,-1}; //NPC等級
        int index = -1; //用來佔存臨時索引
        int count = 5; //NPC的數量
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("歡迎進入絕代江湖世界！！");
        
         //取名
        do{
        System.out.print("請輸入您的大名 : ");
        PlayerName = sc.nextLine();
        System.out.println(str + "\n等級 : " + NpcLevel[0] + "\n稱號 : " + NpcLevelName[0] + "\n姓名 : " + PlayerName); 
        System.out.print("確定這組名字(Y/N)? \t ");
        NameCheck = sc.nextLine();
        } while(!"y".equalsIgnoreCase(NameCheck));
        System.out.println("歡迎 : " + PlayerName + " 大俠 - 來到絕代江湖世界。");
        
        System.out.println("請 " + PlayerName + " 大俠選擇一位江湖人，進行結伴同行! (選擇結伴同行好感度會浮動)" );
        System.out.println("1.江小魚\t" + NpcLoves[0] + "好感度");
        System.out.println("2.花無缺\t" + NpcLoves[1] + "好感度");
        System.out.println("3.鐵心蘭\t" + NpcLoves[2] + "好感度");
        System.out.println("4.燕南天\t" + NpcLoves[3] + "好感度");
        System.out.println("5.蘇櫻\t" + NpcLoves[4] + "好感度");
        int choose = sc.nextInt();
        
        //好感度的變動
        switch(choose) {
            default : 
                for(int i = 0; i < NpcName.length; i++){
                    NpcLoves[i] -= 20;
                }
                NpcLoves[choose - 1] = 100;
                break;
            case 5 :
                for(int i = 0; i < NpcName.length; i++) {
                    NpcLoves[i] -=20;
                }
                NpcLoves[4] = 100;
                break;
        }
        
        //打印NPC.好感度
        for(int i = 0; i < NpcLoves.length - 1; i++) {
            for(int j = 0; j <NpcName.length; j++) {
            }
            System.out.print(NpcLoves[i] + "\t" + NpcName[i] + "\n"); 
        }
    }
}
