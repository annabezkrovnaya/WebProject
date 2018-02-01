package ua.org.oa.annabezkrovnaya.dto;

import ua.org.oa.annabezkrovnaya.model.Entity;
import ua.org.oa.annabezkrovnaya.model.PaymentCard;
import ua.org.oa.annabezkrovnaya.model.Role;
import ua.org.oa.annabezkrovnaya.model.Ticket;

import java.util.List;

public class UserDTO extends Entity<Integer> {
    private String login;
    private String password;
    private String eMail;
    private String phoneNumber;
    private Role currentRole;
    private PaymentCard ownCard;
    private List<Ticket> currentTicketList;

    public UserDTO() {
    }

    public UserDTO(String login, String password, String eMail, String phoneNumber, Role currentRole,
                PaymentCard ownCard, List<Ticket> currentTicketList) {
        this.login = login;
        this.password = password;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.currentRole = currentRole;
        this.ownCard = ownCard;
        this.currentTicketList = currentTicketList;
    }

    public UserDTO(String login, String password, String eMail, String phoneNumber, Role currentRole) {
        this.login = login;
        this.password = password;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.currentRole = currentRole;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Role getCurrentRole() {
        return currentRole;
    }

    public void setCurrentRole(Role currentRole) {
        this.currentRole = currentRole;
    }

    public PaymentCard getOwnCard() {
        return ownCard;
    }

    public void setOwnCard(PaymentCard ownCard) {
        this.ownCard = ownCard;
    }

    public List<Ticket> getCurrentTicketList() {
        return currentTicketList;
    }

    public void setCurrentTicketList(List<Ticket> currentTicketList) {
        this.currentTicketList = currentTicketList;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", eMail='" + eMail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", currentRole=" + currentRole +
                ", ownCard=" + ownCard +
                ", currentTicketList=" + currentTicketList +
                '}';
    }


}
