package br.bczk.keycloak.dto;

public class SmtpMessageSender {
    private String clientId;
    private String subject;
    private String textBody;
    private String htmlBody;
    private String address;

    public SmtpMessageSender(String clientId, String subject, String textBody, String htmlBody, String address) {
        this.clientId = clientId;
        this.subject = subject;
        this.textBody = textBody;
        this.htmlBody = htmlBody;
        this.address = address;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSubject() {
        return subject;
    }

    public String getTextBody() {
        return textBody;
    }

    public String getHtmlBody() {
        return htmlBody;
    }

    public String getAddress() {
        return address;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }

    public void setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
