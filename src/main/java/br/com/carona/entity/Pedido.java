package br.com.carona.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import br.com.carona.view.View;

@Entity
@Table(name ="Pedidos")
public class Pedido {
	private long id;
	
	@JsonView(View.Summary.class)
	@JoinColumn(name="user_id")
	private User user;
	
	@JsonView(View.Summary.class)
	@OneToOne
	@JoinColumn(name="carona_id")
	private Carona carona;
	@JsonView(View.Summary.class)
	private int aceito;
	
	@JsonView(View.Summary.class)
	private Date created;
    
	/** Id do pedido
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
	 * @return the idUser
	 */
	public User getIdUser() {
		return user;
	}
	/**
	 * @param idUser the idUser to set
	 */
	public void setIdUser(User user) {
		this.user = user;
	}
	/**
	 * @return the idCarona
	 */
	public Carona getCarona() {
		return carona;
	}
	/**
	 * @param idCarona the idCarona to set
	 */
	public void setCarona(Carona carona) {
		this.carona = carona;
	}
	/**
	 * @return the aceito
	 */
	public int getAceito() {
		return aceito;
	}
	/**
	 * @param aceito the aceito to set
	 */
	public void setAceito(int aceito) {
		this.aceito = aceito;
	}
	/**
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}
	/**
	 * @param created the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}
	
}
