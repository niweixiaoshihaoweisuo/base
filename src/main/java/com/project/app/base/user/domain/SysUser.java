package com.project.app.base.user.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.project.app.base.core.domain.baseDomain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dongliang.li@hand-china.com
 * @description SysUser
 * @date 2020/6/27 16:35
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "sys_user")
public class SysUser extends baseDomain {

    @TableField(value = "user_code")
    private String userCode;

    @TableField(value = "user_name")
    private String userName;

    @TableField(value = "password")
    private String password;

    @TableField(value = "description")
    private String description;

    @TableField(value = "email")
    private String email;

    @TableField(value = "mobile")
    private String mobile;

    @TableField(value = "frozen_flag")
    private String frozenFlag;
}
