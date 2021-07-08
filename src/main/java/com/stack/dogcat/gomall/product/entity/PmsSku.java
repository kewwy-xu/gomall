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
 * 商品规格和库存量单元
 * </p>
 *
 * @author xrm
 * @since 2021-07-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsSku implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer productId;

    /**
     * 规格属性集合，json表示
     */
    private String productAttribute;

    /**
     * 库存量
     */
    private Integer stockNum;

    /**
     * 该规格下的商品价格
     */
    private BigDecimal price;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 该规格的商品销量
     */
    private Integer salesNum;

    /**
     * 该行记录是否被删除,0->未删除,1->已删除
     */
    private Integer isDeleted;


}
