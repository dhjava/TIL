package hello.core.member;

public class MemberServiceImpl_f implements MemberService {

    // 왼쪽은 인터페이스 의존하나 오른쪽은 구현체에 의존 중
    // 추상화, 구체회 전부 의존(DIP 위배)
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId){
        return memberRepository.findById(memberId);
    }
}
