package com.crud.demo.modeloDAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.modelo.Category;
import com.crud.demo.modelo.Noticia;

@Repository
public interface INoticia extends JpaRepository<Noticia, Integer>{
    public List<Category> findByCategoria(String categoria);

}
