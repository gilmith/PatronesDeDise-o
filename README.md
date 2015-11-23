# PatronesDeDise-o


    public static void escribirExcel()
    {
        try
        {
            //Se crea el libro Excel
            WritableWorkbook workbook =
                    Workbook.createWorkbook(new File("ejemplo.xls")); 
 
            //Se crea una nueva hoja dentro del libro
            WritableSheet sheet =
                    workbook.createSheet("HojaEjemplo", 0); 
 
            //Creamos celdas de varios tipos
            sheet.addCell(new jxl.write.Number(0, 0, 1));
            sheet.addCell(new jxl.write.Number(1, 0, 1.2));
            sheet.addCell(new jxl.write.Label(2, 0, "ejemplo"));
            sheet.addCell(new jxl.write.Boolean(3,0,true)); 
 
            //Creamos una celda de tipo fecha y la mostramos
            //indicando un patón de formato
            DateFormat customDateFormat =
                    new DateFormat ("d/m/yy h:mm"); 
 
            WritableCellFormat dateFormat =
                    new WritableCellFormat (customDateFormat); 
 
            sheet.addCell(new jxl.write.DateTime(4, 0, new Date(), dateFormat));
 
            //Escribimos los resultados al fichero Excel
            workbook.write();
            workbook.close(); 
 
            leerExcel();
 
            System.out.println("Ejemplo finalizado.");
        }
        catch (IOException ex)
        {
            System.out.println("Error al crear el fichero.");
        }
        catch (WriteException ex)
        {
            System.out.println("Error al escribir el fichero.");
        }
    }
    
      public Document stringADocumento(String s)     {

Document tmpXml=null;

DocumentBuilder builder = null;

try{

builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

}catch(javax.xml.parsers.ParserConfigurationException error){

System.out.println(“Error crando factory String2DOM “+error.getMessage());

return null;

}

try{

tmpXml=builder.parse(new ByteArrayInputStream(s.getBytes()));

}catch(org.xml.sax.SAXException error){

System.out.println(“Error parseo SAX String2DOM “+error.getMessage());

return null;

}catch(IOException error){

System.out.println(“Error generando Bytes String2DOM “+error.getMessage());

return null;

}

return tmpXml;

}
Ahora la funcion main con un String que enviamos:

    public static void main (String[] args) throws TransformerConfigurationException, TransformerException {

String cadena = “<datos>” +       ” <empleado>” +       ”   <nombre>Alvaro</nombre>” +       ”             <cargo>Gerente</cargo>” +       ” </empleado>” +       ” <empleado>” +       ”   <nombre>Lorena</nombre>” +       ”   <cargo>administradorA</cargo>” +       ” </empleado>” +       “</datos>”;

CadenaAXML xm = new CadenaAXML();

Source origen = new DOMSource(xm.stringADocumento(cadena));

Result resultado = new StreamResult(new java.io.File(“resultado.xml”));

//nombre del archivo

Result consola= new StreamResult(System.out);

Transformer transformar = TransformerFactory.newInstance().newTransformer();

transformar.transform(origen, resultado);

transformar.transform(origen, consola);

}
Finalmente las librerias utilizadas:

import java.io.ByteArrayInputStream;

import java.io.IOException;

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;

import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.transform.Result;

import javax.xml.transform.Source;

import javax.xml.transform.Transformer;

import javax.xml.transform.TransformerConfigurationException;

import javax.xml.transform.TransformerException;

import javax.xml.transform.TransformerFactory;

import javax.xml.transform.dom.DOMSource;

import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

import org.xml.sax.InputSource;


org.w3c.dom.Document dom;
javax.xml.parsers.DocumentBuilderFactory dbf;
javax.xml.parsers.DocumentBuilder db;

dbf = javax.xml.parsers.DocumentBuilderFactory.newInstance();

try
{
  db = dbf.newDocumentBuilder();
  dom = db.parse("test.xml");
}
catch(Exception ex) {}


Ahora dom contiene toda la información y estructura de nuestro documento en memoria. Veamos como extraer la información que necesitamos

Para obtener el nodo raiz, en este caso personas, llamamos a:


org.w3c.dom.Element rootElement = dom.getDocumentElement();


rootElement es el objeto que ahora debemos interrogar. Por ejemplo si llamamos al método getElementsByTagName(String etiqueta) obtendremos un objeto de tipo NodeList (org.w3c.dom.NodeList) que contiene a su vez todos los posibles elementos incluidos dentro de la etiqueta. Para obtener por ejemplo el contenido de las etiquetas persona podríamos hacer


org.w3c.dom.NodeList nodeList = rootElement.getElementsByTagName("persona");


Para iterar sobre nodeList podriamos hacer


if(nodeList != null && nodeList.getLength()>0
{
  for(int i=0;i<nodeList.getLength();i++)
  {
    org.w3c.dom.Element element = (Element)nodeList.item(i);
    if(element.hasAttribute("sexo")) System.out.println(element.getAttribute("sexo"));
    org.w3c.dom.NodeList nodeList2 = element.getElementsByTagName("nombre");
    if(nodeList2 != null && nodeList2.getLength()>0
    {
      org.w3c.dom.Element el = (Element)nodeList2.item(0);
      System.out.println("Nombre: " + el.getFirstChild().getNodeValue());
    }
  }
}
