package com.estudo;

import com.estudo.domain.entity.Cliente;
import com.estudo.domain.entity.Pedido;
import com.estudo.domain.repository.Clientes;
import com.estudo.domain.repository.ClientesRepo;
import com.estudo.domain.repository.Pedidos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class VendasApplication extends SpringBootServletInitializer {

//    @Bean
//    public CommandLineRunner init(@Autowired ClientesRepo clientes){
//        return args -> {
//            Cliente c = new Cliente(null, "Fulano");
//            clientes.save(c);
//        };
//    }

//    @Bean
//    public CommandLineRunner init(@Autowired ClientesRepo clientes,
//                                  @Autowired Pedidos pedidos){
//        return args -> {
//
//            Cliente cliente = new Cliente();
//            cliente.setNome("Raphael");
//            clientes.save(cliente);
//
//            Cliente cliente1 = new Cliente();
//            cliente1.setNome("Raphael2");
//            clientes.save(cliente1);
//
//            Pedido p = new Pedido();
//            p.setCliente(cliente);
//            p.setDataPedido(LocalDate.now());
//            p.setTotal(BigDecimal.valueOf(100));
//            pedidos.save(p);
//
//            Cliente clientePedido = clientes.findClienteFetchPedidos(cliente.getId());
//            System.out.println(clientePedido);
//            System.out.println(clientePedido.getPedidos());
//
//            pedidos.findByCliente(cliente).forEach(System.out::println);

//            List<Cliente> result = clientes.encontrarPorNome("Raphael2");
//            result.forEach(System.out::println);
//            boolean exists = clientes.existsByNome("Raphael2");
//            System.out.println("Nome existe? " + exists);
//            List<Cliente> todosClientes = clientes.findAll();
//            todosClientes.forEach(System.out::println);
//
//            System.out.println("Atualizando Clientes");
//            todosClientes.forEach(c->{
//                c.setNome(c.getNome() + " atualizado");
//                clientes.save(c);
//            });

//            todosClientes = clientes.findAll();
//            todosClientes.forEach(System.out::println);
//
//            System.out.println("Buscando Clientes");
//            clientes.findByNomeLike("2").forEach(System.out::println);
//
//            System.out.println("Deletando Clientes");
//            clientes.findAll().forEach(c ->{
//                clientes.delete(c);
//            });
//
//            todosClientes = clientes.findAll();
//            if(todosClientes.isEmpty()){
//                System.out.println("Nenhum cliente encontrado");
//            } else{
//                todosClientes.forEach(System.out::println);
//            }

            //JDBCTemplate
//            Cliente cliente = new Cliente();
//            cliente.setNome("Raphael");
//            clientes.salvar(cliente);
//
//            Cliente cliente1 = new Cliente();
//            cliente1.setNome("Raphael2");
//            clientes.salvar(cliente1);
//
//            List<Cliente> todosClientes = clientes.obterTodos();
//            todosClientes.forEach(System.out::println);
//
//            todosClientes.forEach(c->{
//                c.setNome(c.getNome() + " atualizado");
//                clientes.atualizar(c);
//            });
//            clientes.buscarPorNome("2").forEach(System.out::println);
//
//            clientes.obterTodos().forEach(c ->{
//                clientes.deletar(c);
//            });
//
//            todosClientes = clientes.obterTodos();
//            if(todosClientes.isEmpty()){
//                System.out.println("Nenhum cliente encontrado");
//            } else{
//                todosClientes.forEach(System.out::println);
//            }
//        };
//    }

    public static void main(String[] args){
        SpringApplication.run(VendasApplication.class, args);
    }
}
