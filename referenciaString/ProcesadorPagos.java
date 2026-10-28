package referenciaString;

import java.math.BigDecimal;
import java.util.*;

public class ProcesadorPagos {

  public Map<?, ?> procesarPagos(List<Transaction> transactionList) {
    // filtrar duplicados por transactionId
    transactionList = filtrarDuplicados(transactionList);
    // excluir fallidas
    transactionList = excluirFallidas(transactionList);

    return calcularMontoTotalPorCuenta(transactionList);
  }

  private List<Transaction> filtrarDuplicados(List<Transaction> transactionList) {
    List<Transaction> filteredList = new ArrayList<>();
    Set<String> seenTransactionIds = new HashSet<>();

    for (Transaction t : transactionList) {
      if (seenTransactionIds.add(t.getTransactionId())) {
        filteredList.add(t);
      }
    }

    return filteredList;
  }

  private List<Transaction> excluirFallidas(List<Transaction> transactionList) {
    return transactionList.stream()
        .filter(t -> !"FAILED".equals(t.getStatus()))
        .toList();
  }

  //  Cálculo seguro: Calcular el monto total (BigDecimal) procesado por cada accountId.
  public Map<String, BigDecimal> calcularMontoTotalPorCuenta(List<Transaction> transactionList) {
    Map<String, BigDecimal> totalPorCuenta = new HashMap<>();

    for (Transaction t : transactionList) {
      String accountId = t.getAccountId();
      BigDecimal totalActual = totalPorCuenta.getOrDefault(accountId, BigDecimal.ZERO);
      totalPorCuenta.put(accountId, totalActual.add(t.getAmount()));
    }

    return totalPorCuenta;
  }
}
