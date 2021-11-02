package examen;

import examen.jdom.JDOMController;
import examen.model.RandomGenerator;
import org.jdom2.JDOMException;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Todas las clases deben estar documentadas con JDOC (JavaDoc de Java).
 * @author José Luis González Sánchez
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Examen Acceso a Datos 01");
        String CSV = System.getProperty("user.dir")+File.separator+"data"+File.separator+"data01"+File.separator+"data01.csv";
        String XML = System.getProperty("user.dir")+File.separator+"data"+File.separator+"data01"+File.separator+"data01.xml";
        CSVDataReader csvDataReader = new CSVDataReader();
        JDOMController jdomController = new JDOMController();
        List<String> lineas;
        System.out.println(CSV);
        System.out.println(XML);
        RandomGenerator rg = new RandomGenerator();
        rg.getMuestraRandom().forEach(m->m.toString());
        try {
           lineas = csvDataReader.readMedidasCSV(CSV);
           lineas.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            jdomController.loadData(XML);
           jdomController.getMuestras().forEach(System.out::println);
        } catch (IOException | JDOMException e) {
            e.printStackTrace();
         }

}
}
