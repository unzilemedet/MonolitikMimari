package com.bilgeadam.utility;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class ServiceManager<T, ID > implements Iservice<T, ID>{

   private final JpaRepository<T, ID> repository;

    public ServiceManager(JpaRepository<T,ID> repository) {
        this.repository = repository;
    }


    @Override
    public T save(T t) {
        return repository.save(t);
    }

    @Override
    public T update(T t) {
        return repository.save(t);
    }

    @Override
    public void delete(T t) {
       repository.delete(t);
    }

    @Override
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<T> findById(ID id) {//findById optional dönüyor
        return repository.findById(id);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }
}
