
package domain;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(36);
        cliente.setNombre("Adrian");
        cliente.setTelefono(46840492);
        cliente.setCredito(20500);
        
        Trabajador trabajador = new Trabajador();
        trabajador.setSalario(10000);
        
        
        System.out.println("El señor " + cliente.getNombre()+ " de " + cliente.getEdad() + " años, cuyo telefono es " + cliente.getTelefono() + " dispone de $"+cliente.getCredito()+ " y su salario actual es de $"+trabajador.getSalario());
        
        
    }
}
    class Persona{
        int edad;
        String nombre;
        int telefono;

        public Persona() {
        
        }

        public int getEdad() {
            return this.edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getTelefono() {
            return this.telefono;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }
        
    }
    class Cliente extends Persona{
        int credito;

        public int getCredito() {
            return this.credito;
        }

        public void setCredito(int credito) {
            this.credito = credito;
        }
        
    }
    class Trabajador extends Persona{
        int salario;

        public int getSalario() {
            return this.salario;
        }

        public void setSalario(int salario) {
            this.salario = salario;
        }
        
    }

