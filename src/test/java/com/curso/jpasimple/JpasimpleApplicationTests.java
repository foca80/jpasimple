package com.curso.jpasimple;

import com.curso.jpasimple.dao.ProductoRepositorio;
import com.curso.jpasimple.entidades.Producto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@DataJpaTest
@Rollback(false)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@SpringBootTest
public class JpasimpleApplicationTests {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Test
    public void contextLoads() {
    }

    @Test
    public void probarCrearEntidad() {
        Producto producto = new Producto();
        producto.setDescripcion("Leche Ideal");
        producto.setPrecio(3.0);
        Producto p = productoRepositorio.save(producto);
        Assert.notNull(p, "Ok");
    }

}
