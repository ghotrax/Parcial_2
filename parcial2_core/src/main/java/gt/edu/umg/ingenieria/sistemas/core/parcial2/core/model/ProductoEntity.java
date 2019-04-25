package gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parcial2_producto")
public class ProductoEntity implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    
    @Column(name = "nombre")
    private String name;
    
    @Column(name = "descripcion")
    private String description;
    
    @Column(name = "stock")
    private Integer stock;
    
    @Column(name = "precio_unitario")
    private Double unit_price;

    public ProductoEntity() {
    }

    public ProductoEntity(String name, String description, Integer stock, Double unit_price) {
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.unit_price = unit_price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Double unit_price) {
        this.unit_price = unit_price;
    }

    
    
}
