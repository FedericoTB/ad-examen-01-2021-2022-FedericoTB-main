package examen.jdom;

import examen.model.Muestras;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JDOMController {

    private String uri;
    private Document document;

    public void loadData(String uri) throws IOException, JDOMException {
        SAXBuilder builder = new SAXBuilder();
        File xmlFile = new File(uri);
        this.document = (Document) builder.build(xmlFile);
    }
    public void initData(){
        this.document = new Document();
        Element root = new Element("response");
        this.document.setRootElement(root);
    }
    public void preprocess(){
        XMLOutputter xmlOutputter = new XMLOutputter();
    }
    public void printXML() throws IOException {
        XMLOutputter outputter = new XMLOutputter();
        outputter.output(this.document,System.out);

    }
    public Document getDocument(){
        return this.document;
    }
    public List<Muestras> getMuestras(){
        Element element = document.getRootElement();
        List<Element> resources = element.getChildren("resource");
        List<Muestras> muestras = new ArrayList<>();
        resources.forEach(elem -> muestras.add(new Muestras(elem.getChildText("identifier", Namespace.getNamespace("dc")),
                        elem.getChildText("modified", Namespace.getNamespace("dc")),
                        elem.getChildText("type",Namespace.getNamespace("ayto")),
                        elem.getChildText("temperature",Namespace.getNamespace("ayto")),
                        elem.getChildText("noise",Namespace.getNamespace("ayto")),
                        elem.getChildText("light",Namespace.getNamespace("ayto")),
                        elem.getChildText("type",Namespace.getNamespace("ayto")),
                        elem.getChildText("battery",Namespace.getNamespace("ayto")))
                )
        );
        return muestras;
    }
}
