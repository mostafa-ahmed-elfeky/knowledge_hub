package com.sas.knowledgehub.data.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppResponse<T> {
    private T data;
    private Integer totalCount;


    private LocalDateTime timestamp;
    private String errorDetails;
    private List<ErrorResponse> errors;

    public AppResponse(T data) {
        this.data = data;
    }

    public AppResponse(T data, Integer totalCount) {
        this.data = data;
        this.totalCount = totalCount;
    }

    public AppResponse(List<ErrorResponse> errors, LocalDateTime timestamp, String errorDetails) {
        this.timestamp = timestamp;
        this.errorDetails = errorDetails;
        this.errors = errors;
    }

    public AppResponse(List<ErrorResponse> errors, LocalDateTime timestamp) {
        this.timestamp = timestamp;
        this.errors = errors;
    }
}