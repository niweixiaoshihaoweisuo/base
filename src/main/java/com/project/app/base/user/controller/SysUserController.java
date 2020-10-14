package com.project.app.base.user.controller;

import com.project.app.base.user.domain.SysUser;
import com.project.app.base.user.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author dongliang.li@hand-china.com
 * @description SysUserController
 * @date 2020/6/28 0:26
 */
@RequestMapping(value = "/api/base/sys/user")
@Controller
@Slf4j
public class SysUserController {

    @Autowired
    SysUserService sysUserService;

    @GetMapping(value = "/query/all")
    public ResponseEntity<List<SysUser>> getAllUser(){
        return ResponseEntity.ok(sysUserService.getAllUser());
    }

    @GetMapping(value = "/query/by/id/{id}")
    public ResponseEntity<SysUser> getUserById(@PathVariable Long id){
        log.info("id:"+id);
        return ResponseEntity.ok(sysUserService.getUserById(id));
    }
}
