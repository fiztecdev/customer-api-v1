package io.app.fiztec.customerapiv1.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocumentDto {
    private String documentType;
    private String documentNumber;

}
