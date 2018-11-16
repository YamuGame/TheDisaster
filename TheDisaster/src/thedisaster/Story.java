package thedisaster;

import java.util.Scanner;
import static thedisaster.TheDisaster.*;

/*
 * Story.java
 * ストーリーの内容がここにまとまっています。
 * @author プログラム:立野, ストーリー:山口
 */
public class Story {

    public static void Openning() {
        System.out.println(""
                + "※このゲームではフルスクリーンを推奨しています\n"
                + "※最大化、あるいはF11キーでフルスクリーンにすることで、よりゲームを楽しめます▼");
        scan.nextLine();

        System.out.print(""
                + "遠い昔、地球にとある災害が生まれた\n"
                + "その災害は人々に様々な災いをもたらした\n"
                + "人々は天使と協力をすること災害に立ち向かった\n"
                + "長い戦いの末、人間たちと天使は戦いに勝ち\n"
                + "災害は地下のダンジョンに封印されました。\n"
                + "そして長い年月が流れ…▼\n");
        scan.nextLine();

        System.out.println(""
                + "┌---------------------------------------------------------------------------------------------------------------------------┐\n"
                + "｜                                    ■■■■■■■■  ■            ■    ■■■■■■                                    ｜\n"
                + "｜                                          ■          ■            ■    ■                                              ｜\n"
                + "｜                                          ■          ■            ■    ■                                              ｜\n"
                + "｜                                          ■          ■            ■    ■                                              ｜\n"
                + "｜                                          ■          ■■■■■■■■    ■■■■■                                      ｜\n"
                + "｜                                          ■          ■            ■    ■                                              ｜\n"
                + "｜                                          ■          ■            ■    ■                                              ｜\n"
                + "｜                                          ■          ■            ■    ■                                              ｜\n"
                + "｜                                          ■          ■            ■    ■■■■■■                                    ｜\n"
                + "｜                                                                                                                          ｜\n"
                + "｜                                                  ■                                                                      ｜\n"
                + "｜■■■■■■        ■        ■■■■          ■■          ■■■■    ■■■■■■■■  ■■■■■■    ■■■■■    ｜\n"
                + "｜■        ■■      ■      ■      ■■        ■■        ■      ■■        ■          ■              ■      ■■  ｜\n"
                + "｜■          ■■    ■      ■                ■■  ■      ■                  ■          ■              ■        ■  ｜\n"
                + "｜■            ■    ■      ■■              ■    ■      ■■                ■          ■              ■      ■■  ｜\n"
                + "｜■            ■    ■          ■■■        ■    ■■        ■■■          ■          ■■■■■      ■■■■      ｜\n"
                + "｜■            ■    ■              ■■    ■■■■■■            ■■        ■          ■              ■    ■■    ｜\n"
                + "｜■          ■■    ■                ■    ■        ■              ■        ■          ■              ■      ■■  ｜\n"
                + "｜■        ■■      ■      ■        ■  ■■        ■■  ■        ■        ■          ■              ■        ■  ｜\n"
                + "｜■■■■■          ■        ■■■■    ■            ■    ■■■■          ■          ■■■■■■    ■        ■■｜\n"
                + "└---------------------------------------------------------------------------------------------------------------------------┘\n"
                + "\n");
        System.out.println("PRESS ENTER▼");
        scan.nextLine();
    }

    public static void Tutorial() {
        System.out.println("\n"
                + "ようやく目覚めたか、私は" + DisasterName + "…\n"
                + "この世界における貴様だ。▼");
        scan.nextLine();

        System.out.println(""
                + "私はかつてこの世界に災いをもたらしこのダンジョンに封印された存在らしい。\n"
                + "らしいというのは、現状私は名前を奪われてしまっている。▼");
        scan.nextLine();

        System.out.println(""
                + "災害や化け物にとって名前を奪われるということは存在そのものが不安定になってしまうということだ。\n"
                + "そこで私は私自身の存在を観測してくれる”決意”を持った存在を待ち続けていた。▼");
        scan.nextLine();

        System.out.println(""
                + "私がまた災害として存在する為にだ。\n"
                + "私は力があるが存在がない。貴様は決意ができるがこの世界では無力でしかない。▼");
        scan.nextLine();

        System.out.println(""
                + "またこのダンジョンでは私の復活を望まない奴らが私を狙ってきている。\n"
                + "このダンジョンで封印される寸前に目覚められたのは奇跡でしかないだろう。▼");
        scan.nextLine();

        System.out.println(""
                + "私が殺しこれから殺そうとする連中はただの人間だ。\n"
                + "私は殺せる。微塵の躊躇も無く、一片の後悔も無く鏖殺できる　この私は災害だから。▼");
        scan.nextLine();

        System.out.println(""
                + "行動は私が代わろう。戦闘も私が代わろう。五感に関しても私が伝えよう。\n"
                + "だが行動を決断するのはお前の”決意”だ。▼");
        scan.nextLine();

        System.out.println(""
                + "逃げたいならこの画面を消してこの世界から去ればいい！\n"
                + "さあどうする!!" + DisasterName + "よ！▼");
        scan.nextLine();

        System.out.println("……▼");
        scan.nextLine();

        System.out.println("……▼");
        scan.nextLine();

        System.out.println(""
                + "よく消さなかったな、それでいい。私たちで" + DisasterName + "だ。\n"
                + "さあ誰に命令されているかもわかっていない哀れな兵が来たぞ。▼");
        scan.nextLine();

        System.out.println("私たち…" + DisasterName + "の初陣だ。▼");
        scan.nextLine();
    }

    public static void TutorialBattleAfter() {
        System.out.println(""
                + "所詮人間なんてこんなものか。\n"
                + "こんな無謀な戦いに先陣を切らされるということは物好きか役立たずだろう。▼");
        scan.nextLine();

        System.out.println(""
                + "まあその人間に封印されかけていて1秒ごとに1ダメージを受けているというのが現状の私か…むなしいものだな。\n"
                + "次へ進もう。▼");
    }
    
    public static void choice1(){
    }
    public static void 810(){
    }
    public static void stage1(){
    }
    public static void stage1After(){
    }
    public static void stage2(){
    }
    public static void stage2After(){
    }
    public static void choice2{ 
    }
    public static void choice3(){
    }
    public static void stage3(){
    }
    public static void stage3After(){
    }
    public static void security(){
    }
   　public static void lastBattle(){
    }
    public static void lastBattleAfter(){
    }
    public static void epilogue(){
    }
    public static void Special victory(){
    }
}
