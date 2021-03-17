package com.douglasmachado.demoacmeap.repositor;

import com.douglasmachado.demoacmeap.domain.Fatura;
import com.douglasmachado.demoacmeap.domain.Instalacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FaturaRepository extends JpaRepository<Fatura, Long> {

    public Optional<Fatura> findByCodigo(String codigo);
    public List<Fatura> findByInstalacao(Instalacao instalacao);
}
