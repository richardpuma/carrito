package com.certicom.carrito.service;


import com.certicom.carrito.dto.ClienteDTO;
import com.certicom.carrito.dto.DetalleVentaDTO;
import com.certicom.carrito.dto.VentasDTO;
import com.certicom.carrito.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@Service
public class VentaService {
    @Autowired
    VentaRepository ventaRepository;

    public List<VentasDTO> getVentasByFecha(Date fecha){
        return ventaRepository.findVentasByFecha(fecha);
    }

    public List<DetalleVentaDTO> getDetalleVentaByIdVenta(Long idVenta){
        return ventaRepository.getDetalleVentaByIdVenta(idVenta);
    }

    public ClienteDTO getClienteByIdVenta(Long idVenta){
        return ventaRepository.getClienteByIdVenta(idVenta);
    }
}
