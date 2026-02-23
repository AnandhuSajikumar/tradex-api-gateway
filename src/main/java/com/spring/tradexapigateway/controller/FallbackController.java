package com.spring.tradexapigateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @RequestMapping("/transact")
    public ResponseEntity<Map<String, Object>> transactServiceFallback() {
        Map<String, Object> response = new HashMap<>();
        response.put("success", false);
        response.put("message", "Transaction Service is currently unavailable. Please try again later.");
        response.put("errorCode", "SERVICE_UNAVAILABLE");

        return ResponseEntity.ok(response);
    }
}
