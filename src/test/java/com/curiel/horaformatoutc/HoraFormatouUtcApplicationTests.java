package com.curiel.horaformatoutc;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.curiel.horaformatoutc.dto.RequestDto;
import com.curiel.horaformatoutc.dto.ResponseDto;
import com.curiel.horaformatoutc.service.HoraFormatoUTCService;

@SpringBootTest
class HoraFormatouUtcApplicationTests {
    
	@Autowired
	private HoraFormatoUTCService horaFormatoUTCService;
	 
	@Test
	public void FormatoFecha() {
		RequestDto reques = new RequestDto();
		reques.setTime("18:43:00");
		Long timeZOne = new Long(4);
		reques.setTimezone(timeZOne);
		ResponseDto response =  horaFormatoUTCService.formatoHora(reques);
	    Assertions.assertThat(response.getTime()).isEqualTo("22:43:00");
	}
}
