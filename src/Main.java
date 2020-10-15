public class Main {

    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        Author rpGheo = new Author("Radu Pavel Gheo");
        discoTitanic.addAuthor(rpGheo);
        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
        int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");

        SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
        scOneOne.createNewElement("paragraph", "Paragraph 1");
        scOneOne.createNewElement("paragraph", "Paragraph 2");
        scOneOne.createNewElement("paragraph","Paragraph 3");
        scOneOne.createNewElement("paragraph","Paragraph 4");
        scOneOne.createNewElement("paragraph","Paragraph 5");
        scOneOne.createNewElement("image","Image 1");
        scOneOne.createNewElement("table", "Table 1");

        scOneOne.print();
    }
}
