package Volante;

	import com.itextpdf.text.Document;
	import com.itextpdf.text.DocumentException;
	import com.itextpdf.text.Paragraph;
	import com.itextpdf.text.pdf.PdfWriter;

	import java.io.FileOutputStream;
	import java.io.IOException;

	public class GeneratePdf {

	    public static void main(String[] args) {
	        generateTransactionPDF("C:\\Users\\HP\\Desktop\\report.pdf");
	    }

	    public static void generateTransactionPDF(String fileName) {
	        Document document = new Document();

	        try {
	            PdfWriter.getInstance(document, new FileOutputStream(fileName));
	            document.open();
	            // Add content to the document
	            document.add(new Paragraph("Transaction Report"));
	            document.add(new Paragraph("Date: 2023-08-14"));
	            document.add(new Paragraph("Transaction ID: 12345"));
	            document.add(new Paragraph("Amount: $1000"));
	            document.add(new Paragraph("Description: Purchase"));

	            document.close();
	        } catch (DocumentException | IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


