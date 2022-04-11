package com.company;

public class Bee {

    private Long amount;

    public Bee(Long amount) {
        this.amount = amount;
    }

    public Long getAmount() {
        return amount;
    }

    public Bee setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
}
