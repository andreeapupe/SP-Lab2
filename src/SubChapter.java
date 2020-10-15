import java.util.ArrayList;

public class SubChapter {
    private String name;
    private ArrayList<Element> elements = new ArrayList<>();

    public void print()
    {
        System.out.println("Subchapter: " + name);

        for( Element element: this.elements ) {

            element.print();
        }
    }

    public SubChapter(String name) {
        this.name = name;
    }

    public int createNewElement(String type, String content)
    {
        Element createdElement = new Element();

        switch(type) {
            case "paragraph":
                createdElement = new Paragraph(content);
                break;

            case "image":
                createdElement = new Image(content);
                break;

            case "table":
                createdElement = new Table(content);
                break;
        }

        this.elements.add(createdElement);

        return this.elements.indexOf(createdElement);
    }
}
