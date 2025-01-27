package org.samee.lk.doc_bucket.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/health")
public class ServiceStatus {
    @GetMapping
    public ResponseEntity<String> ServiceStatus() {

        return  new ResponseEntity<>("Server up", HttpStatus.OK);
    }
}
