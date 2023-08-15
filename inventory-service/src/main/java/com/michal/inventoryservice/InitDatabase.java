package com.michal.inventoryservice;

import com.michal.inventoryservice.domain.Item;
import com.michal.inventoryservice.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@RequiredArgsConstructor
public class InitDatabase {

    private final ItemRepository repository;

    @EventListener
    public void initDatabase(ApplicationReadyEvent event){
        Item i1 = new Item();
        i1.setTitle("harry potter");
        i1.setProdNo("55644");
        repository.save(i1);
    }
}
