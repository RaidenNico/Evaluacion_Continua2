package com.continua2.idat.Badajos.Rojas.Nicolas;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController("/")
public class Nombre {

    @GetMapping()
    public ResponseEntity<Object> Index() {
        Map<String, Object> im = new HashMap<>();
        im.put("Codigo", "SL72680242");
        im.put("Nombre", "Nicolas Alexis");
        return ResponseEntity.ok().body(im);
    }

    @GetMapping("/idat/codigo")
    public ResponseEntity<Object> Code() {
        Map<String, Object> im = new HashMap<>();
        im.put("Codigo", "SL72680242");
        return ResponseEntity.ok().body(im);
    }

    @GetMapping("/idat/nombre-completo")
    public ResponseEntity<Object> Name() {
        Map<String, Object> im = new HashMap<>();
        im.put("Nombre", "Badajos Rojas Nicolas Alexis");
        im.put("Codigo", "SL72680242");
        return ResponseEntity.ok().body(im);
    }
}
