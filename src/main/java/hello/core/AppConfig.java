package hello.core;

import hello.core.discount.FixDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderServiceImpl;
import hello.core.order.Orderservice;

public class AppConfig {
	public MemberService memberService(){
		return new MemberServiceImpl(new MemoryMemberRepository());
	}

	public Orderservice orderservice(){
		return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
	}
}
