package procesadorPagos;

import java.math.BigDecimal;
import java.util.*;

public class ProcesadorPagos {

  public Map<String, BigDecimal> procesarPagos(List<Transaction> transactionList) {
    Set<String> seenTransactionIds = new HashSet<>();
    Map<String, BigDecimal> totalPorCuenta = new HashMap<>();

    // ordenar la lista de transacciones por timestamp descendente
    transactionList.sort(Comparator.comparing(Transaction::getTimestamp).reversed());

    for (Transaction t : transactionList) {
      if (t == null || t.getTransactionId() == null || t.getAccountId() == null
          || t.getAmount() == null || t.getStatus() == null) {
        continue; // Manejar transacciones nulas
      }
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

    return totalPorCuenta;
  }
}
