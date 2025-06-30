/**
 * @author Greivin
 */
package Listas;

public interface Lista <T>{
    void Agregar(T t);
    void Eliminar(T t);
    T Buscar(Object id);
}
