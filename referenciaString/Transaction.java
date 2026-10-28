package referenciaString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {

  private String transactionId;
  private String accountId;
  private BigDecimal amount;
  private LocalDateTime timestamp;
  private String status; // Ej: "SUCCESS", "FAILED", "PENDING"

  // Constructores, Getters y Setters
  public Transaction(String transactionId, String accountId, BigDecimal amount, LocalDateTime timestamp, String status) {
    this.transactionId = transactionId;
    this.accountId = accountId;
    this.amount = amount;
    this.timestamp = timestamp;
    this.status = status;
  }

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public LocalDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
