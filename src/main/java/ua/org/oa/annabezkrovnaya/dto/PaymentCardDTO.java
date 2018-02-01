package ua.org.oa.annabezkrovnaya.dto;

import ua.org.oa.annabezkrovnaya.model.Entity;

import java.time.LocalDate;

public class PaymentCardDTO extends Entity<Integer> {

    private String type;
    private String cardNumber;
    private LocalDate validDate;
    private String ownerName;
    private String securityCode;

    public PaymentCardDTO() {
    }

    public PaymentCardDTO(String type, String cardNumber, LocalDate validDate, String ownerName, String securityCode) {
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
    public String toString() {
        return "PaymentCardDTO{" +
                "type='" + type + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", validDate=" + validDate +
                ", ownerName='" + ownerName + '\'' +
                ", securityCode='" + securityCode + '\'' +
                '}';
    }
}
