package br.com.zenith.oceantech.domain;

import javax.persistence.*;

@Entity
@Table(name = "RELATORIOS")
public class Relatorio{
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "DT")
	private String data;

	@Column(name = "ID_PORTO")
	private Integer idPorto;

	public Relatorio() {
	}

	public Relatorio(Integer id, String data, Integer idPorto) {
		this.id = id;
		this.data = data;
		this.idPorto = idPorto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getIdPorto() {
		return idPorto;
	}

	public void setIdPorto(Integer idPorto) {
		this.idPorto = idPorto;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Relatorio relatorio = (Relatorio) o;

		return id != null ? id.equals(relatorio.id) : relatorio.id == null;
	}

	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}
}
