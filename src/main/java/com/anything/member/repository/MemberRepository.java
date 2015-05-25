package com.anything.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anything.member.entity.Member;

/**
 * Created by Administrator on 2015-05-25.
 */
@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
}
