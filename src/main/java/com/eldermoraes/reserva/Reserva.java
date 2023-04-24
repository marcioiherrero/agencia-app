package com.eldermoraes.reserva;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import com.eldermoraes.cliente.Cliente;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

public class Reserva extends PanacheEntity {
	
	@ManyToOne(fetch = FetchType.LAZY)
	public Cliente cliente;
	
}
