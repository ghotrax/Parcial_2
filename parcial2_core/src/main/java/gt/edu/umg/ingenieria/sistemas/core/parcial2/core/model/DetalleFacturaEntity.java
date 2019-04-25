package gt.edu.umg.ingenieria.sistemas.core.parcial2.core.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parcial2_detalle_factura")
public class DetalleFacturaEntity implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;
    
    @Column(name = "producto")
    private String product;
    
    @Column(name = "precio_unitario")
    private Double unitPrice;
    
    @Column(name = "cantidad")
    private Integer quantity;
    
    @Column(name = "cabecera_factura")
    private Long header;

    public DetalleFacturaEntity() {
    }

    public DetalleFacturaEntity(String product, Double unitPrice, Integer quantity, Long header) {
        this.product = product;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.header = header;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getHeader() {
        return header;
    }

    public void setHeader(Long header) {
        this.header = header;
    }
    
}
