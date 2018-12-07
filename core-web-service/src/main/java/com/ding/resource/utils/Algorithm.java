package com.ding.resource.utils;

/**
 * @program: manager
 * @description: 算法工具类
 * @author: DingCong
 * @create: 2018-12-07 17:01
 **/
public class Algorithm {

    /**
     * 递归计算斐波那契数列
     * @param month
     * @return
     */
    public static Long getSeriesNum(int month){

        //step1.判断输入数是否合法
        if (month < 0){
            return -1L ;
        }

        //step2.如果输入为0
        else if (month == 0){
            return 0L ;
        }

        //step3.如果输入为1或2
        else if (month == 1 || month == 2){
            return 1L ;
        }

        //step4.其他情况按正常处理
        else{
            return getSeriesNum(month - 1) + getSeriesNum(month - 2);
        }
    }

    /**
     * 普通获取斐波那契数列
     * @param month 1 1 2 3 5 8 13 21
     * @return
     */
    public static Long getFibSeries(int month){

        long m1 = 1L ,m2 = 1L ;
        long m ;

        for (int i = 3 ; i < month ; i++){
            m = m2 ;
            m2 = m1 + m2 ;
            m1 = m ;
        }
        return m2;
    }



    public static void main(String[] args) {
        Long seriesNum = getSeriesNum(8);
        System.out.println(seriesNum);
        Long fibSeries = getFibSeries(3);
        System.out.println(fibSeries);
    }
}
