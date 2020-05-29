package com.ford.blogdemo.entity;

import com.ford.blogdemo.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @ClassName: User
 * @author: Ford.Zhang
 * @version: 1.0
 * 2020/5/29 下午 6:17
 **/
@Entity
@Table(name = "user")
@Data
public class User extends BaseEntity {
}
