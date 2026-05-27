package com.example.diariotreino.controller;

import com.example.diariotreino.model.FichaTreino;
import com.example.diariotreino.model.Usuario;
import com.example.diariotreino.repository.FichaTreinoRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FichaTreinoController {

    @Autowired
    private FichaTreinoRepository repository;

    @GetMapping("/nova-ficha")
    public String abrirTelaNovaFicha(HttpSession session) {
        Usuario usuarioLogado = (Usuario) session.getAttribute("usuarioLogado");
        if (usuarioLogado == null) {
            return "redirect:/";
        }
        if ("ADMIN".equals(usuarioLogado.getPerfil())) {
            return "redirect:/admin/nova-ficha";
        }
        return "redirect:/painel";
    }

    @PostMapping("/salvar-ficha")
    public String salvarFicha(@RequestParam String nomeTreino, HttpSession session) {
        Usuario usuarioLogado = (Usuario) session.getAttribute("usuarioLogado");

        if (usuarioLogado == null) {
            return "redirect:/";
        }

        if (!"ADMIN".equals(usuarioLogado.getPerfil())) {
            return "redirect:/painel";
        }

        FichaTreino novaFicha = new FichaTreino(nomeTreino, usuarioLogado);
        repository.save(novaFicha);

        return "redirect:/painel";
    }
}
