package tn.esprit.offre_promotion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.offre_promotion.entities.Offer;
import tn.esprit.offre_promotion.service.IService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

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
    public List<Offer> getAllOffers() {
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

    @GetMapping("/roles")
    public Collection<? extends GrantedAuthority> getUserRoles(Authentication authentication) {
        return authentication.getAuthorities();
    }

    @GetMapping("/me")
    public String getAuthenticatedUser(Authentication authentication) {
        return "Vous êtes connecté en tant que : " + authentication.getName();
    }
}
