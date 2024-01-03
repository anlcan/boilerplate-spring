package com.kfzteile24.mobilebackend.dto.hello;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created on 03.01.24.
 *
 *
 */

@Getter
@Setter
@AllArgsConstructor
public class HelloRequest {

    @JsonProperty("sales_channel")
    private String salesChannel;
}
