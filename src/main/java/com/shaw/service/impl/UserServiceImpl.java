package com.shaw.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shaw.pojo.User;
import com.shaw.service.UserService;
import com.shaw.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author sky
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-09-12 20:26:52
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




