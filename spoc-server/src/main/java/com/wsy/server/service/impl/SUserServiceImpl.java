package com.wsy.server.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wsy.server.domain.SUser;
import com.wsy.server.mapper.SUserMapper;
import com.wsy.server.service.SUserService;
import org.springframework.stereotype.Service;

/**
* @author Tsd
* @description 针对表【s_user(用户表)】的数据库操作Service实现
* @createDate 2022-03-22 19:47:22
*/
@Service
public class SUserServiceImpl extends ServiceImpl<SUserMapper, SUser>
    implements SUserService {

}




