package ua.org.oa.annabezkrovnaya.model;

import java.time.LocalDate;
import java.util.Objects;

public class PaymentCard extends Entity<Integer> {
    private String type;
    private String cardNumber;
    private LocalDate validDate;
    private String ownerName;
    private String securityCode;

    public PaymentCard() {
    }

    public PaymentCard(String type, String cardNumber, LocalDate validDate, String ownerName, String securityCode) {
        this.type = type;
        this.cardNumber = cardNumber;
        this.validDate = validDate;
        this.ownerName = ownerName;
        this.securityCode = securityCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getValidDate() {
        return validDate;
    }

    public void setValidDate(LocalDate validDate) {
        this.validDate = validDate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PaymentCard that = (PaymentCard) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(cardNumber, that.cardNumber) &&
                Objects.equals(validDate, that.validDate) &&
                Objects.equals(ownerName, that.ownerName) &&
                Objects.equals(securityCode, that.securityCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), type, cardNumber, validDate, ownerName, securityCode);
    }

    @Override
    public String toString() {
        return "PaymentCard{" +
                "type='" + type + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", validDate=" + validDate +
                ", ownerName='" + ownerName + '\'' +
                ", securityCode='" + securityCode + '\'' +
                '}';
    }
}
