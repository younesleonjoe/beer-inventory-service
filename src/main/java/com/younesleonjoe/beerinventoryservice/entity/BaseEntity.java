package com.younesleonjoe.beerinventoryservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.type.SqlTypes;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(columnDefinition = "varchar(36)", updatable = false)
	@JdbcTypeCode(SqlTypes.VARCHAR)
	private UUID id;
	
	@Version private Long version;
	
	@CreationTimestamp
	@Column(updatable = false)
	private Timestamp createdAt;
	
	@UpdateTimestamp
	private Timestamp updatedAt;
	
	public boolean isNew() {
		return this.id == null;
	}
}
