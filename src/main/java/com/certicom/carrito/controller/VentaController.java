package com.certicom.carrito.controller;


import com.certicom.carrito.dto.ClienteDTO;
import com.certicom.carrito.dto.DetalleVentaDTO;
import com.certicom.carrito.dto.VentasDTO;
import com.certicom.carrito.dto.response.GenericResponse;
import com.certicom.carrito.service.VentaService;
import com.certicom.carrito.util.Constantes;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "api/v1/venta")
@Tag(name = "Venta")
public class VentaController {
    @Autowired
    private VentaService ventaService;

    @Operation(summary = "Obtiene las ventas realizadas en una determinada fecha")
    @GetMapping("/fecha/{fecha}")
    public ResponseEntity<GenericResponse> getVentasByFecha(@PathVariable("fecha") String fecha) {
        GenericResponse response = new GenericResponse();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try {
            //2023-07-01
            java.util.Date date = sdf.parse(fecha);
            Date fechaDate = new Date(date.getTime());
            List<VentasDTO> resultado = ventaService.getVentasByFecha(fechaDate);
            response.setStatus(Constantes.OPERACION_CORRECTA);
            response.setData(resultado);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch (ParseException e) {
            //throw new RuntimeException(e);
            response.setStatus(Constantes.OPERACION_INCORRECTA);
            response.setMessage(e.getMessage());
            response.setData(null);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch (Exception e) {
            //e.printStackTrace();
            response.setStatus(Constantes.OPERACION_INCORRECTA);
            response.setMessage("No se puedo efectuar la operación solicitada.");
            response.setData(null);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
    }

    @Operation(summary = "Obtiene el detalle de ventas de una determinada factura")
    @GetMapping("/detalleVenta/{idVenta}")
    public ResponseEntity<GenericResponse> getDetalleVentaByIdVenta(@PathVariable("idVenta") Long idVenta) {
        GenericResponse response = new GenericResponse();
        try{
            List<DetalleVentaDTO> resultado = ventaService.getDetalleVentaByIdVenta(idVenta);
            response.setStatus(Constantes.OPERACION_CORRECTA);
            response.setData(resultado);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch (Exception e) {
            //e.printStackTrace();
            response.setStatus(Constantes.OPERACION_INCORRECTA);
            response.setMessage("No se puedo efectuar la operación solicitada.");
            response.setData(null);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
    }

    @Operation(summary = "Obtiene los datos del cliente que realizó la compra de una determinada factura")
    @GetMapping("/{idVenta}/cliente")
    public ResponseEntity<GenericResponse> getClienteByIdVenta(@PathVariable("idVenta") Long idVenta) {
        GenericResponse response = new GenericResponse();
        try{
            ClienteDTO resultado = ventaService.getClienteByIdVenta(idVenta);
            response.setStatus(Constantes.OPERACION_CORRECTA);
            response.setData(resultado);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch (Exception e) {
            //e.printStackTrace();
            response.setStatus(Constantes.OPERACION_INCORRECTA);
            response.setMessage("No se puedo efectuar la operación solicitada.");
            response.setData(null);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
    }
}
