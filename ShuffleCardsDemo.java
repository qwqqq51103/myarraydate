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
public class ShuffleCardsDemo {
    public static void main(String[] args) {
        int N = 52;
        int[] cards = new int[N];
        //52張牌
        
        //要知道0-51的花色數字是什麼
        String[] cardsColors = {"黑桃", "紅心", "方塊", "梅花"};
        String[] cardsValues = {
            "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "J", "Q", "K"
        };
        for(int i = 0; i < cards.length; i++) {
            cards[i] = i ;//牌面與循環變量的質一致 0-51;
        }
        //洗牌前
        System.out.println("洗牌前 : ");
        for(int i = 0; i < cards.length; i++) {
            //System.out.print(cards[i]);
            System.out.printf("%s - %s", cardsColors[cards[i] / 13], cardsValues[cards[i] % 13]);
            //打印4組 1組13張所以 % 13 == 0
            if((i + 1) % 13 ==0) {
                System.out.println();
            }else{
                System.out.print("\t ");
            }
        }
        //洗牌 隨機生成0-51的數字index。 cards[i]和cards[index]元素互換
        for(int i = 0; i < cards.length; i++) {
            int index = (int)(Math.random() * N);//生成0-51數字
            int temp = cards[i];
            cards[i] = cards[index];
            cards[index] = temp;
        }
        //洗牌後
        System.out.println("洗牌後 : ");
        for(int i = 0; i < cards.length; i++) {
            //System.out.print(cards[i]);
            System.out.printf("%s - %s", cardsColors[cards[i] / 13], cardsValues[cards[i] % 13]);
            //打印4組 1組13張所以 % 13 == 0
            if((i + 1) % 13 ==0) {
                System.out.println();
            }else{
                System.out.print(" \t ");
            }
        }
    }
}
