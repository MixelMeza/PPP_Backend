package pe.edu.upeu.pracway.Pracway.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.edu.upeu.pracway.Pracway.entity.Proceso_Requisito;
import pe.edu.upeu.pracway.Pracway.service.Proceso_RequisitoService;

@RestController
@RequestMapping("/api/proceso_requisito")
public class Proceso_RequisitoController {

    @Autowired
    private Proceso_RequisitoService procesoRequisitoService;

    @GetMapping
    public ResponseEntity<List<Proceso_Requisito>> readAll() {
        try {
            List<Proceso_Requisito> procesos = procesoRequisitoService.readAll();
            if (procesos.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(procesos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Proceso_Requisito> crear(@Valid @RequestBody Proceso_Requisito proceso) {
        try {
            Proceso_Requisito p = procesoRequisitoService.create(proceso);
            return new ResponseEntity<>(p, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proceso_Requisito> getProcesoRequisitoById(@PathVariable("id") Long id) {
        try {
            Optional<Proceso_Requisito> proceso = procesoRequisitoService.read(id);
            if (proceso.isPresent()) {
                return new ResponseEntity<>(proceso.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProcesoRequisito(@PathVariable("id") Long id) {
        try {
            procesoRequisitoService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateProcesoRequisito(@PathVariable("id") Long id, @Valid @RequestBody Proceso_Requisito proceso) {
        Optional<Proceso_Requisito> p = procesoRequisitoService.read(id);
        if (p.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(procesoRequisitoService.update(proceso), HttpStatus.OK);
        }
    }
}
