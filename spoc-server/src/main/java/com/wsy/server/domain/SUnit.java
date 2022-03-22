package com.wsy.server.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 单元点表
 * @TableName s_unit
 */
@TableName(value ="s_unit")
@Data
public class SUnit implements Serializable {
    /**
     * 单元ID
     */
    @TableId(type = IdType.AUTO)
    private Integer unitId;

    /**
     * 课程ID
     */
    private Integer couseId;

    /**
     * 课程对应单元序号
     */
    private Integer unitNum;

    /**
     * 单元名称
     */
    private String unitName;

    /**
     * 单元描述
     */
    private String unitDesc;

    /**
     * 单元视频空间
     */
    private String unitSpace;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}