package com.app.elbuensabor.Repositorio;

import com.app.elbuensabor.Entidad.ArticuloManufacturadoDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloManufacturadoDetalleRepositorio extends JpaRepository <ArticuloManufacturadoDetalle, Integer> {

}
