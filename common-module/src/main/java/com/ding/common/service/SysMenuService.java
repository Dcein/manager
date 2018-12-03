package com.ding.common.service;

import com.ding.common.dao.SysMenuMapper;
import com.ding.common.entity.SysMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: dingcongcong
 * @Date: 2018/12/3 20:38
 * @Description: SysMenuService
 */
@Service
public class SysMenuService {

    @Autowired
    private SysMenuMapper sysMenuMapper;

    public List<SysMenu> getAllMenu(){
        List<SysMenu> sysMenus = sysMenuMapper.selectAll();
        return sysMenus;
    }


}
