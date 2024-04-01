package com.tencent.wxcloudrun.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TestResponse {

	private Long id;
	
	private String name;
	
	private LocalDateTime createdAt;
}
