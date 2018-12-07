package com.ding.system.utils;

import com.ding.common.dao.SysUserMapper;
import com.ding.common.spring.SpringContext;

/**
 * @program: manager
 * @description: Excel表格工具类
 * @author: DingCong
 * @create: 2018-12-07 09:31
 **/
public class ExcelUtil {


    public static void exportExcel(){

        SysUserMapper bean = (SysUserMapper)SpringContext.getBean("SysUserMapper");

    }

    public static void main(String[] args) {
        SysUserMapper bean = (SysUserMapper)SpringContext.getBean("SysUserMapper");
        System.out.println(bean);
    }
}
