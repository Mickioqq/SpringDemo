package com.wqq.spring;


import java.text.SimpleDateFormat;
import java.util.*;


public class StreamTest {
    public static void main(String[] args) {

        List<SpeedDto> dtos = new ArrayList<>();
        SpeedDto dto = new SpeedDto();

        dto.setNum(10);
        dto.setSpeed(1);
        dto.setId("12");
        SpeedDto dto1 = new SpeedDto();

        dto.setNum(20);
        dto.setSpeed(2);
        dto.setId("34");
        SpeedDto dto2 = new SpeedDto();

        dto.setNum(10);
        dto.setSpeed(1);
        dto.setId("56");
        SpeedDto dto3 = new SpeedDto();

        dto.setNum(30);
        dto.setSpeed(3);
        dto.setId("78");

        dtos.add(dto);
        dtos.add(dto1);
        dtos.add(dto2);
        dtos.add(dto3);
        //String result=dtos.stream().map(m->m.getId()).collect(Collectors.joining(","));

//
//        long s= System.currentTimeMillis();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = new Date(s);
//
//        System.out.println(simpleDateFormat.format(date));


        Date today = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(today);
        c.add(Calendar.DAY_OF_MONTH, 1);// 今天+1天

        System.out.println(c.getInstance().getTimeInMillis());

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<String> userList = new ArrayList<String>();


        for (int m = 0; m < list.size() - 1; m++) {
            for (int n = m + 1; n < list.size(); n++) {
                userList.add(list.get(m) + "_" + list.get(n));
            }
        }



        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:dd");
        long nd = 1000 * 24 * 60 * 60;// 一天的毫秒数
        long nh = 1000 * 60 * 60;// 一小时的毫秒数
        long nm = 1000 * 60;// 一分钟的毫秒数
        long ns = 1000;// 一秒钟的毫秒数
        long diff;
        long day = 0;
        long hour = 0;
        try{
            String time1 = "2018-12-12 13:01:01";

            String time2 = "2018-12-12 16:34:02";

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            Date date1 = sdf.parse(time1);

            Date date2 = sdf.parse(time2);

            diff = date2.getTime()-date1.getTime();
            day = diff / nd;// 计算差多少天
            hour = diff % nd / nh;
            long min = diff % nd % nh / nm;
            System.out.println("day:"+ (day)+"hour:"+hour+"minute:"+min);

        }catch (Exception ex){


        }




    }
}
