package procesadorPagos;

import java.math.BigDecimal;
import java.util.*;

public class ProcesadorPagos {

  public Map<String, BigDecimal> procesarPagos(List<Transaction> transactionList) {
    Set<String> seenTransactionIds = new HashSet<>();
    Map<String, BigDecimal> totalPorCuenta = new HashMap<>();

    try {
      for (Transaction t : transactionList) {
        // filtrar duplicados por transactionId
        if (!seenTransactionIds.add(t.getTransactionId())) {
          continue;
        }
        // excluir fallidas
        if ("FAILED".equals(t.getStatus())) {
          continue;
        }
        //  Calcular el monto total (BigDecimal) procesado por cada accountId.
        totalPorCuenta.merge(t.getAccountId(), t.getAmount(), BigDecimal::add);
      }
    } catch (NullPointerException e) {
      System.err.println("Error al procesar los pagos: " + e.getMessage());
    }

    return totalPorCuenta;
  }
}
