package com.example.diariotreino.controller;

import com.example.diariotreino.model.Exercicio;
import com.example.diariotreino.model.FichaTreino;
import com.example.diariotreino.model.Usuario;
import com.example.diariotreino.repository.ExercicioRepository;
import com.example.diariotreino.repository.FichaTreinoRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ExercicioController {

    @Autowired
    private ExercicioRepository exercicioRepository;

    @Autowired
    private FichaTreinoRepository fichaTreinoRepository;

    // ==========================================
    // VISUALIZAR EXERCÍCIOS DA FICHA
    // ==========================================

    @GetMapping("/ficha/{id}")
    public String visualizarFicha(@PathVariable Long id, HttpSession session, Model model) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null) {
            return "redirect:/";
        }

        Optional<FichaTreino> ficha = fichaTreinoRepository.findById(id);
        if (ficha.isPresent()) {
            // Verifica se é o dono da ficha ou se é ADMIN
            if ("ADMIN".equals(logado.getPerfil()) || ficha.get().getUsuario().getId().equals(logado.getId())) {
                model.addAttribute("ficha", ficha.get());
                model.addAttribute("exercicios", exercicioRepository.findByFichaId(id));
                return "ficha-detalhes";
            }
        }
        return "redirect:/painel";
    }

    // ==========================================
    // ADICIONAR EXERCÍCIO - ABRIR FORMULÁRIO
    // ==========================================

    @GetMapping("/ficha/{id}/novo-exercicio")
    public String abrirTelaNovoExercicio(@PathVariable Long id, HttpSession session, Model model) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null) {
            return "redirect:/";
        }

        // Apenas ADMIN pode adicionar exercícios
        if (!"ADMIN".equals(logado.getPerfil())) {
            return "redirect:/painel";
        }

        Optional<FichaTreino> ficha = fichaTreinoRepository.findById(id);
        if (ficha.isPresent()) {
            model.addAttribute("ficha", ficha.get());
            return "novo-exercicio";
        }
        return "redirect:/painel";
    }

    // ==========================================
    // SALVAR NOVO EXERCÍCIO
    // ==========================================

    @PostMapping("/ficha/{id}/salvar-exercicio")
    public String salvarExercicio(
            @PathVariable Long id,
            @RequestParam String nomeExercicio,
            @RequestParam Integer series,
            @RequestParam Integer repeticoes,
            @RequestParam String peso,
            @RequestParam(required = false) String descanso,
            @RequestParam(required = false) String observacoes,
            HttpSession session) {

        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null) {
            return "redirect:/";
        }

        // Apenas ADMIN pode adicionar exercícios
        if (!"ADMIN".equals(logado.getPerfil())) {
            return "redirect:/painel";
        }

        Optional<FichaTreino> ficha = fichaTreinoRepository.findById(id);
        if (ficha.isPresent()) {
            Exercicio novoExercicio = new Exercicio(nomeExercicio, series, repeticoes, peso, ficha.get());
            novoExercicio.setDescanso(descanso);
            novoExercicio.setObservacoes(observacoes);
            exercicioRepository.save(novoExercicio);
            return "redirect:/ficha/" + id;
        }
        return "redirect:/painel";
    }

    // ==========================================
    // EDITAR EXERCÍCIO - ABRIR FORMULÁRIO
    // ==========================================

    @GetMapping("/exercicio/{id}/editar")
    public String abrirTelaEditarExercicio(@PathVariable Long id, HttpSession session, Model model) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null) {
            return "redirect:/";
        }

        // Apenas ADMIN pode editar exercícios
        if (!"ADMIN".equals(logado.getPerfil())) {
            return "redirect:/painel";
        }

        Optional<Exercicio> exercicio = exercicioRepository.findById(id);
        if (exercicio.isPresent()) {
            FichaTreino ficha = exercicio.get().getFicha();
            model.addAttribute("exercicio", exercicio.get());
            model.addAttribute("ficha", ficha);
            return "editar-exercicio";
        }
        return "redirect:/painel";
    }

    // ==========================================
    // ATUALIZAR EXERCÍCIO
    // ==========================================

    @PostMapping("/exercicio/{id}/atualizar")
    public String atualizarExercicio(
            @PathVariable Long id,
            @RequestParam String nomeExercicio,
            @RequestParam Integer series,
            @RequestParam Integer repeticoes,
            @RequestParam String peso,
            @RequestParam(required = false) String descanso,
            @RequestParam(required = false) String observacoes,
            HttpSession session) {

        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null) {
            return "redirect:/";
        }

        // Apenas ADMIN pode atualizar exercícios
        if (!"ADMIN".equals(logado.getPerfil())) {
            return "redirect:/painel";
        }

        Optional<Exercicio> exercicio = exercicioRepository.findById(id);
        if (exercicio.isPresent()) {
            FichaTreino ficha = exercicio.get().getFicha();
            exercicio.get().setNomeExercicio(nomeExercicio);
            exercicio.get().setSeries(series);
            exercicio.get().setRepeticoes(repeticoes);
            exercicio.get().setPeso(peso);
            exercicio.get().setDescanso(descanso);
            exercicio.get().setObservacoes(observacoes);
            exercicioRepository.save(exercicio.get());
            return "redirect:/ficha/" + ficha.getId();
        }
        return "redirect:/painel";
    }

    // ==========================================
    // DELETAR EXERCÍCIO
    // ==========================================

    @PostMapping("/exercicio/{id}/excluir")
    public String excluirExercicio(@PathVariable Long id, HttpSession session) {
        Usuario logado = (Usuario) session.getAttribute("usuarioLogado");
        if (logado == null) {
            return "redirect:/";
        }

        // Apenas ADMIN pode deletar exercícios
        if (!"ADMIN".equals(logado.getPerfil())) {
            return "redirect:/painel";
        }

        Optional<Exercicio> exercicio = exercicioRepository.findById(id);
        if (exercicio.isPresent()) {
            FichaTreino ficha = exercicio.get().getFicha();
            Long fichaId = ficha.getId();
            exercicioRepository.deleteById(id);
            return "redirect:/ficha/" + fichaId;
        }
        return "redirect:/painel";
    }
}
