package ua.org.oa.annabezkrovnaya.model;

import java.util.List;
import java.util.Objects;

public class User extends Entity<Integer> {

    private String login;
    private String password;
    private String eMail;
    private String phoneNumber;
    private Role currentRole;
    private PaymentCard ownCard;
    private List<Ticket> currentTicketList;

    public User() {
    }

    public User(String login, String password, String eMail, String phoneNumber, Role currentRole,
                PaymentCard ownCard, List<Ticket> currentTicketList) {
        this.login = login;
        this.password = password;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.currentRole = currentRole;
        this.ownCard = ownCard;
        this.currentTicketList = currentTicketList;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(password, user.password) &&
                Objects.equals(eMail, user.eMail) &&
                Objects.equals(phoneNumber, user.phoneNumber) &&
                Objects.equals(currentRole, user.currentRole) &&
                Objects.equals(ownCard, user.ownCard) &&
                Objects.equals(currentTicketList, user.currentTicketList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), login, password, eMail, phoneNumber, currentRole, ownCard, currentTicketList);
    }
}
