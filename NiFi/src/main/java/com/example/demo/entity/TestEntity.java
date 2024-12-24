package com.example.demo.entity;
import java.sql.Timestamp;

import lombok.Data;

@Data
public class TestEntity {
	
	private Long id;
	private String name;
	private Timestamp createdAt;
	
}
