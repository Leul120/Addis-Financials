package com.matcodem.fincore.fraud.domain.event;

import java.time.Instant;
import java.util.UUID;

import com.matcodem.fincore.fraud.domain.model.FraudCaseId;
import com.matcodem.fincore.fraud.domain.model.RiskScore;

public record FraudCaseEscalatedEvent(
		UUID eventId, Instant occurredAt,
		FraudCaseId fraudCaseId, String paymentId, RiskScore score
) implements DomainEvent {

	public FraudCaseEscalatedEvent(FraudCaseId fraudCaseId, String paymentId,
	                               RiskScore score, Instant occurredAt) {
		this(UUID.randomUUID(), occurredAt, fraudCaseId, paymentId, score);
	}

	@Override
	public String aggregateId() {
		return fraudCaseId.toString();
	}

	@Override
	public String eventType() {
		return "fraud.case.escalated";
	}
}

// Updated on 2024-12-24 18:20:37