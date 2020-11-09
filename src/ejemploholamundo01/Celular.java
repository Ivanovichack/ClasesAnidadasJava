
package ejemploholamundo01;

import ejemploholamundo01.Celular.Propietario.Direccion;

/**
 *
 * @author FASARLJP
 */
class Celular {

    private String numero;
    private String marca;
    private Propietario propietario;
    

    public Celular() {
    }

    public Celular(String numero, String marca, Propietario propietario) {
        this.numero = numero;
        this.marca = marca;
        this.propietario = propietario;
    }

    public Celular(String numero, String marca, String nombre, int edad, Direccion direccion) {
        this.numero = numero;
        this.marca = marca;
        this.propietario = new Propietario(nombre, edad, direccion);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    static class Propietario {

        private String nombre;
        private int edad;
        private Direccion direccion;

        public Propietario(String nombre, int edad, Direccion direccion) {
            this.nombre = nombre;
            this.edad = edad;
            this.direccion = direccion;
        }
        
        public void setDireccion(Direccion direccion){
            this.direccion = direccion;
        }
        
        public Direccion getDireccion(){
            return this.direccion;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        static class Direccion {

            private String calle;
            private int numeroInterior;
            private String colonia;

            public Direccion(String calle, int numeroInterior, String colonia) {
                this.calle = calle;
                this.numeroInterior = numeroInterior;
                this.colonia = colonia;
            }

            public String getCalle() {
                return calle;
            }

            public void setCalle(String calle) {
                this.calle = calle;
            }

            public int getNumeroInterior() {
                return numeroInterior;
            }

            public void setNumeroInterior(int numeroInterior) {
                this.numeroInterior = numeroInterior;
            }

            public String getColonia() {
                return colonia;
            }

            public void setNumeroExterior(String numeroExterior) {
                this.colonia = colonia;
            }

        }
    }
}
