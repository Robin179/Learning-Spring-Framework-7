package com.prajjwal.springboot.myfirstwebapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class SayHelloController {
    //http://localhost:8080/say-hello

    @RequestMapping("say-hello")
    @ResponseBody                           // this annotation will make the webbrowser to show the string as written in the return statement
    public String sayHello(){               // else webpage shows an error page, as Spring require what is called a 'View'
                                            //in which a particular entity is shown on a webpage
        return "Hey there!";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHTML(){ //this method will show an HTML page on the web-browser
        return """
                <html>
                    <head>
                                
                    </head>
                    <body>
                        This my firat html page
                    </body>
                </html>
                """;
    }

    @RequestMapping("say-hello-JSP")
    @ResponseBody
    public String sayHelloJSP(){
        return "sayHelloJSP";
    }

    @RequestMapping("login")
    @ResponseBody
    public String login(){
        return "logged INNN!!!";
    }



}
