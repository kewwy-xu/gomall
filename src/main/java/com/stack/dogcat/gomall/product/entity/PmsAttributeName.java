package com.stack.dogcat.gomall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 属性名
 * </p>
 *
 * @author xrm
 * @since 2021-07-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsAttributeName implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 属性名
     */
    private String name;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 所属的属性集合id
     */
    private Integer attributeCollectionId;

    /**
     * 检索类型
     */
    private Integer selectType;

    /**
     * 属性录入方式
     */
    private Integer inputType;

    /**
     * 是否支持手动新增,0->否,1->是
     */
    private Integer handAdd;

    /**
     * 是否支持手动新增，0->否，1->是
     */
    private Integer isDeleted;

    /**
     * 所属分类id
     */
    private Integer typeId;


}