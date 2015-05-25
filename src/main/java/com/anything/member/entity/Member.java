package com.anything.member.entity;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

/**
 * Created by Administrator on 2015-05-25.
 */
@Data
@NoArgsConstructor
@Entity
@Table(schema = "anything", name = "member")
@EqualsAndHashCode(of = { "id" })
@SuppressWarnings("PMD.UnusedPrivateField")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name = "email", unique = true, nullable = false)
    private String email;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "nick_Name", unique = true, nullable = false)
    private String nickName;
    @Column(name = "grade", nullable = false)
    private String grade;
    @LastModifiedDate
    private Date updateAt;
    @CreatedDate
    private Date createAt;
}
