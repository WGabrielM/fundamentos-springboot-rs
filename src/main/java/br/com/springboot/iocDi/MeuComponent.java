package br.com.springboot.iocDi;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MeuComponent {

    public String chamarMeuComponent() {
        return "Meu componente";
    }

}
