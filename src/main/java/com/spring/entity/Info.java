package com.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Info {
	private long id;
	private float temperature;
	private String address;
	private String leaveTime;
	public Info(float temperature, String address, String leaveTime) {
		this.temperature = temperature;
		this.address = address;
		this.leaveTime = leaveTime;
	}
}
