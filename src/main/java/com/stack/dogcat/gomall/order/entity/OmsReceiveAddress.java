package com.stack.dogcat.gomall.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 收货地址表
 * </p>
 *
 * @author xrm
 * @since 2021-07-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OmsReceiveAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 收货地址id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id
     */
    private Integer customerId;

    /**
     * 地址
     */
    private String address;

    /**
     * 默认地址，0->不是默认地址，1->是默认地址
     */
    private Integer defaultAddress;

    /**
     * 逻辑删除，0表示未删除，1表示删除
     */
    private Integer isDeleted;


}
