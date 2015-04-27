package org.sistcoop.credito.models.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "AVAL", indexes = { @Index(columnList = "id") })
public class Aval {

	private static final long serialVersionUID = 1L;
	
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}