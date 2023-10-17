package br.fepi.socialbooks.domain;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivrosResources {

    @GetMapping("/livros")
    public List<Livro> listar() {
        Livro livro1 = new Livro("A arte da guerra");
        Livro livro2 = new Livro("O pequeno príncipe");
        Livro livro3 = new Livro("1984");

        livro1.setAutor("Sun Tzu");

        Livro[] livros = { livro1, livro2, livro3 };
        return Arrays.asList(livros);
    }
}

