package com.app.elbuensabor.Entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DetallePromo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetallePromo;

    //RELACIONES
    @OneToOne
    @JoinColumn(name="idArticuloInsumo", referencedColumnName = "idArticuloInsumo")
    private ArticuloInsumo articuloInsumo;
    @OneToOne
    @JoinColumn(name="idArticuloManufacturado", referencedColumnName = "idArticuloManufacturado")
    private ArticuloManufacturado articuloManufacturado;
    @ManyToOne
    @JoinColumn(name="idPromo", referencedColumnName = "idPromo")
    private Promo promo;
}
