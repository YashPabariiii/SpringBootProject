package com.SpringBootProject.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
// should be added the class which is made to handle exceptions
@ResponseStatus
//to send back the response in case of an exception

public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DepartmentNotFoundException.class)
    public ResponseEntity<ErrorMessage> departmentNotFoundException(DepartmentNotFoundException exception, WebRequest request){
        ErrorMessage message = new ErrorMessage(exception.getMessage(), HttpStatus.BAD_REQUEST);

         return ResponseEntity.status(HttpStatus.FORBIDDEN).body(message);
         // Here the status is shown on the postman request output then body is sown which is message here
    }
}