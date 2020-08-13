package com.czxy;

import java.util.Random;

/**
 * Created by ASUS on 2020/6/23.
 */
public class add5 {
    public static void main(String[] args) {
//        //最强法师
//        String[] str={"李世民","雅典娜","托鲁克","沙悟净","秦琼","小白龙","东皇太一","钟无艳","孙权","凤桥楼十郎(死神)","云中君","参水猿","毕月乌"};
        //最强辅助
        String[] str={"墨子","弗雷尔","我爱罗(火影)","程咬金","太乙真人","白(火影)","上官婉儿"};
//        //最强射手
//        String[] str={"马超","草薙京(SNK)","老夫子","唐三藏","诸葛亮","罗成","白起","猪八戒","张飞","角都(火影)","甘宁"};
//        //最强坦克
//        String[] str={"狄仁杰","钟馗","西施","关羽","浮竹十四郎(死神)","武则天","项羽","凯(火影)",,"皮特萨拉罗","庄周","廉颇"};
//        //最强战士
//        String[] str={"杨戬","嬴政","刘备","孙悟空","八神庵(SNK)","乌尔奇奥拉(死神)","后裔","小龙女","商羊","吕蒙"};
        Random r=new Random();
        int s =r.nextInt(str.length);
        System.out.println(str[s]);
    }
}
