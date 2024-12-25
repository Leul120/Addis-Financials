package com.matcodem.fincore.fx.adapter.in.web.dto;

import java.math.BigDecimal;
import java.time.Instant;

public record ConversionQuoteResponse(
		String pair, BigDecimal sourceAmount, BigDecimal convertedAmount,
		BigDecimal appliedRate, BigDecimal fee, int spreadBasisPoints, Instant rateTimestamp
) {
}

// Updated on 2024-12-25 09:15:04