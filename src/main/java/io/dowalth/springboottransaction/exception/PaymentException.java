package io.dowalth.springboottransaction.exception;

public class PaymentException extends RuntimeException{

    public PaymentException(String message){
        super(message);
    }
}
