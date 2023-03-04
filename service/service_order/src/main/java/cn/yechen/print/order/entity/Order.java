package cn.yechen.print.order.entity;

import cn.yechen.print.service.base.module.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 订单实体
 * </p>
 *
 * @author YECEHN
 * @since 2023-03-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_order")
@ApiModel(value="Order对象", description="订单实体")
public class Order extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "下单店铺ID")
    private String shopId;

    @ApiModelProperty(value = "下单用户ID")
    private String buyerId;

    @ApiModelProperty(value = "下单用户手机号")
    private String buyerMobile;

    @ApiModelProperty(value = "下单用户名字")
    private String buyerName;

    @ApiModelProperty(value = "下单用户邮箱")
    private String buyerEmail;

    @ApiModelProperty(value = "总价：保留小数点后2位")
    private BigDecimal price;

    @ApiModelProperty(value = "0:已下单未支付 1:支付成功 2:已接单 3:正在打印 4:等待取件 5:订单结束 6:用户主动取消订单 7:商家拒接接受订单 8:超时已关闭 9:申请退款 10:已退款 11:退款异常")
    private Integer status;

    @ApiModelProperty(value = "打印文件ID")
    private String fileId;

    @ApiModelProperty(value = "文件的打印份数")
    private Integer fileCopies;

    @ApiModelProperty(value = "颜色信息ID")
    private String pageColorInfoId;

    @ApiModelProperty(value = "大小信息ID")
    private String pageSizeInfoId;

    @ApiModelProperty(value = "单双页信息ID")
    private String pageSingleDoubleInfoId;

    @ApiModelProperty(value = "用户备注")
    private String userRemarks;

    @ApiModelProperty(value = "退款原因")
    private String refundReason;

    @ApiModelProperty(value = "支付时间")
    private Date paymentTime;

    @ApiModelProperty(value = "拒绝接单原因")
    private String refuseReason;

    @ApiModelProperty(value = "订单评分：0 ~ 5")
    private BigDecimal credit;

    @ApiModelProperty(value = "取件码，由短信通知用户")
    private String fetchCode;


}
