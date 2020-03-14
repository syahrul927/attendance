package com.kampusku.attendance;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
@EntityScan(basePackageClasses = { 
		AttendanceApplication.class,
		Jsr310JpaConverters.class
		} )
public class AttendanceApplication {
	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Jakarta"));
	}

	public static void main(String[] args) {
		SpringApplication.run(AttendanceApplication.class, args);
	}

}
