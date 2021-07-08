package com.stack.dogcat.gomall.product.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 商品
 * </p>
 *
 * @author xrm
 * @since 2021-07-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("pms_product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品名
     */
    private String name;

    /**
     * 商家id
     */
    private Integer storeId;

    /**
     * 添加商品时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 库存量
     */
    private Integer stockNum;

    /**
     * 商品展示图片路径
     */
    private String imagePath;

    /**
     * 商品描述
     */
    private String description;

    /**
     * 销量
     */
    private Integer salesNum;

    /**
     * 商品类型id
     */
    private Integer typeId;

    /**
     * 商品的用户点击量
     */
    private Integer clickNum;

    /**
     * 商品最高价格（规格不同，价格不同）
     */
    private BigDecimal highestPrice;

    /**
     * 商品最低价格（规格不同，价格不同）
     */
    private BigDecimal lowestPrice;

    /**
     * 逻辑删除，0表示未删除，1表示删除
     */
    @TableLogic
    @TableField(value = "is_deleted")
    private Integer deleted;


}
