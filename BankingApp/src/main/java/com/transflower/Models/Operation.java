package com.transflower.Models;

import java.time.LocalDateTime;
import java.util.Date;

public class Operation {

    private long accountNumber;
    private String status;
    private String statusMessage;
    private String operationOn;

    public Operation() {

    }

    public Operation(long accountNumber, String status, String statusMessage, String operationOn) {
        this.accountNumber = accountNumber;
        this.status = status;
        this.statusMessage = statusMessage;
        this.operationOn = operationOn;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getOperationOn() {
        return operationOn;
    }

    public void setOperationOn(String operationOn) {
        this.operationOn = operationOn;
    }

}
