package com.example.demo.entity;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "t_order", indexes = {
        @Index(name = "index_user_id", columnList = "user_id", unique = false),
}
)
@org.hibernate.annotations.Table(appliesTo = "t_order", comment = "订单表")
@org.hibernate.annotations.DynamicInsert
@org.hibernate.annotations.DynamicUpdate
public class TOrder {

    @Id
    @Column(name = "order_id", unique = true, nullable = false, updatable = false, insertable = false, columnDefinition = "bigint comment '订单ID'")
    private long orderId;

    @Column(name = "user_id", columnDefinition = "bigint comment '用户ID'")
    private long userId;

}
