package com.iefp.Restaurante___Sistema_Reserva_Mesas.controller;

import com.iefp.Restaurante___Sistema_Reserva_Mesas.model.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ClienteController {

    private List<Cliente> clientes = new ArrayList<>();

    // Metodo
    @GetMapping("/clientes")
    public String listarClientes(Model model) {
        model.addAttribute("mensagem", "Lista de Clientes");
        model.addAttribute("lista", clientes);
        return "clientes";
    }

    @PostMapping("/clientes")
    public String adicionarClientes(@RequestParam String nome,
                                    @RequestParam String contato,
                                    @RequestParam LocalDate dataNascimento) {
        clientes.add(new Cliente(nome, contato, dataNascimento));
        return "redirect:/clientes";
    }
}
