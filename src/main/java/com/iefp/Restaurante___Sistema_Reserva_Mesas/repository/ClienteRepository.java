package com.iefp.Restaurante___Sistema_Reserva_Mesas.repository;

import com.iefp.Restaurante___Sistema_Reserva_Mesas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
