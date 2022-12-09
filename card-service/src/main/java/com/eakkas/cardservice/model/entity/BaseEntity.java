package com.eakkas.cardservice.model.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@Data
@SuperBuilder
public class BaseEntity {

	@Column(name = "created_date")
	public Date createdDate;

	@Column(name = "updated_date")
	public Date updatedDate;

}
