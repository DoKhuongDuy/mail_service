package com.example.demo;

// [START mail_handler_servlet]

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MailHandlerServlet extends HttpServlet {

    private static final Logger log = Logger.getLogger(MailHandlerServlet.class.getName());

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Properties props = new Properties();
        Session session = Session.getDefaultInstance(props, null);
        try {
            MimeMessage message = new MimeMessage(session, req.getInputStream());
            log.info("Received mail message.");
        } catch (MessagingException e) {
            // ...
        }
        // ...
    }
}
// [END mail_handler_servlet]