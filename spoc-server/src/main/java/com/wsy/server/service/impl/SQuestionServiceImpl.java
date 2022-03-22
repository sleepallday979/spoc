package com.wsy.server.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wsy.server.domain.SQuestion;
import com.wsy.server.mapper.SQuestionMapper;
import com.wsy.server.service.SQuestionService;
import org.springframework.stereotype.Service;

/**
* @author Tsd
* @description 针对表【s_question】的数据库操作Service实现
* @createDate 2022-03-22 18:28:37
*/
@Service
public class SQuestionServiceImpl extends ServiceImpl<SQuestionMapper, SQuestion>
    implements SQuestionService {

}




