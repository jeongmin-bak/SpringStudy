package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderServiceImpl;
import hello.core.order.Orderservice;

public class OrderApp {
	public static void main(String[] args) {
		AppConfig appConfig = new AppConfig();
		MemberService memberService = appConfig.memberService();
		Orderservice orderservice = appConfig.orderservice();

		Long memberId = 1L;
		Member member = new Member(memberId, "memberA", Grade.VIP);
		memberService.join(member);

		Order order = orderservice.createOrder(memberId, "itemA", 10000);
		System.out.println("order = " + order.toString());
	}
}
