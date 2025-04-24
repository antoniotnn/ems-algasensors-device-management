package com.algaworks.algasensors.device.management.api.client;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.BAD_GATEWAY)
public class SensorMonitoringClientBadGatewayException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -6203789371344330785L;
}
