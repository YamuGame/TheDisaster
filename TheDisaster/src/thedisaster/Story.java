package thedisaster;

import static thedisaster.TheDisaster.*;

/*
 * Story.java
 * ストーリーの内容がここにまとまっています。
 * @author 山口
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
         System.out.println(""
                + "このダンジョンでは昔ながらのダンジョンみたいに\n"
                + "武器や回復アイテムが落ちているだろう▼");
        scan.nextLine();
        System.out.println(""
                + "本来はどちらもいただきたいが、封印があるため時間が惜しい片方だけを取ることにしよう。\n"
                + "どちらを選ぶのかは貴様にゆだねる。▼");
        scan.nextLine();
        System.out.println(""
                + "このダンジョンには他にも武器があるが持てるのは一つだけだ。\n"
                + "それまでに武器を持っていたら武器を取り換えた時点で捨ててしまう。▼");
        scan.nextLine();
        System.out.println(""
                + "今回の武器はナイフか。\n"
                + "さあナイフと回復アイテムどちらを選ぶ？▼");
        scan.nextLine();
    }
    public static void senpai(){
        System.out.println("……▼");
        scan.nextLine();
        
        System.out.println(""
                + "???「入って、どうぞ」\n"
                + "なんだこいつは…私を倒そうとしてるようには見えないが…、むしろ歓迎している…？▼");
        scan.nextLine();
        
        System.out.println(""
                + "???「アイスティーしかなかったんだけどいいかな？」\n"
                + "いや、私はいらない▼");
        scan.nextLine();
        
        System.out.println(""
                + "???「まずうちさぁ、武器・・・あんだけど・・・持ってかない？」\n"
                + "なんだこいつ、さっきから会話が繋がっている気がしない…。▼");
        scan.nextLine();
        
        System.out.println(""
                + "RPGのNPCと話している気分だ。\n"
                + "???「ホラ、見ろよ！見ろよ！ホラ」▼");
        scan.nextLine();
        
        System.out.println(""
                + "おもちゃのナイフがある\n"
                + "どうする？▼");
        scan.nextLine();
        
        System.out.println(""
                + "家を出た。\n"
                + "なんだったんだあいつは…?▼");
        scan.nextLine();
    }
    public static void stage1(){
        System.out.println(""
                + "エクスシア「どうやら抜け駆けは失敗したらしい。」\n"
                + "スローネ「嗚呼、どちらが先に封印するのか賭けていたのに。この場合どうするよ？」▼");
        scan.nextLine();
        System.out.println(""
                + "エクスシア「知ったことか。引き分けなんて考えてもいない。」\n"
                + "ほぅ、どうやら世界を救うメサイア様は自信に満ち溢れているな。▼");
        scan.nextLine();
        
        System.out.println(""
                + "いや、過信に溺れていると言うべきか？\n"
                + "エクスシア「それはお互い様だろう？」▼");
        scan.nextLine();
        
        System.out.println(""
                + "ほぅ？何故そう宣う？\n"
                + "エクスシア「お前は何分、いや何秒であいつらを殺った？４０か？２０か？」▼");
        scan.nextLine();
        
        System.out.println(""
                + "スローネ「あいつらを殺ることは蟻を殺すようだったろう？\n"
                + "容易であり造作もない行為だったろう？\n"
                + "そしてお前の前に立つ虫けらを同じように屠る気でいる。違うのか？」▼");
        scan.nextLine();
        
        System.out.println(""
                + "そうだと言ったら？\n"
                + "どうせ貴様らも同じ道を辿る。▼");
        scan.nextLine();
        
        System.out.println(""
                + "エクスシア「その発言が証拠だ。\n"
                + "生憎、おいそれと死んでしまってはあいつらに、大事な飲み仲間にヴァルハラで顔向けできない。」▼");
        scan.nextLine();
        System.out.println(""
                + "スローネ「お前の大切な時間をこの命の限り奪い、あいつらへの土産話としよう。\n"
                + "酒の肴にはもってこいだ。」▼");
        scan.nextLine();
        
        System.out.println(""
                + "エクスシア「掛け金の行方もその時話し合おうじゃないか。」\n"
                + "スローネ「賛成。」▼");
        scan.nextLine();
        
        System.out.println(""
                + "来るぞ。\n"
                + "構えろ!▼");
        scan.nextLine();
    }
    public static void stage1After(){
        System.out.println(""
                + "啖呵を切った割にはあっけないものだな。\n"
                + "もう終わりか？▼");
        scan.nextLine();
        
        System.out.println(""
                + "エクスシア「だとよ…どう思う？…」\n"
                + "スローネ「ハハ…こいつは向こうで笑い話にしかならないな…」▼");
        scan.nextLine();
        
        System.out.println(""
                + "エクスシア「まぁ…捨て駒なりに時間は稼げただろ？…」\n"
                + "スローネ「そうだな…こちとら団体戦だ…目の前の悪魔が此処で失った数秒に…後で泣いてくれることを祈るね…」▼");
        scan.nextLine();
        
        System.out.println(""
                + "エクスシア「ハッ…違ぇねぇ…」\n"
                + "次に行くぞ。▼");
        scan.nextLine();
        
        System.out.println(""
                + "そろそろ要領は掴んだだろう。\n"
                + "貴様のやることは何ら変わることはない。▼");
        scan.nextLine();
    }
    public static void stage2(){
        System.out.println(""
                + "マールート「キヒヒヒヒ！！崩ス者ノ登場サ！」\n"
                + "ハールート「やぁ、初めまして。災害。」▼");
        scan.nextLine();
        System.out.println(""
                + "初めまして、そしてさようなら。貴様らは私の前に立った。\n"
                + "それだけの理由で地獄に落ちる。▼");
        scan.nextLine();
        System.out.println(""
                + "マールート「堕チルヨ堕チル深淵ニ、\n"
                + "名前諸共忘レ去ラレル運命サ！」▼");
        scan.nextLine();

        System.out.println(""
                + "ハールート「そう殺戮に急がなくてもいいだろう？\n"
                + "そんなことは最早分かりきっているんだ。」▼");
        scan.nextLine();

        System.out.println(""
                + "そうであるなら一刻も早く物言わぬ屍になれ。\n"
                + "こうしている時間が惜しい。▼");
        scan.nextLine();
        
        System.out.println(""
                + "マールート「自ラ死ニ急グガ有象無象ノ救ワレル道？」\n"
                + "ハールート「此処で１秒でも時間を費やすことが我らの勝利に近づくんだ。\n"
                + "そう簡単には心臓を止めない。来るなら来いバケモノが。」▼");
        scan.nextLine();
        
        System.out.println(""
                + "さっさと終わらせるぞ。\n"
                + "先程の奴らと同じかそれ以下だ。▼");
        scan.nextLine();


    }
    public static void stage2After(){
        System.out.println(""
                + "マールート「キヒッ…遊ビハ終ワリ？」\n"
                + "ハールート「存外儚い人生だったな…」▼");
        scan.nextLine();
        System.out.println(""
                + "分かっただろう、貴様らが何人費やそうと結末は変わらないと\n"
                + "マールート「変ワラナイ…変ワラナイ……世界ガ辿ル結末ハ…」▼");
        scan.nextLine();
System.out.println(""
                + "ハールート「それでも俺らは突破口を探す…。\n"
                + "何百何千の仲間の屍を踏み超えて進む…。かつて神に挑んだ時のように…。」▼");
        scan.nextLine();
System.out.println(""
                + "マールート「穢キ王ガ…統ベル世界…。\n"
                + "オマエニ…ハ変エラレル……？」▼");
        scan.nextLine();
        
System.out.println(""
                + "ハールート「俺たちは…一度負け、神はこの世を統べた…。今回も屍となるとしよう…。\n"
                + "しかし、お前は…最後まで勝って…いられるのか？楽しみに…しているよ……。」▼");
        scan.nextLine();
System.out.println(""
                + "愚問だったな。私達"+ DisasterName +"には敵などいない。\n"
                + "先に進むぞ。▼");
        scan.nextLine();

    }
    public static void choice2(){ 
        System.out.println(""
                + "ここには敵がいないようだな…。\n"
                + "フライパンが落ちているな。▼");
        scan.nextLine();
System.out.println(""
                + "金属で作られている割には軽いな。\n"
                + "▼");
        scan.nextLine();
System.out.println(""
                + "武器ではないが、このフライパンで殴れば相応の痛みは与えられることができるだろう。\n"
                + "しかしフライパンか…。▼");
        scan.nextLine();
System.out.println(""
                + "回復アイテムも落ちているがどちらを取るか…。\n"
                + "こんな時こそお前の出番だ。▼");
        scan.nextLine();
System.out.println(""
                + "フライパンと回復アイテムどちらを選ぶ？\n"
                + ""+ DisasterName +"にとって大事だと思う方を選んで欲しい。▼");
        scan.nextLine();
System.out.println(""
                + "どちらを取るかを決めるのはお前だ。\n"
                + ""+ DisasterName +"はどちらを選ぶ？▼");
        scan.nextLine();
    }
    public static void choice3(){
     System.out.println(""
                + "これはマスケット銃か！\n"
                + "私がいた時代には無かった武器だ。▼");
        scan.nextLine();
System.out.println(""
                + "なんで知っているのか？だと？具体的な名前は忘れたが、\n"
                + "黄色いリボン使いの少女(?)が魔法でこれを出していただろう？▼");
        scan.nextLine();
System.out.println(""
                + "このマスケット銃があれば人間であっても猛獣を倒せるだろうな。\n"
                + "こんなのが量産されでもしたら神や天使も大騒ぎだろうな。▼");
        scan.nextLine();
System.out.println(""
                + "この武器相手ではせっかく召喚した幻獣なんぞすぐに殺されてしまうだろう。\n"
                + "いやはや恐ろしい時代になったものだ。▼");
        scan.nextLine();
   System.out.println(""
                + "このマスケット銃を拾うか？\n"
                + "回復アイテムもあるがどうする？▼");
        scan.nextLine();

        System.out.println(""
                + ""+ DisasterName +"にとって大事だと思う方を選んで欲しい。\n"
                + "どちらを取るかを決めるのはお前だ。▼");
        scan.nextLine();
    }
    public static void stage3(){
        System.out.println(""
                + "アストライアー「来たぞ。気合入れろよお前ら。」\n"
                + "ラジエル「ここが正念場ってくらい心得てますよ、頭。」▼");
        scan.nextLine();
System.out.println(""
                + "ヴァーチュース「そして残ったのが俺たちだけってことも。」\n"
                + "ガルム「昔を思い出しますよ、あの戦いを。」▼");
        scan.nextLine();
System.out.println(""
                + "ようやく終わりが見えてきたな\n"
                + "さしづめ貴様らを蹴散らせば外に出れるんだろう？▼");
        scan.nextLine();
System.out.println(""
                + "アストライアー「当たらずとも遠からず、俺らは最後の人類最後の砦ってところだ。\n"
                + "生まれ生まれ生まれ生まれて生の初めに暗く、死に死に死に、死んで死の終わりに冥し。");
        scan.nextLine();
System.out.println(""
                + "俺らはかつて神に挑み死に、お前に挑むためにここに立っている。\n"
                + "輪廻の理からは外れているのかもしれないが");
        scan.nextLine();
System.out.println(""
                + "どうやら俺たちは何のために生き\n"
                + "死ぬのかは決まっているようだ。」▼");
        scan.nextLine();
System.out.println(""
                + "御託はいい。貴様らは人間ですらない亡霊だ。\n"
                + "戦うことでしか意味を見出すことのできない");
        scan.nextLine();
System.out.println(""
                + "哀れな幻影(phantom)だ。\n"
                + "まやかしに過ぎない貴様らに何ができる？▼");
        scan.nextLine();
System.out.println(""
                + "アストライアー「できる？俺たちにとっては成否はただの副産物なんだよ。\n"
                + "大事なのは戦うことであり、それを楽しむことだ。");
        scan.nextLine();
System.out.println(""
                + "そうでもなけりゃ神にもお前にも挑むことなく\n"
                + "十字架を握ってガタガタ震えながらお祈りしてるだろうよ。」▼");
        scan.nextLine();
System.out.println(""
                + "そうかそうか\n"
                + "死に場所を求めるというのなら▼");
        scan.nextLine();
System.out.println(""
                + "安息を、休息を、平穏をくれてやろう。\n"
                + "ここで貴様らの一夜限りの夢を終わらせてやる。▼");
        scan.nextLine();
System.out.println(""
                + "アストライアー「夢ねぇ、そいつはいい例えだ。\n"
                + "どうか１秒でも長く見せてくれよ？災害さんよ。」▼");
        scan.nextLine();

    }
    public static void stage3After(){
        System.out.println(""
                + "部下は全員死んだぞ？\n"
                + "貴様はまだやれるのか？▼");
        scan.nextLine();
System.out.println(""
                + "アストライアー「そうしたいもんだが\n"
                + "生憎…身体が言うことを聞かねぇんだ…。負けだよ…負け。」▼");
        scan.nextLine();
System.out.println(""
                + "あれほどのことを言っていた割には潔いな。\n"
                + "あれは己を奮い立たせる嘘か？▼");
        scan.nextLine();
System.out.println(""
                + "アストライアー「いや…、本当のことさ。\n"
                + "俺たちは戦うことしかできないろくでなしだ。」▼");
        scan.nextLine();
System.out.println(""
                + "ただ…次の戦場は戦乙女(ヴァルキリー)サマのおかげで決まっていてね…\n"
                + "次は…そっちに身を投じるだけさ。」▼");
        scan.nextLine();
System.out.println(""
                + "戦乙女？天使や神の名前を持ち\n"
                + "そいつらに挑んだ貴様が何を言っている？▼");
        scan.nextLine();
System.out.println(""
                + "アストライアー「ハハハ、そう思うだろ？\n"
                + "神に、喧嘩を売って迎えられるなんておかしな話だよな…？");
        scan.nextLine();
System.out.println(""
                + "今度はあの世で傭兵をやるわけだ…。\n"
                + "まぁ、せいぜい…お前も楽しみな…。運命を……。」▼");
        scan.nextLine();
System.out.println(""
                + "行くぞ。\n"
                + "ここからが本番だ。▼");
        scan.nextLine();

    }
    public static void security(){
        System.out.println(""
                + "これはなんだ…?\n"
                + "私の知っている言語ではない…。▼");
        scan.nextLine();
System.out.println(""
                + "貴様ならわかるか？\n"
                + "私の体力も少なくなってきている。▼");
        scan.nextLine();
System.out.println(""
                + "なるべく早くこのセキュリティを突破して欲しい。\n"
                + "ここを突破すれば後は奴が言う戦乙女だけだろう。▼");
        scan.nextLine();
    }
    public static void lastBattle(){
        System.out.println(""
                + "戦乙女「ついに私のところまでたどり着いたか、"+ DisasterName +"\n"
                + "私はこのダンジョンで君を待っていた戦乙女のグリムゲルデという者だ。");
        scan.nextLine();
System.out.println(""
                + "とりあえずお茶でもどうだい？\n"
                + "ああそうか、君には時間がないんだったな");
        scan.nextLine();
System.out.println(""
                + "私の封印もそろそろ効いてくることだろう。\n"
                + "あの天使の名を持ったメサイア達はとても頑張ってくれたよ");
        scan.nextLine();
System.out.println(""
                + "死んでいったメサイア達も戦乙女が打倒した災害に殺された\n"
                + "とあればヴァルハラに連れて行くにはいい理由になる。▼");
        scan.nextLine();
System.out.println(""
                + "私はここで時間を稼げば勝ち。君は私を倒さなくては負け。\n"
                + "せいぜい足掻いてくれ。」▼");
        scan.nextLine();
System.out.println(""
                + "不思議な光が部屋を満たす。\n"
                + "黄昏がダンジョンの出口から照らしている。▼");
        scan.nextLine();
System.out.println(""
                + "我々の冒険はついに終わるようだ。\n"
                + "グリムゲルデ「"+ DisasterName +"、きみに会えて本当によかった。」▼");
        scan.nextLine();
System.out.println(""
                + "戦乙女は二本の剣を構えた。\n"
                + "刀身が黄昏の光をたたえている。▼");
        scan.nextLine();
System.out.println(""
                + "グリムゲルデ「さようなら」\n"
                + "これが最後の戦いだ▼");
        scan.nextLine();

    }
    public static void lastBattleAfter(){
        System.out.println(""
                + "折れた刀身は決闘前の光を失っていた。\n"
                + "グリムゲルデ「私の負けだな…");
        scan.nextLine();
System.out.println(""
                + "まあいい、目的は達成できた。\n"
                + ""+ DisasterName +"、きみはここから外に出るがいい▼");
        scan.nextLine();
System.out.println(""
                + "しかしここは君のいた時代も場所も違う\n"
                + "君に耐えられるかな？▼");
        scan.nextLine();

    }
    public static void epilogue(){
        System.out.println(""
                + "貴様は私をこのダンジョンから出すという決意をしてくれた。\n"
                + "私だけでは目覚めることすらできず封印されていただろう。▼");
        scan.nextLine();
System.out.println(""
                + "とりあえず、このダンジョンからは出れたのだ。\n"
                + "この世界は広い、貴様がいなくても▼");
        scan.nextLine();
System.out.println(""
                + "私を観測してくれるものは他にもいるだろう。\n"
                + "ありがとう。▼");
        scan.nextLine();
System.out.println(""
                + "\n"
                + "制作スタッフ▼");
        scan.nextLine();
System.out.println(""
                + "C0116127 佐藤瑠星\n"
                + "C0116168 立野和紀▼");
        scan.nextLine();
System.out.println(""
                + "C0116272 山口雄也\n"
                + "C0116334 ザイダトゥル アクマル▼");
        scan.nextLine();
System.out.println(""
                + "\n"
                + "▼");
        scan.nextLine();
System.out.println(""
                + "\n"
                + "(メッセージを受信しました。)▼");
        scan.nextLine();
System.out.println(""
                + "私だ。\n"
                + "あの後私は世界を混沌に陥れようとした...。▼");
        scan.nextLine();
System.out.println(""
                + "最初の方は上手くいっていた。\n"
                + "かつて貴様と同一存在だった時の名前を捨て▼");
        scan.nextLine();
System.out.println(""
                + "新たに『Star Dies』と名前も付けられた。\n"
                + "目標である世界の混沌を超えた▼");
        scan.nextLine();
System.out.println(""
                + "星の死という意味の素晴らしい名前だ。\n"
                + "しかし私のことが知られるたびに私を知った者が死んでいってしまう。▼");
        scan.nextLine();
System.out.println(""
                + "ある者は私を倒そうと、\n"
                + "ある者は私に殺されるなら自らの手で…▼");
        scan.nextLine();
System.out.println(""
                + "と私を知るものが次々消えていってしまう。\n"
                + "まるで私に付けられた名前を遂行するかのように…▼");
        scan.nextLine();
System.out.println(""
                + "ウイルスだって感染者が他人に感染させる前に\n"
                + "死んでしまっては次の存在を残せない。▼");
        scan.nextLine();
System.out.println(""
                + "災害の私も語り継ぐ者がいなければ滅んでしまう存在だ。\n"
                + "　　　                                     ▼");
        scan.nextLine();
System.out.println(""
                + "果たして人間は私にとって倒すべき存在だったのだろうか？\n"
                + "こう貴様に対してメッセージを書いているうちに思い出したのだが▼");
        scan.nextLine();
System.out.println(""
                + "あのダンジョンにはおもちゃのナイフや\n"
                + "魔法のフライパンなどの武器とは思えないものもあった。▼");
        scan.nextLine();
System.out.println(""
                + "もしやり直せるなら彼らを傷つけないようにそういう\n"
                + "武器に変えて彼らを死なせないようにできないだろうか….▼");
        scan.nextLine();
System.out.println(""
                + "\n"
                + "(メッセージは以上です。)▼");
        scan.nextLine();

    }
    public static void specialVictory(){
        System.out.println(""
                + "それが貴様の選択か…ならば受け入れよう。\n"
                + "それが"+ DisasterName +"としての決断だ…。▼");
        scan.nextLine();
System.out.println(""
                + "グリムゲルデ「なんてことをしてくれたんだ。\n"
                + "人間にも倒されず、");
        scan.nextLine();
System.out.println(""
                + "封印もされず、\n"
                + "私にも倒されない災害なんて語り継がれないじゃないか…。");
        scan.nextLine();
System.out.println(""
                + "自害する災害なんてありえない。\n"
                + ""+ DisasterName +"は絶対悪として語り継がねばならないのに…。");
        scan.nextLine();
System.out.println(""
                + "ヴァルハラに送るには絶対悪と対峙した者でなければらない。\n"
                + "これでは死んでいった兵が正義か悪かわからなくなってしまう。");
        scan.nextLine();
System.out.println(""
                + "奴をダンジョンで封印するという行為が無駄じゃないか…。\n"
                + "誰の入れ知恵だ…?");
        scan.nextLine();
System.out.println(""
                + "まさかこのダンジョンに発生した新たな災害がいるというのか…?\n"
                + "神話にすら載っていない災害なんてどう対処すれば…。");
        scan.nextLine();
System.out.println(""
                + "私を欺くなんて、許せない、\n"
                + "私に倒されろ！");
        scan.nextLine();
System.out.println(""
                + "私に封印されろ！\n"
                + "倒され封印され倒され封印され");
        scan.nextLine();
System.out.println(""
                + "私を英雄にさせろ！"+ DisasterName +"！」▼\n"
                + "                                 ");
        scan.nextLine();

    }
}
