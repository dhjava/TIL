package hello.hello_spring;

import hello.hello_spring.repository.MemberRepository;
import hello.hello_spring.repository.MemoryMemberRepository;
import hello.hello_spring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    
    // 스프링 빈 등록
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository()); // 로직 호출해서 등록
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository(); // 인터페이스가 아닌 구현체를 불러와야함.
    }
}
