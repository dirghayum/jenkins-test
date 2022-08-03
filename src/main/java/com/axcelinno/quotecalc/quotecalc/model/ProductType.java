package com.axcelinno.quotecalc.quotecalc.model;

public enum ProductType {
    NEW, OFFER, LIMITED, SALE;

    public String getValue() {
        return this.toString();
    }
}
