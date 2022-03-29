package com.github.rusakovichma.tictaac.model;

public enum ThreatRisk {
    Low(0),
    Medium(1),
    High(2),
    Undefined(-1);

    private final int order;

    ThreatRisk(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
