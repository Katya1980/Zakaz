package by.teachmeslills.zakaz;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {

        try {
            JAXBContext context = JAXBContext.newInstance(Zakaz.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Zakaz zakaz = (Zakaz) unmarshaller.unmarshal(new File("E:\\Козловская Е. В. Сборка\\test.xml"));
            System.out.println(zakaz.getNazvanie());

            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            Zakaz zakaz1 = new Zakaz();
            zakaz.setNazvanie("тормозные колодки");
            zakaz.setPrice(120);
            marshaller.marshal(zakaz1, new FileOutputStream("test.xml"));

        } catch (Exception e){
              e.printStackTrace();
        }

    }

}