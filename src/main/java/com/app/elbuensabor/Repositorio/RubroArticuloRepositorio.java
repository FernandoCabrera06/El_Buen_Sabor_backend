package com.app.elbuensabor.Repositorio;

import com.app.elbuensabor.Entidad.Factura;
import com.app.elbuensabor.Entidad.RubroArticulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RubroArticuloRepositorio extends JpaRepository <RubroArticulo, Integer> {

    @Query(value="SELECT * FROM rubro_articulo WHERE baja_rubro_articulo = false", nativeQuery = true)
    List<RubroArticulo> listarRubrosArticulos();

    @Query(value="SELECT * FROM rubro_articulo WHERE id_rubro_articulo = id", nativeQuery = true)
    RubroArticulo buscarPorId(@Param("id") int id);
}
