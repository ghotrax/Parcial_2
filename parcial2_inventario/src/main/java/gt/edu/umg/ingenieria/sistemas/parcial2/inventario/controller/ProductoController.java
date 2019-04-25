package gt.edu.umg.ingenieria.sistemas.parcial2.inventario.controller;

import gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model.ProductoEntity;
import gt.edu.umg.ingenieria.sistemas.parcial2.inventario.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;
    
    @GetMapping("/buscarT")
    public List<ProductoEntity> buscarT() {
        return this.productoService.buscarALL();
    }

    @GetMapping("/buscarTodos")
    public List<ProductoEntity> OrderByAlf(){
        return this.productoService.OrdenByAlf();
    }

    @PostMapping("/registrarProducto")
    public ProductoEntity RegProducto(ProductoEntity Producto){
        return  this.productoService.crear(Producto);
    }

}
