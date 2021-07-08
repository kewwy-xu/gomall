package com.stack.dogcat.gomall.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author xrm
 * @since 2021-07-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UmsCustomer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String openId;

    private String sessionKey;

    private String userName;

    private String phoneNumber;

    private Integer age;

    /**
     * 0男 1女
     */
    private Integer gender;

    private String avatorPath;

    private String loginKey;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 1--已删除，0--未删除
     */
    private Integer isDeleted;


}
