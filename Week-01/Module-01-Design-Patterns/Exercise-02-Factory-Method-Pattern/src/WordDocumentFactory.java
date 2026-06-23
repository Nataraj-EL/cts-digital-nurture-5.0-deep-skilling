public class WordDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {

        System.out.println("Creating Word document..");

        return new WordDocument();

    }

}
