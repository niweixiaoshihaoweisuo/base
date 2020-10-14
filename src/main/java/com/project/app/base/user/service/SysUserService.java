package com.project.app.base.user.service;

import com.project.app.base.core.service.BaseService;
import com.project.app.base.user.domain.SysUser;
import com.project.app.base.user.mapper.SysUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dongliang.li@hand-china.com
 * @description SysUserService
 * @date 2020/6/28 0:00
 */
@Service
@Slf4j
public class SysUserService extends BaseService<SysUserMapper,SysUser> {

    public List<SysUser> getAllUser(){
        return baseMapper.getAllUsers();
    }

    public SysUser getUserById(Long id){
        SysUser sysUser = baseMapper.selectById(id);
        return sysUser;
    }

}
