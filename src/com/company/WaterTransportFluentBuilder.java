package com.company;

public class WaterTransportFluentBuilder extends WaterTransport {

    public WaterTransportFluentBuilder() {}

    public WaterTransportFluentBuilder(String subType, String bonus) {
        super(subType);
        this.bonus = bonus;
    }

    public static Builder createBuilder() {
        return new WaterTransportFluentBuilder().new Builder();
    }

    public String getBonus() {
        return bonus;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    private String bonus;
    private int countPassengers;

    @Override
    public String showInfo() {
        return super.showInfo() +
                ", bonus = " + bonus;
    }

    @Override
    public void assembleTransport() {

    }

    public class Builder {

        private Builder() {}

        public Builder setBonus(String bonus) {
            WaterTransportFluentBuilder.this.bonus = bonus;
            return this;
        }

        public Builder setCountPassengers(int countPassengers) {
            WaterTransportFluentBuilder.this.countPassengers = countPassengers;
            return this;
        }

        public WaterTransportFluentBuilder build() {
            return WaterTransportFluentBuilder.this;
        }
    }
}
