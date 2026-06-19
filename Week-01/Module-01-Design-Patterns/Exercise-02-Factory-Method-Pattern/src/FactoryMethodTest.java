public class FactoryMethodTest {

    public static void main(String[] args) {

        // creating a Word document
        DocumentFactory wordFactory = new WordDocumentFactory();

        Document wordDocument = wordFactory.createDocument();

        wordDocument.open();

        System.out.println();


        // creating a pdf document
        DocumentFactory pdfFactory = new PdfDocumentFactory();

        Document pdfDocument = pdfFactory.createDocument();

        pdfDocument.open();

        System.out.println();


        // creating an excel document
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        Document excelDocument = excelFactory.createDocument();

        excelDocument.open();

    }

}