package com.example.springbootgraphqlserver.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idx", callSuper = false)
@Entity
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx", updatable = false)
    private Long idx;

    @Comment("상품명")
    @Column(name = "product_name", nullable = false)
    private String productName;

    @Comment("상품 설명")
    @Column(name = "content", length = 2000)
    private String content;

    @Comment("권장 소비자 가격")
    @Column(name = "price")
    private Integer price;

    @Comment("상점")
    @ManyToOne
    @JoinColumn(name = "store_idx", referencedColumnName = "idx", updatable = false, nullable = false)
    private Store store;
}
