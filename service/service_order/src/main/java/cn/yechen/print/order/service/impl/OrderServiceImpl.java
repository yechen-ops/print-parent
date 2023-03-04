package cn.yechen.print.order.service.impl;

import cn.yechen.print.order.entity.Order;
import cn.yechen.print.order.mapper.OrderMapper;
import cn.yechen.print.order.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单服务实现类
 * </p>
 *
 * @author YECEHN
 * @since 2023-03-04
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
