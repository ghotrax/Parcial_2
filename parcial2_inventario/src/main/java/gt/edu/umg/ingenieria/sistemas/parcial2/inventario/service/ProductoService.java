package gt.edu.umg.ingenieria.sistemas.parcial2.inventario.service;

import gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model.ProductoEntity;
import gt.edu.umg.ingenieria.sistemas.parcial2.inventario.dao.ProductoRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    
    public List<ProductoEntity> buscarALL() {

        return (List<ProductoEntity>) this.productoRepository.findAll();
    }

    public List<ProductoEntity> OrdenByAlf() {

        List<ProductoEntity> productoT = buscarALL();
        List<ProductoEntity> result = new ArrayList<>();

        productoT.sort(Comparator.comparing(ProductoEntity::getName));

        for (ProductoEntity a:productoT){

            result.add(a);
        }
        return result;
    }
    public ProductoEntity crear(ProductoEntity _producto) {
        return this.productoRepository.save(_producto);
    }
    
}
