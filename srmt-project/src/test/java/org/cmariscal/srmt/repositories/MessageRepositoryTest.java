package org.cmariscal.srmt.repositories;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cmariscal.srmt.entities.Message;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by cmariscal on 3/5/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/application-context.xml")
public class MessageRepositoryTest {

    @Autowired
    MessageRepository repository;

    Logger logger = LogManager.getLogger(MessageRepositoryTest.class);

    @Test
    public void createMessage() throws Exception {
        String subject = "TEST CREATE MESSAGE";
        Message message = new Message();
        message.setSubject(subject);
        message.setMessageDate(new Date());

        repository.save(message);

        Message dbMessage = repository.findOne(message.getMessageId());

        assertNotNull(dbMessage);

        assertEquals(subject, dbMessage.getSubject());

        logger.debug("Message ID: " + dbMessage.getMessageId() + " Message Date: " + dbMessage.getMessageDate().toString()
            + " Message Subject: " + dbMessage.getSubject());
    }
}
