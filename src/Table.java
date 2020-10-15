public class Table extends Element {
    private String title;

    public void print()
    {
        System.out.println("Table with title: " + this.title);
    }

    public Table(String title) {
        this.title = title;
    }
}
