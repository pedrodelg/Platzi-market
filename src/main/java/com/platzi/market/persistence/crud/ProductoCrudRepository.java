package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

//Entre los diamantes ponemos la clase en esta caso producto y que tipo de dato es su clave primaria
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

     List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

     Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}
