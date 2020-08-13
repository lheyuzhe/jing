package com.czxy;

import java.util.HashSet;
import java.util.Random;

/**
 * Created by ASUS on 2020/7/9.
 */
public class liufeifei {
    public static void main(String[] args) {
        String[] huo={"","","","","兰陵王","隆(SNK)","呲铁","韩信"};
        String[] shan={"乌尔萨","阿轲","觜火猴","爱川罗武(死神)","奕星","黄盖","女娲","娄金狗"};
        String[] yin={"干将","佐井(火影)","莫邪","周瑜","张良","飞诞鸟","姜子牙","春丽(SNK)"};
        String[] lei={"大乔","扁鹊","董双成","孙膑","提亚戈斯","六车拳西(死神)","高渐离","奎木狼"};
        String[] feng={"妲己","陆逊","成吉思汗","手鞠(火影)","贝迪恩斯","虞姬","钦原","李元芳"};
        String[] lin={"孙尚香","御名方守矢(SNK)","马可波罗","翼火蛇","瑶","扎贡纳斯","明世隐","有昭田钵玄(死神)"};
        HashSet<Integer> integers = new HashSet<>();
        Random r = new Random();
        for (int j = 0; j <=100 ; j++) {
            int i = r.nextInt(11)+1;
            if (integers.size()<3){
                integers.add(i);
            }else {
                continue;
            }
        }
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
