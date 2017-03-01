package br.com.carona.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import br.com.carona.view.View;

@Table(name="Veiculos")
@Entity
public class Veiculo {
	private long id;
	
	@JsonView(View.Summary.class)
	private String placa;
	
	@JsonView(View.Summary.class)
	private String cor;
	
	@JsonView(View.Summary.class)
	private String cidade;
	
	@JsonView(View.Summary.class)
	private String estado;
	
	@JsonView(View.Summary.class)
	@Column(name="modeloDoCarro")
	private String modelo;
	
	@JsonView(View.Summary.class)
	private String marca;
	
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	/** Id do veículo
	 * @return the id
	 */
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}
	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}
	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}
	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}
	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the User
	 */
	@JsonView(View.Summary.class)
	public User getUser() {
		return user;
	}
	/**
	 * @param User the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
    
}
