package br.com.fiap.nac.repository;

import br.com.fiap.nac.bean.ContaCorrente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaCorrenteRepository
        extends JpaRepository<ContaCorrente,Integer> {

}
