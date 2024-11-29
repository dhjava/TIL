package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl_f implements OrderService {
    private final MemberRepository memberRepository = new
            MemoryMemberRepository();

    //private final DiscountPolicy discountPolicy = new RateDiscountPolicy(); // 추상, 구체 전부 의존(DIP)
    private DiscountPolicy discountPolicy; // 추상화에만 의존, 다만 nullPointer 뜸 -> 구현 객체 주입 필요

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
