package com.sas.knowledgehub.config;

import com.sas.knowledgehub.data.constants.ErrorCode;
import com.sas.knowledgehub.data.dto.response.AppResponse;
import com.sas.knowledgehub.data.dto.response.ErrorResponse;
import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> handleValidationException(MethodArgumentNotValidException ex) {

        var errors = ex.getBindingResult().getAllErrors().stream()
            .map(it -> new ErrorResponse(ErrorCode.valueOf(it.getDefaultMessage())))
            .toList();

        return new ResponseEntity<>(
            new AppResponse<>(errors, LocalDateTime.now()),
            HttpStatus.BAD_REQUEST
        );
    }


    public static String getStackTraceAsString(Exception exception) {
        StringBuilder stackTrace = new StringBuilder();
        for (StackTraceElement stackTraceElement : exception.getStackTrace()) {
            stackTrace.append(stackTraceElement.toString());
            stackTrace.append("\n");
        }
        return stackTrace.toString();
    }
}