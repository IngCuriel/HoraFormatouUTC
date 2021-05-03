package com.curiel.horaformatoutc.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.curiel.horaformatoutc.dto.RequestDto;
import com.curiel.horaformatoutc.dto.ResponseDto;
import com.curiel.horaformatoutc.service.HoraFormatoUTCService;

@RestController
@RequestMapping(value = "/api/v1/formatofechas")
public class HoraFormatoUTCController {
   
 @Autowired
 private HoraFormatoUTCService service;
	
   @PostMapping
   public ResponseEntity<ResponseDto> formatofecha(@RequestBody RequestDto body) {
	   return new ResponseEntity<>(service.formatoHora(body),HttpStatus.OK);
	   
   }
}
