package com.kfzteile24.boilerplate.controller;

import com.kfzteile24.boilerplate.dto.hello.HelloRequest;
import com.kfzteile24.boilerplate.dto.hello.HelloResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.math.BigDecimal;

/**
 * Created on 03.01.24.
 *
 * a simple controller demostrating how to use some spring features at K24
 * TODO: remove this class once in your implementations
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<HelloResponse> sayHello() {
        return ResponseEntity.ok(new HelloResponse(12, BigDecimal.TEN));
    }

    @PostMapping("/hello")
    public ResponseEntity<HelloResponse> responseHello(@Valid @RequestBody HelloRequest request) {


        final HelloResponse body = new HelloResponse(request.getSalesChannel().equals("www-k24-de") ? 1 : 2,
                BigDecimal.TEN);
        return ResponseEntity.ok(body);
    }
}
