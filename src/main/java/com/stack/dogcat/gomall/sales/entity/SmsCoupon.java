package com.stack.dogcat.gomall.sales.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 优惠券表
 * </p>
 *
 * @author xrm
 * @since 2021-07-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SmsCoupon implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 优惠券id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商家id
     */
    private Integer storeId;

    /**
     * 可以使用的价格
     */
    private BigDecimal targetPrice;

    /**
     * 满减金额
     */
    private BigDecimal discount;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 过期时间
     */
    private LocalDateTime deadline;

    /**
     * 逻辑删除，0表示未删除，1表示删除
     */
    private Integer isDeleted;


}