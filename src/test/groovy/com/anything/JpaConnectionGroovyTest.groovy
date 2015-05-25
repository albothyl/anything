package com.anything

import com.anything.member.entity.Member
import com.anything.member.repository.MemberRepository
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

/**
 * Created by Administrator on 2015-05-25.
 */
class JpaConnectionGroovyTest extends Specification {

    @Autowired
    MemberRepository memberRepository

//    def "jpa를 이용하여 데이터를 인설트한다."() {
//        def Member member = new Member();
//        member.setEmail("testEmail_2@test.com");
//        member.setPassword("testPassword_2");
//        member.setName("testName_2");
//        member.setNickName("testNickName_2");
//        member.setGrade("testGrade_2");
//        member.setUpdateAt(new Date());
//        member.setCreateAt(new Date());
//
//        expect:
//        def Member resultMemberSaved = memberRepository.save(member);
//    }
}