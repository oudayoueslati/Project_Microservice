package tn.esprit.offre_promotion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.offre_promotion.entities.Offer;
import tn.esprit.offre_promotion.service.IService;


import java.util.Collection;
import java.util.List;

@RestController
public class ServiceContrl {

    private final IService service;

    @Autowired
    public ServiceContrl(IService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "Bienvenue sur l'API Offre Promotion 🚀";
    }

    @PostMapping("/addOffer")
    public Offer addOffer(@RequestBody Offer offer) {
        return service.addOffer(offer);
    }

    @GetMapping("/AllOffer")
    public List<Offer> getAllOffer() {
        return service.getAllOffer();
    }

    @GetMapping("/GetOffer/{id}")
    public Offer getOffer(@PathVariable int id) {
        return service.findById(id);
    }

    @DeleteMapping("/DeleteOffer/{id}")
    public void deleteOffer(@PathVariable int id) {
        service.deleteById(id);
    }

    @PutMapping("/UpdateOffer/{id}")
    public Offer updateOffer(@PathVariable int id, @RequestBody Offer offer) {
        return service.updateById(id, offer);
    }

}
