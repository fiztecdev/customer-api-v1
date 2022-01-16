package io.app.fiztec.customerapiv1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;


@Getter
@Setter
public class CustomerDto {

    private String name;
    private String fatherSurname;
    private String motherSurname;
    @JsonProperty("document")
    private DocumentDto documentDto;
    private String email;
    private String cellphoneNumber;
    @JsonProperty("direction")
    private DirectionDto directionDto;
}
