/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.uvigo.esei.pro2.core;

/**
 *
 * @author Nani
 */
public class DocumentoWeb extends Referencia{
    private String url;
    private Fecha fechaConsulta;

    public DocumentoWeb(String url, Fecha fechaConsulta, 
                        String autores, String titulo, int ano) {
        super(autores, titulo, ano);
        this.url = url;
        this.fechaConsulta = fechaConsulta;
    }

    public String getUrl() {
        return url;
    }

    public Fecha getFechaConsulta() {
        return fechaConsulta;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    public void setFechaConsulta(Fecha fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    @Override
    public String toString() {
        StringBuilder toret = new StringBuilder ();
        
        toret.append("Referencia Documento Web.\n");
        toret.append(super.toString());
        toret.append("\tUrl: ");
        toret.append(getUrl());
        toret.append("\tFecha Consulta: ");
        toret.append(getFechaConsulta().toString());
        
        return toret.toString();
    }
    
    
    
}
