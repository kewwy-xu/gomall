package com.stack.dogcat.gomall.product.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 属性值
 * </p>
 *
 * @author xrm
 * @since 2021-07-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsAttributeValue implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 属性值
     */
    private String value;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 属性名id
     */
    private Integer attributeNameId;

    /**
     * 商品id
     */
    private Integer productId;

    /**
     * 该行记录是否被删除,0->未删除,1->已删除
     */
    private Integer isDeleted;


}
