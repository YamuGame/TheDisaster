/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thedisaster;

import java.util.Random;
import static thedisaster.TheDisaster.*;

/**
 *
 * @author C0116168
 */
public class EasyMass {

    public static void easyMass() {
        System.out.println(""
                + "※簡単な数学の問題が5問表示されます\n"
                + "※半角数字で回答を入力してください▼");
        scan.nextLine();

        System.out.println(""
                + "※回答を間違えると体力が減少します\n"
                + "※正解するまで問題が変わることはありません▼");
        scan.nextLine();

        System.out.println("START▼");

        Random rand = new Random();//ランダムメソッド
        int[] num = new int[2];//ランダム値保存用
        int ans = 0;//答え保存用
        int sisoku = 0;//四則種類選択用
        String question = null;//問題内容保存用
        char loop = 0;//繰り返し回数保存用
        do {//do/while文で5問繰り返す
            for (int i = 0; i < 2; i++) {//２つの数値を保存
                int q = rand.nextInt(13);
                num[i] = q;
            }
            sisoku = rand.nextInt(3);//ランダムに＋ー×を選択
            switch (sisoku) {
                case 0:
                    ans = num[0] + num[1];
                    question = "+";
                    break;
                case 1:
                    ans = num[0] - num[1];
                    question = "-";
                    break;
                case 2:
                    ans = num[0] * num[1];
                    question = "×";
                    break;
            }
            question = "[第" + String.valueOf(loop + 1) + "問]" + String.valueOf(num[0]) + question + String.valueOf(num[1]) + "=";
            System.out.println(question);
            boolean correct = true;
            while (correct) {
                try {
                    String str = scan.nextLine();
                    if (str.equals(String.valueOf(ans))) {
                        System.out.println("正解");
                        correct = false;
                    } else {
                        System.out.println("不正解");
                        Disaster.SetHP(-100);
                    }
                } catch (Exception e) {
                }
            }
            loop++;
        } while (loop < 5);
        System.out.println("セキュリティーチェック完了");
        System.out.println("HP : " + Disaster.getHP());
    }
    
        public static void hardMass() {
        System.out.println(""
                + "※簡単な数学の問題が5問表示されます\n"
                + "※半角数字で回答を入力してください▼");
        scan.nextLine();

        System.out.println(""
                + "※回答を間違えると体力が減少します\n"
                + "※正解するまで問題が変わることはありません▼");
        scan.nextLine();

        System.out.println("START▼");

        Random rand = new Random();//ランダムメソッド
        int[] num = new int[2];//ランダム値保存用
        int ans = 0;//答え保存用
        int sisoku = 0;//四則種類選択用
        String question = null;//問題内容保存用
        char loop = 0;//繰り返し回数保存用
        do {//do/while文で5問繰り返す
            for (int i = 0; i < 2; i++) {//２つの数値を保存
                int q = rand.nextInt(114514810) + 1141454;
                num[i] = q;
            }
            sisoku = rand.nextInt(3);//ランダムに＋ー×を選択
            switch (sisoku) {
                case 0:
                    ans = num[0] + num[1];
                    question = "+";
                    break;
                case 1:
                    ans = num[0] - num[1];
                    question = "-";
                    break;
                case 2:
                    ans = num[0] * num[1];
                    question = "×";
                    break;
            }
            question = "[第" + String.valueOf(loop + 1) + "問]" + String.valueOf(num[0]) + question + String.valueOf(num[1]) + "=";
            System.out.println(question);
            boolean correct = true;
            while (correct) {
                try {
                    String str = scan.nextLine();
                    if (str.equals(String.valueOf(ans))) {
                        System.out.println("正解");
                        correct = false;
                    } else {
                        System.out.println("不正解");
                        Disaster.SetHP(-100);
                    }
                } catch (Exception e) {
                }
            }
            loop++;
        } while (loop < 10);
        System.out.println("セキュリティーチェック完了");
        System.out.println("HP : " + Disaster.getHP());
    }
}
