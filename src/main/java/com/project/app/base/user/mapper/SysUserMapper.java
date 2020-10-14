package com.project.app.base.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.project.app.base.user.domain.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dongliang.li@hand-china.com
 * @description SysUserMapper
 * @date 2020/6/28 0:47
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    /**
     * 获取所有用户
     * @return
     */
    List<SysUser> getAllUsers();
}
