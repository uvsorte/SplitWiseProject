package com.Splitwise.SplitwiseApp.service.strategy.settleUpStrategy;

import com.Splitwise.SplitwiseApp.entity.Expense;
import com.Splitwise.SplitwiseApp.entity.SettlementTransaction;

import java.util.List;

public interface SettleUpStrategy {

    List<SettlementTransaction> getSettlementTrasaction(List<Expense> expenses);
}
