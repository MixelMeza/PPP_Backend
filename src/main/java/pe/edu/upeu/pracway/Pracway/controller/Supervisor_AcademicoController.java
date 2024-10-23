package pe.edu.upeu.pracway.Pracway.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.edu.upeu.pracway.Pracway.entity.Supervisor_Academico;
import pe.edu.upeu.pracway.Pracway.service.Supervisor_AcademicoService;

@RestController
@RequestMapping("/api/supervisores_academicos")
@CrossOrigin(origins = "http://localhost:3000")
public class Supervisor_AcademicoController {

    @Autowired
    private Supervisor_AcademicoService supervisorAcademicoService;

    @GetMapping
    public ResponseEntity<List<Supervisor_Academico>> readAll() {
        try {
            List<Supervisor_Academico> supervisores = supervisorAcademicoService.readAll();
            if (supervisores.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(supervisores, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Supervisor_Academico> crear(@Valid @RequestBody Supervisor_Academico supervisor) {
        try {
            Supervisor_Academico s = supervisorAcademicoService.create(supervisor);
            return new ResponseEntity<>(s, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Supervisor_Academico> getSupervisorById(@PathVariable("id") Long id) {
        try {
            Supervisor_Academico s = supervisorAcademicoService.read(id).get();
            return new ResponseEntity<>(s, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Supervisor_Academico> delSupervisor(@PathVariable("id") Long id) {
        try {
            supervisorAcademicoService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateSupervisor(@PathVariable("id") Long id, @Valid @RequestBody Supervisor_Academico supervisor) {
        Optional<Supervisor_Academico> existingSupervisor = supervisorAcademicoService.read(id);
        if (existingSupervisor.isPresent()) {
            supervisor.setId(id); 
            return new ResponseEntity<>(supervisorAcademicoService.update(supervisor), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
