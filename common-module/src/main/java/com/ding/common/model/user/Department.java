package com.ding.common.model.user;

import com.ding.common.model.BaseModel;
import lombok.Data;

/**
 * @program: manager
 * @description: 部门实体类
 * @author: DingCong
 * @create: 2018-11-29 19:59
 **/
@Data
public class Department extends BaseModel {

    private static final long serialVersionUID = 1L;

    /** 部门ID */
    private Long deptId;

    /** 父部门ID */
    private Long parentId;

    /** 祖级列表 */
    private String ancestors;

    /** 部门名称 */
    private String deptName;

    /** 显示顺序 */
    private String orderNum;

    /** 负责人 */
    private String leader;

    /** 联系电话 */
    private String phone;

    /** 邮箱 */
    private String email;

    /** 部门状态:0正常,1停用 */
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 父部门名称 */
    private String parentName;
}