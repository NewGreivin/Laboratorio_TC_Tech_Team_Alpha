/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casos;

import Listas.Lista;

/**
 *
 * @author Ricardo Chaves
 */
public class List_Caso implements Lista<Caso> {
    private Caso caso[];
    
    public List_Caso(){
        this.caso=new Caso[100];
    }

    @Override
    public void Agregar(Caso t) {
        for (int i = 0; i < 100; i++) {
            if(caso[i]==null){
                caso[i]=t;
            }
        }
    }

    @Override
    public void Eliminar(Caso t) {
        for (int i = 0; i < 100; i++) {
           if(caso[i]!=null){
               caso[i]=t;
           } 
        }
    }

    @Override
    public Caso Buscar(Object id) {
        for (int i = 0; i < 100; i++) {
            if(caso[i].getId().equals(id)){
                return caso[i];
            }
        }
        return null;
    }
    
}
