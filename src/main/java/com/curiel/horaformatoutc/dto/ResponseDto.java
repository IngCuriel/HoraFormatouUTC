package com.curiel.horaformatoutc.dto;

import java.io.Serializable;
import lombok.Data;

@Data
public class ResponseDto implements Serializable {
   /**
	 * 
	*/
  private static final long serialVersionUID = 1L;
  private String time;
  private String timezone;
}
