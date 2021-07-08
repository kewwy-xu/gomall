package com.stack.dogcat.gomall.product.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
public class PmsProduct implements Serializable {

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
     * 该行记录是否被删除,0->未删除,1->已删除
     */
    private Integer isDeleted;


}
