package br.com.zenith.oceantech.domain;


import org.hibernate.validator.constraints.Length;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "PORTOS")
@SequenceGenerator(name="ID_SEQ1", sequenceName="ID_SEQ1", initialValue=1, allocationSize=1)
public class Porto{
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ID_SEQ1")
	private Integer id;
	
	@Column(name = "NOME")
	@NotBlank
	@Length(min = 5, max = 70, message = "O nome deve ter no mínimo {min} e no máximo {max} caracteres")
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
