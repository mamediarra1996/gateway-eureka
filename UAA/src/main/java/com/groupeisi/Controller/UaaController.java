package com.groupeisi.Controller;

import com.groupeisi.Entity.Uaa;
import com.groupeisi.Service.UaaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/uaa")
@AllArgsConstructor
public class UaaController {
    private UaaService uaaService;

    @GetMapping("/allo")
    public List<Uaa> getAll() {
        return uaaService.getAll();
    }

    @GetMapping("{id}")
    public Optional<Uaa> getUaa(@PathVariable("id") Long id) {
        return uaaService.getUaa(id);
    }

}
