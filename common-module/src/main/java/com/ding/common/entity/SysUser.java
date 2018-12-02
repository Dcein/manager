package com.ding.common.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user")
public class SysUser implements Serializable {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "ID")
    private Integer id;

    /**
     * 部门ID
     */
    @Column(name = "DEPT_ID")
    private Integer deptId;

    /**
     * 登录账号
     */
    @Column(name = "ACCOUNT")
    private String account;

    /**
     * 用户昵称
     */
    @Column(name = "NICKNAME")
    private String nickname;

    /**
     * 用户类型（00系统用户）
     */
    @Column(name = "USER_TYPE")
    private String userType;

    /**
     * 用户邮箱
     */
    @Column(name = "USER_EMAIL")
    private String userEmail;

    /**
     * 手机号码
     */
    @Column(name = "USER_PHONE")
    private String userPhone;

    /**
     * 用户性别（0男 1女 2未知）
     */
    @Column(name = "USER_SEX")
    private String userSex;

    /**
     * 密码
     */
    @Column(name = "USER_PASSWORD")
    private String userPassword;

    /**
     * 帐号状态（0正常 1停用）
     */
    @Column(name = "USER_STATUS")
    private String userStatus;

    /**
     * 删除标志（0代表存在 2代表删除）
     */
    @Column(name = "USER_FLAG")
    private String userFlag;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 创建者
     */
    @Column(name = "CREATE_BY")
    private String createBy;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 更新者
     */
    @Column(name = "UPDATE_BY")
    private String updateBy;

    /**
     * 更新时间
     */
    @Column(name = "UODATE_TIME")
    private Date uodateTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户ID
     *
     * @return ID - 用户ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户ID
     *
     * @param id 用户ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取部门ID
     *
     * @return DEPT_ID - 部门ID
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * 设置部门ID
     *
     * @param deptId 部门ID
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * 获取登录账号
     *
     * @return ACCOUNT - 登录账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置登录账号
     *
     * @param account 登录账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取用户昵称
     *
     * @return NICKNAME - 用户昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置用户昵称
     *
     * @param nickname 用户昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取用户类型（00系统用户）
     *
     * @return USER_TYPE - 用户类型（00系统用户）
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设置用户类型（00系统用户）
     *
     * @param userType 用户类型（00系统用户）
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * 获取用户邮箱
     *
     * @return USER_EMAIL - 用户邮箱
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 设置用户邮箱
     *
     * @param userEmail 用户邮箱
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 获取手机号码
     *
     * @return USER_PHONE - 手机号码
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 设置手机号码
     *
     * @param userPhone 手机号码
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * 获取用户性别（0男 1女 2未知）
     *
     * @return USER_SEX - 用户性别（0男 1女 2未知）
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * 设置用户性别（0男 1女 2未知）
     *
     * @param userSex 用户性别（0男 1女 2未知）
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    /**
     * 获取密码
     *
     * @return USER_PASSWORD - 密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置密码
     *
     * @param userPassword 密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 获取帐号状态（0正常 1停用）
     *
     * @return USER_STATUS - 帐号状态（0正常 1停用）
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * 设置帐号状态（0正常 1停用）
     *
     * @param userStatus 帐号状态（0正常 1停用）
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * 获取删除标志（0代表存在 2代表删除）
     *
     * @return USER_FLAG - 删除标志（0代表存在 2代表删除）
     */
    public String getUserFlag() {
        return userFlag;
    }

    /**
     * 设置删除标志（0代表存在 2代表删除）
     *
     * @param userFlag 删除标志（0代表存在 2代表删除）
     */
    public void setUserFlag(String userFlag) {
        this.userFlag = userFlag;
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取创建者
     *
     * @return CREATE_BY - 创建者
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建者
     *
     * @param createBy 创建者
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新者
     *
     * @return UPDATE_BY - 更新者
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新者
     *
     * @param updateBy 更新者
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取更新时间
     *
     * @return UODATE_TIME - 更新时间
     */
    public Date getUodateTime() {
        return uodateTime;
    }

    /**
     * 设置更新时间
     *
     * @param uodateTime 更新时间
     */
    public void setUodateTime(Date uodateTime) {
        this.uodateTime = uodateTime;
    }
}