package com.bribsz.bookstore.controllers.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StandardError {
	
	private Long timestamp;
	private Integer status;
	private String error;
}
