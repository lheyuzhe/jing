package com.czxy;

import java.util.Random;

/**
 * Created by ASUS on 2020/5/7.
 */
public class add {
    public static void main(String[] args) {
//        //职业
//        String[] str={"射手","法师","战士","刺客","辅助","坦克","射手/法师","射手/战士","射手/战士","射手/刺客","射手/辅助","射手/坦克","法师/射手","法师/战士","法师/刺客","法师/辅助",
//                      "法师/坦克", "战士/射手","战士/法师","战士/刺客","战士/辅助","战士/坦克","刺客/射手","刺客/法师","刺客/战士","刺客/辅助","刺客/坦克","辅助/射手","辅助/法师",
//                      "辅助/战士","辅助/刺客","辅助/坦克","坦克/射手","坦克/法师","坦克/战士","坦克/刺客","坦克/辅助"};
//        //金币
//        String[] str={"13888金币","13888金币","18888金币","13888金币","13888金币"};
//        //限定皮肤
//        String[] str={"光辉降世【0周年限定】——雅典娜","虎啸天威【元旦限定】——雅典娜","尖牙厉爪【虎年限定】——白起","虎圣助威【虎年限定】——刘备","圣殿情劫【情人节限定】——雅典娜","虎虎生威【虎年限定】——孙悟空",
//                      "青春的香气【女神节限定】——雅典娜","三分天下【内测限定】——刘备","权分天下【内测限定】——武则天","天国领地【内测限定】——雅典娜","爱神之翼【情人节限定】——凡尔斯","爱·河【情人节限定】——沙悟净",
//                      "三生有幸【情人节限定】——诸葛亮","伴你一生【情人节限定】——张飞","鬼夜诞铃【圣诞节限定】——狄仁杰","天庭化兔【元旦限定】——哪吒","古有丈八【1周年限定】——张飞","守株待兔【兔年限定】——草薙京(SNK)",
//                      "兔死狐悲【兔年限定】——西施","狡兔三窟【兔年限定】——托鲁克","情有所钟【情人节限定】——嫦娥","砂之心【情人节限定】——我爱罗(火影)","见兔顾犬【兔年限定】——八神庵(SNK)","兔死狗烹【兔年限定】——狄仁杰",
//                      "青春法则制【女神节限定】——武则天","风雅之情【情人节限定】——马超","心里有物【情人节限定】——角都(火影)","风情电【情人节限定】——蓝染(死神)","无情圣者【情人节限定】——老夫子"};
//        //钻石夺宝勇者守护皮肤
//        String[] str={"地狱·灼烧【勇者】——八神庵(SNK)","东方不败【勇者】——武则天","混元黑刃【勇者】——白起","飞·刃【勇者】——凡尔斯","锏·破【勇者】——秦琼","紫色火焰【勇者】——八神庵(SNK)","月光·流离【勇者】——嫦娥",
//                      "佛道·循环【勇者】——唐三藏","劈天盖地【勇者】——程咬金","化令【勇者】——狄仁杰","大唐门神【勇者】——秦琼","圆月·明轮【勇者】——嫦娥","风之铃【勇者】——西施","天令【勇者】——狄仁杰",
//                      "圣殿护卫【勇者】——雅典娜","风火轮【勇者】——哪吒","利刃之翼【勇者】——凡尔斯","教化无常【勇者】——老夫子","枪沙之战【勇者】——罗成","猛焰燃烧【勇者】——草薙京(SNK)","长坂坡之战【勇者】——张飞",
//                      "机·术【勇者】——墨子","体忍·术【勇者】——凯(火影)","烈拳【勇者】——草薙京(SNK)","天罚之手【勇者】——墨子","威严所在【勇者】——老夫子","疾空征途【勇者】——弗雷尔","裂空风暴【勇者】——托鲁克",
//                      "至臻之剑【勇者】——小龙女","烈日神弓【勇者】——后裔","蓝电剑舞【勇者】——蓝染(死神)","体道六门【勇者】——凯(火影)","海上幻舞【勇者】——西施","美艳动人【勇者】——小龙女","灼矢之箭【勇者】——后裔",
//                      "龙汉之行【勇者】——刘备","烈日之枪【勇者】——杨戬","秀里带花【勇者】——花木兰","天·烈·法【勇者】——钟无艳","肉弹弹珠【勇者】——猪八戒","天地之气【勇者】——项羽","天辅之龙【勇者】——刘备",
//                      "举鼎之力【勇者】——项羽","幻舞飞天【勇者】——商羊","三眼战士【勇者】——杨戬","单骑救主【勇者】——赵云","财大气粗【勇者】——猪八戒","火目之金【勇者】——太乙真人","初临·石【勇者】——孙悟空",
//                      "炼水杖【勇者】——沙悟净","真龙之光【勇者】——李世民","天水之影【勇者】——甘宁"};
        //点券夺宝史诗守护皮肤
        String[] str={"凌烟之臣【史诗】——秦琼","隋唐之战【史诗】——李世民","极限羽翼【史诗】——凡尔斯","鬼影之镰【史诗】——乌尔奇奥拉(死神)","钺影重重【史诗】——武则天","宛如射日【史诗】——后裔",
                      "紫烈格斗术【史诗】——八神庵(SNK)","清婉止戈【史诗】——李白","枪出如龙【史诗】——赵云","逮捕法则【史诗】——狄仁杰","电光·岚切【史诗】——蓝染(死神)","大闹东海【史诗】——哪吒",
                      "弄巧成械【史诗】——鲁班大师","怒斩六将【史诗】——关羽","万物之眼【史诗】——东皇太一","鬼血之月【史诗】——芈月","剑无道【史诗】——浮竹十四郎(死神)","天琴之音【史诗】——杨玉环",
                      "七仙女·红【史诗】——黄月英","七仙女·橙【史诗】——皮特萨拉罗","七仙女·黄【史诗】——嫦娥","七仙女·绿【史诗】——小龙女","七仙女·青【史诗】——西施","七仙女·蓝【史诗】——钟无艳",
                      "地狱岩拳【史诗】——廉颇","七仙女·紫【史诗】——武则天","护子之翼【史诗】——皮特萨拉罗","葫芦娃·红【史诗】——小白龙","葫芦娃·橙【史诗】——李世民","葫芦娃·黄【史诗】——刘邦",
                      "葫芦娃·绿【史诗】——张飞","影子主君【史诗】——刘邦","葫芦娃·青【史诗】——秦琼","炼妖传说【史诗】——太乙真人","葫芦娃·蓝【史诗】——钟馗","葫芦娃·紫【史诗】——浮竹十四郎(死神)",
                      "千妖王【史诗】——伊格尼斯【SNK】"};
        Random r=new Random();
        int s =r.nextInt(str.length);
        System.out.println(str[s]);
    }
}
