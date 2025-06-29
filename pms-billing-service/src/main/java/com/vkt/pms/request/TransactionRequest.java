package com.vkt.pms.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TransactionRequest {
    @NotNull(message = "Transaction type is required")
    private String transactionType;

    @NotNull(message = "Amount is required")
    private BigDecimal amount;

    @NotNull(message = "Remarks about transaction type is required")
    private String remarks;
}
