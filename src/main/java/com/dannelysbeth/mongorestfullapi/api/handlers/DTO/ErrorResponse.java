package com.dannelysbeth.mongorestfullapi.api.handlers.DTO;

import com.dannelysbeth.mongorestfullapi.exception.BusinessException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ErrorResponse {
    private int status;
    private String message;

    public ErrorResponse(BusinessException businessException) {
        this.status = businessException.getStatus();
        this.message = businessException.getMessage();
    }
}
