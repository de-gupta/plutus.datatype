package plutus.core.model;

import plutus.core.types.PriceType;
import plutus.core.types.SizeType;
import plutus.core.types.TimestampType;

public record Trade(PriceType price, SizeType size, TimestampType timestamp)
{
}