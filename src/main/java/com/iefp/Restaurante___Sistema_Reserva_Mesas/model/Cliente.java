package com.iefp.Restaurante___Sistema_Reserva_Mesas.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// ---- LIVRARIAS ----
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // Variáveis
    private Long id;
    private String nome;
    private String contato;
    private LocalDate dataNascimento;
}

    /*
    // Construtor
    public Cliente(String nome, String contato, LocalDate dataNascimento) {
        this.nome = nome;
        this.contato = contato;
        this.dataNascimento = dataNascimento;
    }

    // Getters - lado direito do rato + generate + getters
    public String getNome() {
        return nome;
    }

    public String getContato() {
        return contato;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

Cliente - idCliente, nome, contacto
Reserva - idReserva, data, hora, numPessoas, estado
Mesa - idMesa, numeroMesa, capacidade, situacao
Funcionário - idFuncionario, nome, cargo
Gerente - idGerente, nome
Notificação - idNotificacao, tipo, mensagem, dataHora
 */