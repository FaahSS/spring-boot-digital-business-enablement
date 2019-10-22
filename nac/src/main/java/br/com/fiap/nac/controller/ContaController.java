package br.com.fiap.nac.controller;

import br.com.fiap.nac.bean.ContaCorrente;
import br.com.fiap.nac.repository.ContaCorrenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("conta")
public class ContaController {

    @Autowired
    private ContaCorrenteRepository repository;

    @GetMapping("listar")
    public String listar(Model model) {
        model.addAttribute("contas", repository.findAll());
        return "listar";
    }

    @GetMapping("cadastrar")
    public String cadastrar(ContaCorrente conta, Model model) {
        model.addAttribute("contas", conta);
        return "cadastrar";
    }

    @PostMapping("cadastrar")
    public String processarForm(ContaCorrente conta, Model model) {
        repository.save(conta);
        model.addAttribute("contas", conta);
        return "redirect:/conta/listar";
    }
}
