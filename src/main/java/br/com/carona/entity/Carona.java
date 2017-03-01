package br.com.carona.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import br.com.carona.view.View;

@Table(name="Carona")
@Entity
public class Carona {
	private long id;
	@JsonView(View.Summary.class)
    private long pontoInicial;
	@JsonView(View.Summary.class)
    private Time horarioDePartida;
	@JsonView(View.Summary.class)
    private Time horarioDeSaida;
	@JsonView(View.Summary.class)
    private long incialLatitude;
	@JsonView(View.Summary.class)
    private long incialLongitude;
    
	@OneToOne(targetEntity=User.class)
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
	 * @return the initial point
	 */
	public long getPontoInicial() {
		return pontoInicial;
	}
	/** Latitude do ponto inicial
	 * @param pontoInicial the pontoInicial to set
	 */
	public void setPontoInicial(long pontoInicial) {
		this.pontoInicial = pontoInicial;
	}
	/**Horário de partida
	 * @return the horarioDePartida
	 */
	public Time getHorarioDePartida() {
		return horarioDePartida;
	}
	/**Horário de partida
	 * @param horarioDePartida the horarioDePartida to set
	 */
	public void setHorarioDePartida(Time horarioDePartida) {
		this.horarioDePartida = horarioDePartida;
	}
	/**Horário de saída
	 * @return the horarioDeSaida
	 */
	public Time getHorarioDeSaida() {
		return horarioDeSaida;
	}
	/**Horário de saída
	 * @param horarioDeSaida the horarioDeSaida to set
	 */
	public void setHorarioDeSaida(Time horarioDeSaida) {
		this.horarioDeSaida = horarioDeSaida;
	}
	/** Latitude inicial
	 * @return the incialLatitude
	 */
	public long getIncialLatitude() {
		return incialLatitude;
	}
	/** Latitude inicial
	 * @param incialLatitude the incialLatitude to set
	 */
	public void setIncialLatitude(long incialLatitude) {
		this.incialLatitude = incialLatitude;
	}
	/** Longitude inicial
	 * @return the incialLongitude
	 */
	public long getIncialLongitude() {
		return incialLongitude;
	}
	/** Longitude inicial
	 * @param incialLongitude the incialLongitude to set
	 */
	public void setIncialLongitude(long incialLongitude) {
		this.incialLongitude = incialLongitude;
	}
}
