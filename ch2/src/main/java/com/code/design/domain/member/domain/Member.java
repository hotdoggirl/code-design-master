package com.code.design.domain.member.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "member")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "Member")
@ToString
public class Member {

    @Column(nullable = false)
    @Id
    private Long id;

    @Column(length = 100)
    private String name;
}
