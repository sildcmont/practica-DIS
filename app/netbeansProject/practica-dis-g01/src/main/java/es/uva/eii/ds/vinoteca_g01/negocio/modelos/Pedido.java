/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uva.eii.ds.vinoteca_g01.negocio.modelos;

import es.uva.eii.ds.vinoteca_g01.persistencia.daos.DAOPedido;
import java.io.StringReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonReaderFactory;
import javax.json.JsonValue;

/**
 * Clase que representa un pedido identificado por un numero
 * 
 * @author ricalba
 * @author silmont
 * @author marrobl
 */
public class Pedido {
    private int numero;
    private EstadoPedido estado;
    private LocalDate fechaRealizacion;
    private String notaEntrega;
    private double importe;
    private LocalDate fechaRecepcion;
    private LocalDate fechaEntrega;
    private int numeroFactura;
    private int numeroAbonado;
    
    /**
     * Crea una instancia de pedido
     * 
     * @param numero identificador del pedido
     * @param estado estado en el que se encuentra el pedido
     * @param fechaRealizacion fecha de realizacion del pedido
     * @param notaEntrega nota adjunta
     * @param importe importe
     * @param fechaRecepcion fecha de recepcion
     * @param fechaEntrega fecha de entrega
     * @param numeroFactura numero de la factura asociada
     * @param numeroAbonado numero del abonado asociado
     */
    public Pedido(int numero, EstadoPedido estado, LocalDate fechaRealizacion, String notaEntrega, double importe, LocalDate fechaRecepcion, LocalDate fechaEntrega, int numeroFactura, int numeroAbonado){
        this.numero = numero;
        this.estado = estado;
        this.fechaRealizacion = fechaRealizacion;
        this.notaEntrega = notaEntrega;
        this.importe = importe;
        this.fechaRecepcion = fechaRecepcion;
        this.fechaEntrega = fechaEntrega;
        this.numeroFactura = numeroFactura;
        this.numeroAbonado = numeroAbonado;
        
    }
    
    /**
     * Crea una instancia de pedido a partir de un String Json
     * @param datosJSON datos del pedido
     */
    public Pedido(String datosJSON){
        JsonReaderFactory factory = Json.createReaderFactory(null);
        JsonReader reader = factory.createReader(new StringReader(datosJSON));
        JsonObject pedidoJSON = reader.readObject();
        
        this.numero = Integer.parseInt(pedidoJSON.getJsonString("numero").getString());
        this.estado = EstadoPedido.values()[Integer.parseInt(pedidoJSON.getJsonString("estado").getString())-1];  
        this.fechaRealizacion = LocalDate.parse(pedidoJSON.getJsonString("fechaRealizacion").getString());
        this.notaEntrega = pedidoJSON.getJsonString("notaEntrega").getString();
        this.importe = Double.parseDouble(pedidoJSON.getJsonString("importe").getString());
        this.fechaRecepcion = LocalDate.parse(pedidoJSON.getJsonString("fechaRecepcion").getString());        
        this.fechaEntrega = LocalDate.parse(pedidoJSON.getJsonString("fechaEntrega").getString());
        this.numeroFactura = Integer.parseInt(pedidoJSON.getJsonString("numeroFactura").getString());
        this.numeroAbonado = Integer.parseInt(pedidoJSON.getJsonString("numeroAbonado").getString());
    }
    
    /**
     * Consulta el numero del pedido
     * 
     * @return numero
     */
    public int getNumero(){
        return this.numero;
    }
    
    /**
     * Consulta el estado de un pedido
     * pudiendo ser pendiente, tramitado, completado,
     * servido, facturado o pagado
     * @return estado del pedido
     */
    public EstadoPedido getEstado(){
        return this.estado;
    }
    
    /**
     * Consulta la fecha de realizacion del pedido
     * @return fecha de realizacion
     */
    public LocalDate getFechaRealizacion(){
        return this.fechaRealizacion;
    }
    
    /**
     * Consulta la nota de entrega adjuntada al pedido
     * @return nota entrega 
     */
    public String getNotaEntrega(){
        return this.notaEntrega;
    }
    
    /**
     * Consulta el importe del pedido
     * @return importe
     */
    public double getImporte(){
        return this.importe;
    }
    
    /**
     * Consulta la fecha de recepcion
     * @return fecha recepcion
     */
    public LocalDate getFechaRecepcion(){
        return this.fechaRecepcion;
    }
   
    /**
     * Consulta la fecha de entrega
     * @return fecha entrega
     */
    public LocalDate getFechaEntrega(){
        return this.fechaEntrega;
    }
    
    /**
     * Consulta el identificador de la factura asociada 
     * @return numero factura
     */
    public int getNumeroFactura(){
        return this.numeroFactura;
    }
    
    /**
     * Consulta el identificador del abonado asociado
     * @return numero de abonado
     */
    public int getNumeroAbonado(){
        return this.numeroAbonado;
    }
    
    /**
     * Devuelve una lista de pedidos asociados a un identificador de factura
     * @param numeroFactura identificador de la factura
     * @return lista de pedidos asociados
     */
    public static ArrayList<Pedido> getPedidosNumFactura(int numeroFactura) {
       String pedidosJSON = DAOPedido.consultaPedidosNumFactura(numeroFactura);
       ArrayList<Pedido> pedidos = new ArrayList<>();
       JsonReaderFactory factory = Json.createReaderFactory(null);
       try{
            JsonReader reader = factory.createReader(new StringReader(pedidosJSON));
            JsonObject pedidosJson = reader.readObject();
            JsonArray pedJson = pedidosJson.getJsonArray("pedidos");

            Pedido pedido;

            for (JsonValue j: pedJson) {
                    pedido = new Pedido(j.asJsonObject().toString());
                    pedidos.add(pedido);
            }
       } catch(Exception ex) {
            Logger.getLogger(Pedido.class.getName()).log(Level.SEVERE, null, ex);
       }
       
    
        return pedidos;
    }
    
}