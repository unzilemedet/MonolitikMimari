package com.bilgeadam.utility;

import java.util.List;
import java.util.Optional;

public interface Iservice <T,ID>{
    T save (T t);
    T update(T t);
    void delete(T t);
    void deleteById(ID id);
   Optional<T>  findById(ID id);
    List<T> findAll();
}
