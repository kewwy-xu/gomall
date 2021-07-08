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
 * 活动表
 * </p>
 *
 * @author xrm
 * @since 2021-07-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SmsSalesPromotion implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 活动id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商家id
     */
    private Integer storeId;

    /**
     * 商品id
     */
    private Integer productId;

    /**
     * 标题
     */
    private String title;

    /**
     * 折扣
     */
    private BigDecimal discount;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 结束时间
     */
    private LocalDateTime deadline;

    /**
     * 逻辑删除，0表示未删除，1表示删除
     */
    private Integer isDeleted;


}
