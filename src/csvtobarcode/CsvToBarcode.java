/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvtobarcode;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.Barcode;
import com.itextpdf.text.pdf.BarcodeEAN;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64;
import com.itextpdf.text.pdf.codec.Base64.OutputStream;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.krysalis.barcode4j.impl.code128.Code128Bean;
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider;

/**
 *
 * @author júnior
 */
public class CsvToBarcode {

    /**
     * @param args the command line arguments
     */
    public static String texto;

    public static void main(String[] args) throws DocumentException {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });

        
    }

}
