package com.hoaxify.ws.error;


import org.springframework.boot.web.servlet.error.ErrorController;

public class ErrorHandler implements ErrorController {

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
