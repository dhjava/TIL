package hello.hello_spring.controller;

import hello.hello_spring.domain.Member;
import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

// @Controller 작성 시 기능은 없어도 컨트롤러 객체 생성 후 관리함.
@Controller
public class MemberController {
    // new 작성 시 다른 컨트롤러도 가져다 쓸 수 있음
    private final MemberService memberService;

    // 생성자 작성, Autowired로 memberService 가져다 연결 시켜줌(의존관계)
    @Autowired
    public MemberController(MemberService memberService) { // 안되는 이유 = 순수한 자바 클래스라 규칙(@Service 작성해주면 됨)
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm(){
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(MemberForm form){
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/";
    }

    @GetMapping("/members")
    public String list(Model model){
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";
    }
}
