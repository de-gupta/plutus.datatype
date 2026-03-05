package plutus.core.model;

public interface OrderSink
{
	void accept(Order order);
}