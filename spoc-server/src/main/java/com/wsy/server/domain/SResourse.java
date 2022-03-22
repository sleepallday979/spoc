package com.wsy.server.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 资源表

 * @TableName s_resourse
 */
@TableName(value ="s_resourse")
@Data
public class SResourse implements Serializable {
    /**
     * 资源ID
     */
    @TableId(type = IdType.AUTO)
    private Integer resourceId;

    /**
     * 课程ID
     */
    private Integer courseId;

    /**
     * 上传用户ID
     */
    private Integer userId;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 资源描述
     */
    private String resourceDesc;

    /**
     * 资源修改时间
     */
    private Date resourceTime;

    /**
     * 资源外部空间
     */
    private String resourceSpace;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}