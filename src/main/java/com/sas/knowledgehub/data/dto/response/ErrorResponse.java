package com.sas.knowledgehub.data.dto.response;

import com.sas.knowledgehub.data.constants.ErrorCode;
import lombok.Data;

@Data
public class ErrorResponse {

    private String code;
    private String message;

    public ErrorResponse(ErrorCode code) {
        this.code = code.name();
        this.message = code.getMessage();
    }
}