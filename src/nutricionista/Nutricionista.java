
package nutricionista;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import nutricionista.accesodatos.ComidaData;
import nutricionista.accesodatos.Conexion;
import nutricionista.accesodatos.DietaComidaData;
import nutricionista.accesodatos.DietaData;
import nutricionista.accesodatos.PacienteData;
import nutricionista.entidades.Comida;
import nutricionista.entidades.Dieta;
import nutricionista.entidades.DietaComida;
import nutricionista.entidades.Paciente;

/**
 *
 * @author user
 */
public class Nutricionista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Connection con=null;
        
        con = Conexion.getConexion();
        
        Paciente uno= new Paciente(3,"JAVIER","gonzalez",34332910,"SAN MARTIN 12",234563242);
        
        PacienteData pac= new PacienteData();
        
        //pac.guardarPaciente(uno);
        //pac.modificarPaciente(uno);
        //pac.eliminarPaciente(34332910);
    
    Comida alm=new Comida (1,"almuerzo","bife,ensalada",300);
    
    ComidaData com=new ComidaData();
    
    //com.guardarComida(alm);
    //com.modificarComida(alm);
    //com.eliminarComida(alm.getNombre());
    
    Dieta dieta=new Dieta(1,"alta caloria", uno, LocalDate.of(2023, Month.OCTOBER, 02), LocalDate.of(2023, Month.OCTOBER, 31),80.55, 70.00);
    
    DietaData die=new DietaData();
    
    //die.guardarDieta(dieta);
   // die.modificarDieta(dieta);
    //die.eliminarDieta(dieta);
   
    DietaComida dc=new DietaComida(alm,dieta);
    
    DietaComidaData dcd= new DietaComidaData();
    
    dcd.GuardarDietaComida(dc);
    
    
    
    }
    
}
