package br.com.zenith.oceantech.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PORTOS")
public class Porto{
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NOME")
	private String nome;

	public Porto() {
	}

	public Porto(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Porto porto = (Porto) o;

		return id != null ? id.equals(porto.id) : porto.id == null;
	}

	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}
}
