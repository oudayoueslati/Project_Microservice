package tn.esprit.offre_promotion.util;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import tn.esprit.offre_promotion.entities.Offer;

import java.io.ByteArrayOutputStream;
import java.time.LocalDate;

public class PdfGenerator {

    public static byte[] generateOfferPdf(Offer offer) throws Exception {
        // Créer un flux de sortie pour le PDF
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PdfWriter writer = new PdfWriter(baos);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);

        // Ajouter un titre
        document.add(new Paragraph(new Text("Détails de l'Offre").setBold().setFontSize(16)));

        // Ajouter les informations de l'offre
        document.add(new Paragraph("ID: " + offer.getId()));
        document.add(new Paragraph("Nom: " + offer.getName()));
        document.add(new Paragraph("Description: " + offer.getDescription()));
        document.add(new Paragraph("Date de début: " + offer.getDateDebut()));
        document.add(new Paragraph("Date de fin: " + offer.getDateFin()));
        document.add(new Paragraph("Remise (%): " + offer.getRemisePourcentage()));

        // Fermer le document
        document.close();

        return baos.toByteArray();
    }
}