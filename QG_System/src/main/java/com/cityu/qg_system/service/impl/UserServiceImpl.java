package com.cityu.qg_system.service.impl;

import com.cityu.qg_system.entity.User;
import com.cityu.qg_system.mapper.UserMapper;
import com.cityu.qg_system.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cityu
 * @since 2022-05-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
