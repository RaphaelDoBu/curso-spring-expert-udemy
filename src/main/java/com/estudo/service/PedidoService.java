package com.estudo.service;

import com.estudo.domain.entity.Pedido;
import com.estudo.domain.enums.StatusPedido;
import com.estudo.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO pedidoDTO);
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
