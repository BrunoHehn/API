package hehn.bruno.projectShopStore.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name= "product")

public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private long id;

    @Column(name = "name_product")
    private String name_product;

    @Column(name = "price")
    private float price;

    @Column(name = "categories")
    private String categories;

}
