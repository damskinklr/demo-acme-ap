package com.douglasmachado.demoacmeap.repositor;

import com.douglasmachado.demoacmeap.domain.Cliente;
import com.douglasmachado.demoacmeap.domain.Instalacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InstalacaoRepository extends JpaRepository<Instalacao, Long> {

    public Optional<Instalacao> findByCodigo(String codigo);
    public List<Instalacao> findByCliente(Cliente cliente);
}
