package com.spring.tradexapigateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    private ResponseEntity<Map<String, Object>> buildFallbackResponse(String serviceName) {
        Map<String, Object> response = new HashMap<>();
        response.put("success", false);
        response.put("message", serviceName + " Service is currently unavailable. Please try again later.");
        response.put("errorCode", "SERVICE_UNAVAILABLE");

        return ResponseEntity.ok(response);
    }

    @RequestMapping("/transact")
    public ResponseEntity<Map<String, Object>> transactServiceFallback() {
        return buildFallbackResponse("Transaction");
    }

    @RequestMapping("/portfolio")
    public ResponseEntity<Map<String, Object>> portfolioServiceFallback() {
        return buildFallbackResponse("Portfolio");
    }

    @RequestMapping("/identity")
    public ResponseEntity<Map<String, Object>> identityServiceFallback() {
        return buildFallbackResponse("Identity");
    }

    @RequestMapping("/market")
    public ResponseEntity<Map<String, Object>> marketServiceFallback() {
        return buildFallbackResponse("Market");
    }
}
