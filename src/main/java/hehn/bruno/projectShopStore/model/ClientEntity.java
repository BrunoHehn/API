package hehn.bruno.projectShopStore.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name= "client")

public class ClientEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "cpf")
    private int cpf;

    @Column(name = "rg")
    private int rg;



}
