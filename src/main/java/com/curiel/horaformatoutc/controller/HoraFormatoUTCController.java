package com.curiel.horaformatoutc.controller;

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

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/api/v1/formatofechas")
public class HoraFormatoUTCController {
   
 @Autowired
 private HoraFormatoUTCService service;
	
   @PostMapping
   @ApiOperation(value="Formato de hora",notes="Formatear la hora envia a UTC y response un json")
   @ApiResponses(value= { @ApiResponse (code=200, message="Ok")})
   public ResponseEntity<ResponseDto> formatofecha(@RequestBody RequestDto body) {
	   return new ResponseEntity<>(service.formatoHora(body),HttpStatus.OK);
	   
   }
}
