package br.com.zenith.oceantech.domain;

import javax.persistence.*;

@Entity
@Table(name = "INDICADORES")
public class Indicador {
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "VALOR")
	private Double valor;

	@Column(name = "ID_RELATORIO")
	private Integer idRelatorio;

	@Column(name = "PARAMETRO")
	@Enumerated(EnumType.ORDINAL)
	private Parametro parametro;

	public Indicador() {
	}

	public Indicador(Integer id, String nome, Double valor, Integer idRelatorio, Parametro parametro) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.idRelatorio = idRelatorio;
		this.parametro = parametro;
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

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getIdRelatorio() {
		return idRelatorio;
	}

	public void setIdRelatorio(Integer idRelatorio) {
		this.idRelatorio = idRelatorio;
	}

	public Parametro getParametro() {
		return parametro;
	}

	public void setParametro(Parametro parametro) {
		this.parametro = parametro;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Indicador indicador = (Indicador) o;

		return id != null ? id.equals(indicador.id) : indicador.id == null;
	}

	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}
}
