package plutus.datatypes.model;

public interface OrderSink
{
	void accept(Order order);
}