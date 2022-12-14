package br.com.alura.forum.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.src.main.java.br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.src.main.java.br.com.alura.forum.modelo.Topico;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {
    
    @RequestMapping("/topicos")
    public List<TopicoDto> lista() {
        Topico topico = new Topico("Dúvida", "Dúvida com Spring", new Curso("Sping", "Programação"));

        return TopicoDto.converter(Arrays.asList(topico, topico, topico));
    }

}
