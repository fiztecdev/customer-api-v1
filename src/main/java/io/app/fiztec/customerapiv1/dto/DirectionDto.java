package io.app.fiztec.customerapiv1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DirectionDto {
    private String directionName;
    private String directionNumber;
    private String directionType;
}
