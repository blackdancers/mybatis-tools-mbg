package mbggen.entity;

import com.wk.ec.common.entity.AbstractBaseEntity;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Orders extends AbstractBaseEntity {
    /**
     * 父订单编号
     */
    @Column(name = "order_code")
    private String orderCode;

    /**
     * 取消原因
     */
    @Column(name = "cancel_reason")
    private String cancelReason;

    /**
     * 会员ID
     */
    @Column(name = "member_id")
    private Integer memberId;

    /**
     * 会员名称
     */
    @Column(name = "member_name")
    private String memberName;

    /**
     * 支付状态
     */
    @Column(name = "pay_status")
    private Integer payStatus;

    /**
     * 订单状态
     */
    @Column(name = "order_status")
    private Integer orderStatus;

    /**
     * 付款方式
     */
    @Column(name = "pay_type")
    private Integer payType;

    /**
     * 订单总金额
     */
    @Column(name = "order_amount")
    private BigDecimal orderAmount;

    /**
     * 订单更新时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 是否删除
     */
    @Column(name = "is_drop")
    private String isDrop;

    /**
     * 订单创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取父订单编号
     *
     * @return order_code - 父订单编号
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * 设置父订单编号
     *
     * @param orderCode 父订单编号
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    /**
     * 获取取消原因
     *
     * @return cancel_reason - 取消原因
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * 设置取消原因
     *
     * @param cancelReason 取消原因
     */
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason == null ? null : cancelReason.trim();
    }

    /**
     * 获取会员ID
     *
     * @return member_id - 会员ID
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 设置会员ID
     *
     * @param memberId 会员ID
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 获取会员名称
     *
     * @return member_name - 会员名称
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * 设置会员名称
     *
     * @param memberName 会员名称
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    /**
     * 获取支付状态
     *
     * @return pay_status - 支付状态
     */
    public Integer getPayStatus() {
        return payStatus;
    }

    /**
     * 设置支付状态
     *
     * @param payStatus 支付状态
     */
    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * 获取订单状态
     *
     * @return order_status - 订单状态
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态
     *
     * @param orderStatus 订单状态
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取付款方式
     *
     * @return pay_type - 付款方式
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * 设置付款方式
     *
     * @param payType 付款方式
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * 获取订单总金额
     *
     * @return order_amount - 订单总金额
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /**
     * 设置订单总金额
     *
     * @param orderAmount 订单总金额
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 获取订单更新时间
     *
     * @return update_date - 订单更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置订单更新时间
     *
     * @param updateDate 订单更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取是否删除
     *
     * @return is_drop - 是否删除
     */
    public String getIsDrop() {
        return isDrop;
    }

    /**
     * 设置是否删除
     *
     * @param isDrop 是否删除
     */
    public void setIsDrop(String isDrop) {
        this.isDrop = isDrop == null ? null : isDrop.trim();
    }

    /**
     * 获取订单创建时间
     *
     * @return create_date - 订单创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置订单创建时间
     *
     * @param createDate 订单创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}