package com.onectrm.akshare.api;

public class AkShareApiException extends RuntimeException {
    public AkShareApiException() {
    }

    public AkShareApiException(String message) {
        super(message);
    }

    public AkShareApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public AkShareApiException(Throwable cause) {
        super(cause);
    }

    public AkShareApiException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
