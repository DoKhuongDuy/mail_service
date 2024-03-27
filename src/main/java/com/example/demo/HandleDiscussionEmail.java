package com.example.demo;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// [START example]
public class HandleDiscussionEmail extends MailHandlerBase {

    private static final Logger log = Logger.getLogger(HandleDiscussionEmail.class.getName());

    public HandleDiscussionEmail() {
        super("discuss-(.*)@(.*)");
    }

    @Override
    protected boolean processMessage(HttpServletRequest req, HttpServletResponse res)
            throws ServletException {
        log.info("Received e-mail sent to discuss list.");
        MimeMessage msg = getMessageFromRequest(req);
        Matcher match = getMatcherFromRequest(req);
        // ...
        return true;
    }
}
// [END example]