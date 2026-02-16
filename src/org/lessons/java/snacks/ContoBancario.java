package org.lessons.java.snacks;

import java.math.BigDecimal;

public class ContoBancario {
    // Attributi
    private String numeroConto;
    private BigDecimal saldo;

    // Metodi

    public ContoBancario(String numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = new BigDecimal("0");
    }

    // Add money
    public void setAddMoney(BigDecimal cash) {
        if (cash.compareTo(BigDecimal.ZERO) > 0) {
            this.saldo = this.saldo.add(cash);
        }
    }

    // Subtract money
    public void setSubtractMoney(BigDecimal cash) {
        if (cash.compareTo(BigDecimal.ZERO) > 0) {
            this.saldo = this.saldo.subtract(cash);
        }
    }

    // See money
    public BigDecimal getSaldo() {
        return this.saldo;
    }
}
