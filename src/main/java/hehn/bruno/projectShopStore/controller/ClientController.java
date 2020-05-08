package hehn.bruno.projectShopStore.controller;

import hehn.bruno.projectShopStore.model.ClientEntity;
import hehn.bruno.projectShopStore.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    // salvando diversos funcionarios...
    //resposta da Entidade..findAll - buscar no BD todos os Funcionarios
    //retorna a lista
    @GetMapping
    public ResponseEntity<List<ClientEntity>> findAll (){  // get
        return new ResponseEntity<List<ClientEntity>>(
                (List<ClientEntity>) this.clientRepository.findAll(),
                new HttpHeaders(), HttpStatus.OK);//error 404
    }

    //buscar client
    @GetMapping(path = "/{id}")
    public ResponseEntity<ClientEntity> findById(@PathVariable ("id") long id) {
        if(this.clientRepository.findById(id).isPresent()) {
            return new ResponseEntity<ClientEntity>(
                    this.clientRepository.findById(id).get(),
                    new HttpHeaders(),
                    HttpStatus.OK);
        }
        return new ResponseEntity<ClientEntity>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<ClientEntity> cadastrar (@RequestBody ClientEntity clientEntity) {
        return new ResponseEntity<ClientEntity> (
                this.clientRepository.save(clientEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
        );
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ClientEntity> atualizar (@PathVariable("id") long id,
                                                        @RequestBody ClientEntity clientEntity) throws Exception {

        if(id == 0 || !this.clientRepository.existsById(id)){
            throw  new Exception("Código não encontrado ou inexistente!");

        }
        return new ResponseEntity<ClientEntity>(
                this.clientRepository.save(clientEntity),
                new HttpHeaders(),
                HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<ClientEntity> deletar (@PathVariable("id") long id ){
        this.clientRepository.deleteById(id);
        return new ResponseEntity<ClientEntity>(new HttpHeaders(), HttpStatus.OK);
    }


}
