package br.com.treinaweb.twgerenciadortarefas.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tar_tarefas")
public class Tarefa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tar_id")
	private long id;
	
	@Column(name = "tar_titulo", length = 50, nullable = false)
	@NotNull(message = "O título deve ser preenchido!")
	@Length(max = 50, min = 3, message = "O título deve conter entre 3 e 50 caracteres")
	private String titulo;
	
	@Column(name = "tar_descricao", length = 100, nullable = true)
	@Length(max = 100, message = "A descrição deve conter até 100 caracteres")
	private String descricao;
	
	@Column(name = "tar_data_expiracao", nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date expiracao;
	
	@Column(name = "tar_concluida", nullable = false)
	private Boolean concluida = false;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getExpiracao() {
		return expiracao;
	}

	public void setExpiracao(Date expiracao) {
		this.expiracao = expiracao;
	}

	public Boolean getConcluida() {
		return concluida;
	}

	public void setConcluida(Boolean concluida) {
		this.concluida = concluida;
	}

}
