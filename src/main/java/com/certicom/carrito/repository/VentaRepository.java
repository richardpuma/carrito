package com.certicom.carrito.repository;

import com.certicom.carrito.dto.ClienteDTO;
import com.certicom.carrito.dto.DetalleVentaDTO;
import com.certicom.carrito.dto.VentasDTO;
import com.certicom.carrito.entity.Venta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface VentaRepository extends JpaRepository<Venta,Long> {

    @Query("select new com.certicom.carrito.dto.VentasDTO(c.nombres, c.apellidos, v.fecha, v.idVenta)  " +
            "from Venta v, Cliente c " +
            "where c.idCliente = v.cliente.idCliente and v.fecha = :fecha"
    )
    List<VentasDTO> findVentasByFecha(Date fecha);

    @Query("select new com.certicom.carrito.dto.DetalleVentaDTO(p.nombre ,p.precio ,dv.cantidad)  " +
            "from DetalleVenta dv, Producto p " +
            "where dv.producto.idProducto = p.idProducto and dv.venta.idVenta = :idVenta"
    )
    List<DetalleVentaDTO> getDetalleVentaByIdVenta(Long idVenta);

    @Query("select new com.certicom.carrito.dto.ClienteDTO(c.nombres ,c.apellidos ,c.dni ,c.telefono ,c.email ,v.fecha)  " +
            "from Venta v, Cliente c " +
            "where v.cliente.idCliente = c.idCliente and v.idVenta = :idVenta"
    )
    ClienteDTO getClienteByIdVenta(Long idVenta);
}
