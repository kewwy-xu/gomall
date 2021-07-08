package com.stack.dogcat.gomall.order.service.impl;

import com.stack.dogcat.gomall.order.entity.OmsOrder;
import com.stack.dogcat.gomall.order.mapper.OmsOrderMapper;
import com.stack.dogcat.gomall.order.service.IOmsOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author xrm
 * @since 2021-07-08
 */
@Service
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderMapper, OmsOrder> implements IOmsOrderService {

}
