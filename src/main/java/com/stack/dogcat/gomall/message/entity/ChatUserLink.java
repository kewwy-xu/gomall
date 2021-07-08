package com.stack.dogcat.gomall.message.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author xrm
 * @since 2021-07-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("mms_chat_user_link")
public class ChatUserLink implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 顾客id
     */
    private Integer customerId;

    /**
     * 商家id
     */
    private Integer storeId;

    /**
     * 创建时间
     */
    private LocalDateTime gmtCreate;

    /**
     * 1--已删除，0--未删除
     */
    private Integer isDeleted;


}
