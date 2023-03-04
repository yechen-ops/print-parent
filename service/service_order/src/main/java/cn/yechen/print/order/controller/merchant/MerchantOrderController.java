package cn.yechen.print.order.controller.merchant;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YECHEN
 * @since 2023/3/4 21:42
 */

@Slf4j
@RestController
@RequestMapping("/api/order/merchant")
public class MerchantOrderController {

    @GetMapping
    public String test() {
        log.info("\n=================测试===============");
        return "Hello World";
    }

}
