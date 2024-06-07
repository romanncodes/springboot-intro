package cl.ucm.clase1.demostracion1.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private int idProduct;
    private String name;
    private int price;
    private int id_category_fk;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_category_fk", referencedColumnName = "id_category", insertable = false, updatable = false)
    private CategoryEntity category;

}
