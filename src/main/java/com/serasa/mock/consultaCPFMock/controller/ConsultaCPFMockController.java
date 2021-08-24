package com.serasa.mock.consultaCPFMock.controller;

import com.serasa.mock.consultaCPFMock.domain.CPFMock;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
        "/ConsultaCPFMock"
)
public class ConsultaCPFMockController {

    @GetMapping(
            path = "{id}"
    )
    public ResponseEntity<CPFMock> getScore(@PathVariable("id") long cpf){
        CPFMock cpfMock = new CPFMock(cpf, (long) (Math.random()*100L));
        return ResponseEntity.ok(cpfMock);
    }
}
