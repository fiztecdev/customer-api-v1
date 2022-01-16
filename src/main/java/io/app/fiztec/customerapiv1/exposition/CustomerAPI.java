package io.app.fiztec.customerapiv1.exposition;

import io.app.fiztec.customerapiv1.dto.CustomerDto;
import io.app.fiztec.customerapiv1.dto.DirectionDto;
import io.app.fiztec.customerapiv1.dto.DocumentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerAPI {

    @GetMapping("/")
    public CustomerDto getCustomers(){
        CustomerDto customerDto = new CustomerDto();
        DocumentDto documentDto = new DocumentDto();
        DirectionDto directionDto = new DirectionDto();
        directionDto.setDirectionName("Enrique Barrón 1137");
        directionDto.setDirectionType("Calle");
        directionDto.setDirectionNumber("1137");
        documentDto.setDocumentType("00");
        documentDto.setDocumentNumber("77276172");
        customerDto.setName("Fidel");
        customerDto.setFatherSurname("Villanueva");
        customerDto.setMotherSurname("Delgado");
        customerDto.setDocumentDto(documentDto);
        customerDto.setDirectionDto(directionDto);
        return customerDto;
    }
}
