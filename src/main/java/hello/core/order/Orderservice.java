package hello.core.order;

public interface Orderservice {
	Order createOrder(Long memberId, String itemName, int itemPrice);
}
