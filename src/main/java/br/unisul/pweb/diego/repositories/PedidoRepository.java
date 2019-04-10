package br.unisul.pweb.diego.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.unisul.pweb.diego.domain.Cliente;
import br.unisul.pweb.diego.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

	@Transactional(readOnly=true)
		List<Pedido> findByCliente(Cliente cliente);
	
}
