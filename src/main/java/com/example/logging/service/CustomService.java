package com.example.logging.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomService {

    public void log() {
        log.trace("Entering {} method", "CustomerService.log()");
        log.debug("Starting treatment");
        log.info("No args passed to service");
        log.warn("Please use this method to start treatment");
        log.error("ERROR: this method is unuseful");
    }
}
