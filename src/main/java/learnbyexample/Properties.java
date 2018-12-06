package learnbyexample;

import java.math.BigDecimal;
import java.util.Objects;

public class Properties {
    private final String zone_code;
    private final String zone_name;
    private final ZoneCharge zone_charge;

    public Properties(String zone_code, String zone_name, ZoneCharge zone_charge) {
        super();
        this.zone_code = zone_code;
        this.zone_name = zone_name;
        this.zone_charge = zone_charge;
    }

    public String getZonename() {
        return zone_name;
    }

    @Override
    public String toString() {
        return String.format("Properties [zone_name=%s]", zone_name);
    }

    public String getZoneCode() {
        return zone_code;
    }

    public ZoneCharge getZoneCharge() {
        return zone_charge;
    }

    @Override
    public int hashCode() {
        return Objects.hash(zone_code, zone_name, zone_charge);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (getClass() != obj.getClass()) {
            return false;
        }

        final Properties other = (Properties) obj;
        return    Objects.equals(this.zone_code, other.zone_code)
                && Objects.equals(this.zone_name, other.zone_name)
                && Objects.equals(this.zone_charge, other.zone_charge);
    }

    public static class ZoneCharge {
        private final BigDecimal amount;
        private final String currency;

        public static ZoneCharge empty() {
            return new ZoneCharge(BigDecimal.ZERO, null);
        }

        public ZoneCharge(BigDecimal amount, String currency) {
            super();
            this.amount = amount;
            this.currency = currency;
        }

        public BigDecimal getAmount() {
            return amount;
        }

        public String getCurrency() {
            return currency;
        }

        @Override
        public int hashCode() {
            return Objects.hash(amount, currency);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            } else if (getClass() != obj.getClass()) {
                return false;
            }

            final ZoneCharge other = (ZoneCharge) obj;
            return Objects.equals(this.amount, other.amount)
                    && Objects.equals(this.currency, other.currency);
        }

    }
}