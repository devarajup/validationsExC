package com.cjss.validations.handler;

import com.cjss.validations.exception.StudentNotFoundException;
import com.cjss.validations.model.ErrorType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@ControllerAdvice
@RestControllerAdvice
public class MyExceptionHandler  {

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<ErrorType> handleStudentNotFound(StudentNotFoundException ex){
        return  new ResponseEntity<ErrorType>(
                 new ErrorType(
                         ex.getMessage(),"NOT_FOUND","STUDENT_NOT_FOUND FOR GEVEN ID","STUDENT","JDK-D"),
                HttpStatus.BAD_REQUEST);

    }

}
