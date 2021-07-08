package com.stack.dogcat.gomall.order.service.impl;

import com.stack.dogcat.gomall.order.entity.OmsCartItem;
import com.stack.dogcat.gomall.order.mapper.OmsCartItemMapper;
import com.stack.dogcat.gomall.order.service.IOmsCartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author xrm
 * @since 2021-07-08
 */
@Service
public class OmsCartItemServiceImpl extends ServiceImpl<OmsCartItemMapper, OmsCartItem> implements IOmsCartItemService {

}
