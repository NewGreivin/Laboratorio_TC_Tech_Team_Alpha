/**
 * @author Greivin
 */
package Listas;

public interface Lista <T>{
    void Agregar(T obj);
    void Eliminar(String id);
    T Buscar(String id);
}
