package com.wqq.spring;

import java.util.ArrayList;
import java.util.List;

public class Lottery {
    public static void main(String[] args) {

        List<LotteryModel> initDrawList = new ArrayList<LotteryModel>() {

            {
//                add(new LotteryModel(1, 1, "12341"));
//                add(new LotteryModel(2, 3, "12342"));
//                add(new LotteryModel(3, 35, "12343"));
                add(new LotteryModel(4, 33.3, "12344"));
                add(new LotteryModel(5, 10, "12345"));
                add(new LotteryModel(6, 20, "12346"));
            }
        };
//        System.out.println(list.size());
//        System.out.println(list.get(0));
//
//
       System.out.println(generateAward());
    }
    private final static List<LotteryModel> initDrawList = new ArrayList<LotteryModel>() {

        {
     add(new LotteryModel(1,  1,"12341"));
        add(new LotteryModel(2,  3,"12342"));
      add(new LotteryModel(3,  30,"12343"));
        add(new LotteryModel(4,  90,"12344"));
        add(new LotteryModel(5,  1,"12345"));
        add(new LotteryModel(6,  33.3,"12346"));
      }

    };
    public static LotteryModel generateAward() {
                 List<LotteryModel> initData = initDrawList;
               long result = randomnum(1, 100);
                double line = 0;
                 double temp = 0;
               LotteryModel returnobj = null;
                 int index = 0;
                for (int i = 0; i < initDrawList.size(); i++) {
                    LotteryModel obj2 = initDrawList.get(i);
                         double c = obj2.getRatio();
                         temp = temp + c;
                         line = 100 - temp;
                         if (c != 0) {
                                 if (result > line && result <= (line + c)) {
                                         returnobj = obj2;
                                         break;
                                     }
                             }
                     }
                return returnobj;
            }

    private static long randomnum(int smin, int smax){
                    int range = smax - smin;
                    double rand = Math.random();
                    return (smin + Math.round(rand * range));
    }

    //private  List<LotteryModel>

}
