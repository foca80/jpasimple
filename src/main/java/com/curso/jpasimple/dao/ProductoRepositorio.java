package com.curso.jpasimple.dao;

import com.curso.jpasimple.entidades.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepositorio extends CrudRepository<Producto, Long> {

}
