package com.michal.inventoryservice.api;

import com.michal.inventoryservice.domain.Item;
import com.michal.inventoryservice.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping(path = "/items")
public class ItemController {

    private final ItemRepository repository;

    @PostMapping("/new")
    ResponseEntity<Void> saveItem(Item item){
        repository.save(item);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    ResponseEntity<Item> getItem(Long id){
        return ResponseEntity.status(HttpStatus.OK).body(repository.getReferenceById(id));
    }
}
