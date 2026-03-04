package plutus.datatypes.model;

import plutus.datatypes.types.PriceType;
import plutus.datatypes.types.SizeType;
import plutus.datatypes.types.TimestampType;

public record Trade(PriceType price, SizeType size, TimestampType timestamp)
{
}