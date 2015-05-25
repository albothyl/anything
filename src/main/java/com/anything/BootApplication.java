package com.anything;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.anything.member.entity.Member;
import com.anything.member.repository.MemberRepository;

/**
 * Created by Administrator on 2015-05-25.
 */
@SpringBootApplication
@EntityScan(basePackages="com.anything.member")
@EnableJpaRepositories(basePackages="com.anything.member")
public class BootApplication implements CommandLineRunner {
    @Autowired
    MemberRepository memberRepository;

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Member member = new Member();
        member.setEmail("testEmail_2@test.com");
        member.setPassword("testPassword_2");
        member.setName("testName_2");
        member.setNickName("testNickName_2");
        member.setGrade("testGrade_2");
        member.setUpdateAt(new Date());
        member.setCreateAt(new Date());

        memberRepository.save(member);
    }
}
