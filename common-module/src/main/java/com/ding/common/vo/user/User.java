package com.ding.common.vo.user;

import lombok.Data;
import java.util.Date;

/**
 * @Auther: dingcongcong
 * @Date: 2018/12/9 13:38
 * @Description: User
 */
@Data
public class User {

    /**
     * 用户ID
     */
    private Integer id;

    /**
     * 部门ID
     */
    private Integer deptId;

    /**
     * 登录账号
     */
    private String account;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户类型（00系统用户）
     */
    private String userType;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 手机号码
     */
    private String userPhone;

    /**
     * 用户性别（0男 1女 2未知）
     */
    private String userSex;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 帐号状态（0正常 1停用）
     */
    private String userStatus;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    private String userFlag;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date uodateTime;
}
