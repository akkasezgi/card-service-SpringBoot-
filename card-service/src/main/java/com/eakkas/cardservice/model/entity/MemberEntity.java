package com.eakkas.cardservice.model.entity;

import java.util.Date;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import com.eakkas.cardservice.model.enums.Gender;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "member")
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
public class MemberEntity extends BaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name", length = 40)
	private String firstName;
	
	@Column(name = "last_name", length = 40)
	private String lastName;
	
	@Column(name = "email", length = 100)
	private String email;
	
	@Column(name = "phone", length = 11)
	private String phone;

	@Column(name = "age", length = 3)
	private int age;
	
	@Column(name = "birth_date", length = 12)
	private Date birthOfDate;
	
	@Column(name = "gender")
	private Gender gender;
	
	@Column(name = "is_Active")
	private boolean isActive;
}
