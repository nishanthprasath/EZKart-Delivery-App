/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api;

import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Email;
import java.io.IOException;
import com.sendgrid.*;
import com.sendgrid.helpers.mail.objects.Content;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

import java.util.Random;


public class API {
    
    public String sendEmail() throws java.io.IOException
    {
        
        Random random = new Random();
        Email from = new Email("subhashchandran.shankar@gmail.com");
        Email to = new Email("dhanushkumar13@gmail.com");
        String sub = "Test";
        String id = String.format("%04d", random.nextInt(10000));

        Content content = new Content("text/plain", "OTP: " + id);
        Mail mail = new Mail(from, sub, to,content );
        
        
        SendGrid sg = new SendGrid("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");
        Request request = new Request();
        
    try {
    request.setMethod(Method.POST);
    request.setEndpoint("mail/send");
    request.setBody(mail.build());
    Response response = sg.api(request);
    System.out.println(response.getStatusCode());
    System.out.println(response.getBody());
    System.out.println(response.getHeaders());
    }
    catch(IOException ex)
    {
        throw ex;
    }
    
    return id;
    }
}
    
    



