package hello.core.member;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

// 회원 저장소 구현체
@Component
public class MemoryMemberRepository implements MemberRepository {

    /* 해시맵 = 키와 값 쌍을 저장하는 자료 구조
    키를 기반으로 데이터 엑세스가 필요할 때 사용함
    다만 동시성 이슈 있으므로 실무에서는 ConcurrentHashMap 쓰는 것이 맞음. */
    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
