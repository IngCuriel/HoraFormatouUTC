package com.curiel.horaformatoutc.dto;

import java.io.Serializable;
import lombok.Data;

@Data
public class RequestDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String time;
	private Long timezone;
}
