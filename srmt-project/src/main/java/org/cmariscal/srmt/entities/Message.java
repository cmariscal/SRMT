package org.cmariscal.srmt.entities;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by cmariscal on 3/5/2016.
 */

@Entity
@Table(name="MESSAGE")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MESSAGE_ID")
    BigInteger messageId;

    @Column(name = "MESSAGE_DATE")
    Date messageDate;

    @Column(name = "SUBJECT")
    String subject;

    public BigInteger getMessageId() {
        return messageId;
    }

    public void setMessageId(BigInteger messageId) {
        this.messageId = messageId;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
