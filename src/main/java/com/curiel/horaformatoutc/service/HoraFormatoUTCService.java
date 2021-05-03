package com.curiel.horaformatoutc.service;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Service;
import com.curiel.horaformatoutc.dto.RequestDto;
import com.curiel.horaformatoutc.dto.ResponseDto;

@Service
public class HoraFormatoUTCService {

	
	/**
	 * <p>Este método tiene como objetivo formatear la hora en UTC </p>
	 * @param body parametros de enttrada
	 * @return ResponseDto clase adecuado para la respuesta
	 */
	public ResponseDto formatoHora(RequestDto body) {
		ResponseDto responseHora=new ResponseDto();
		ZoneId idZona = ZoneId.of("UTC");
		LocalTime hora = LocalTime.parse(body.getTime()).plusHours(body.getTimezone());
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss").withZone(idZona);
 		String horaFormateada = hora.format(formato);
		responseHora.setTime(horaFormateada);
		responseHora.setTimezone("utc");
		 return responseHora; 
	}
}
