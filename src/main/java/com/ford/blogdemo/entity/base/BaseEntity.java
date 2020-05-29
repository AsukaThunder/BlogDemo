package com.ford.blogdemo.entity.base;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity extends BaseUDF implements Serializable {

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    /**
     * 创建人
     */
    @Column(name = "create_user", length = 32)
    @CreatedBy
    private String createUser;

    /**
     * 创建人的用户类型
     */
    @Column(name = "create_user_type", length = 20)
    private String createUserType;

    /**
     * 修改人
     */
    @Column(name = "update_user", length = 32)
    @LastModifiedBy
    private String updateUser;

    /**
     * 更新人的用户类型
     */
    @Column(name = "update_user_type",length = 20)
    @LastModifiedBy
    private String updateUserType;


    /**
     * 是否删除
     * 0-未删除 1-已删除
     */
    @Column(name = "is_delete", nullable = false)
    private Boolean isDelete;
}
