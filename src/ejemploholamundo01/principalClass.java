
package ejemploholamundo01;

import java.util.Vector;

class principalClass {
    
    Vector<Celular> objetos = new Vector<Celular>();
    
    public void agregar(String cel, String marca, String nombre,int edad, String calle, int ninterior, String colonia){
        Celular obj = new Celular(cel,marca,
                new Celular.Propietario(nombre,edad, 
                new Celular.Propietario.Direccion(calle, ninterior, colonia)));
        objetos.add(obj);
    }
    
    public Vector<Celular> obtener(){
        return objetos;
    }
    
    public void eliminar(int id){
        objetos.remove(id);
    }
    
    public void modificar(int id, String cel, String marca, String nombre, int edad, String calle,int ninterior, String colonia){
        objetos.set(id, new Celular(cel,marca,
                new Celular.Propietario(nombre,edad, 
                new Celular.Propietario.Direccion(calle, ninterior, colonia))));
    }
    
    public int size(){
        return objetos.size();
    }
}
