package com.project.app.base.core.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dongliang.li@hand-china.com
 * @description BaseService
 * @date 2020/6/28 10:35
 */
@Service
public abstract class BaseService<M extends BaseMapper<T>,T> extends ServiceImpl<M,T> {

}
