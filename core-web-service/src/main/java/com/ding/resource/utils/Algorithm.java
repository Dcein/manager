package com.ding.resource.utils;

import com.ding.common.vo.user.User;

import java.util.Arrays;

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

    /**
     * 冒泡排序
     * @param array
     * @return
     */
    public static void bubbleSort(int[] array){

        //step1.计算出数组的长度
        int length = array.length;

        //step2.用于存储暂时最大变量
        int max;

        //step3.开始进行分趟排序(外层循环控制趟数,内层控制比较轮数)
        System.out.println("开始冒泡排序,原始数组:"+Arrays.toString(array));
        for(int i=0; i<length-1; i++){
            for (int j=0; j<length-1-i; j++){

                //step3.1.比较找出最大值
                if (array[j] > array[j+1]){
                    max = array[j];
                    array[j] = array[j+1];
                    array[j+1] = max;
                }

                System.out.println("第"+(i+1)+"趟,第"+(j+1)+"轮排序:"+Arrays.toString(array));
            }
            System.out.println("**第"+(i+1)+"轮排序完成**:"+Arrays.toString(array));
        }
    }

    /**
     * <h2>选择排序</h2>
     * <P>依次找出最小的元素放在第一位</P>
     * <p>选择排序（Selection sort）是一种简单直观的排序算法。
     * 它的工作原理是每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，
     * 然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
     * 以此类推，直到全部待排序的数据元素排完。 选择排序是不稳定的排序方法。
     * </p>
     * @param array
     */
    public static void selectSort(int[] array){

        //用于存放最小的值(或最大)
        int min;

        //遍历当前数组,找出最小的值
        for (int i=0; i<array.length; i++){
            for (int j=i; j<array.length; j++){

            }
        }
    }




    public static void main(String[] args) {
        /*Long seriesNum = getSeriesNum(8);
        System.out.println(seriesNum);
        Long fibSeries = getFibSeries(3);
        System.out.println(fibSeries);*/
        int[] i = {23,12,1,12,24,6};
        bubbleSort(i);

        User u = new User();
        System.out.println(u.toString());

        String s1 = "nadkhakdhk";
        System.out.println(s1);


    }
}
