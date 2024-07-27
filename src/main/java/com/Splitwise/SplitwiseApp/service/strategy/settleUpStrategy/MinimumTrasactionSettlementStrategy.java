package com.Splitwise.SplitwiseApp.service.strategy.settleUpStrategy;

import com.Splitwise.SplitwiseApp.entity.Expense;
import com.Splitwise.SplitwiseApp.entity.SettlementTransaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MinimumTrasactionSettlementStrategy implements SettleUpStrategy {
    @Override
    public List<SettlementTransaction> getSettlementTrasaction(List<Expense> expenses) {
        //TODO
        return List.of();
    }
}
