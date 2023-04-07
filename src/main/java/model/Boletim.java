package model;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Boletim {
    private String destinoArquivo;
    private String materias[] = {"Artes", "Biologia", "Educação Física", "Filosofia", "Física", "Geografia","História", "Inglês", "Matemática", "Português", "Química", "Sociologia"};


    public Boletim() {
        this.destinoArquivo = "./boletim.pdf";
    }
    
    
    public void gerarPdf(String nomeAluno){
        PdfWriter writer = null;
        try {
            writer = new PdfWriter(this.destinoArquivo);
            PdfDocument pdf = new PdfDocument(writer);
            Document documento = new Document(pdf);
            
            //criando objeto imagem para adicionar no relatorio
            String arquivoImagem = Boletim.class.getResource("/images/Ada lovelace.png").toString();
            ImageData data = ImageDataFactory.create(arquivoImagem);
            Image img = new Image(data);
            // adicionando o objeto imagem na celula, setando a escala para a celula (util para inagens grandes)
            float scale = 0.25f;
            img.scaleAbsolute(img.getImageWidth() * scale, img.getImageHeight() * scale);
            
            img.setTextAlignment(TextAlignment.CENTER);
            documento.add(img);
            
            
            documento.add(new Paragraph("Aluno: " + nomeAluno));
            
            
            // criacao da tabela
            float [] pointColumnWidths = {150f, 120f, 120f, 120f}; //2 colunas com a largura variavel de cada
            Table tabela = new Table(pointColumnWidths);
            
            //a primeira linha sera o cabecalho (celula1 e 2)
            Cell celula1 = new Cell();
            celula1.add(new Paragraph("Máteria"));
            celula1.setTextAlignment(TextAlignment.CENTER);
            celula1.setBackgroundColor(ColorConstants.GRAY);
            tabela.addCell(celula1);
            
            Cell celula2 = new Cell();
            celula2.add(new Paragraph("1º Semetre"));
            celula2.setTextAlignment(TextAlignment.CENTER);
            celula2.setBackgroundColor(ColorConstants.GRAY);
            tabela.addCell(celula2);
            
            Cell celula3 = new Cell();
            celula3.add(new Paragraph("2º Semetre"));
            celula3.setTextAlignment(TextAlignment.CENTER);
            celula3.setBackgroundColor(ColorConstants.GRAY);
            tabela.addCell(celula3);
            
            Cell celula4 = new Cell();
            celula4.add(new Paragraph("Média"));
            celula4.setTextAlignment(TextAlignment.CENTER);
            celula4.setBackgroundColor(ColorConstants.GRAY);
            tabela.addCell(celula4);
            
            //populando linhas da tabela
            int quantidadeColunas = 4;
            for(int i = 0; i < materias.length; i++){
                for(int j = 0; j < quantidadeColunas; j++){
                    Cell celula = new Cell();
                    celula.setTextAlignment(TextAlignment.CENTER);
                    switch (j) {
                        case 0:
                            celula.add(new Paragraph(materias[i]));
                            break;
                        case 1:
                            if (Aluno.listaNotas1.containsKey(materias[i])) {
                                celula.add(new Paragraph(Aluno.listaNotas1.get(materias[i]).toString()));
                                break;
                            }
                            celula.add(new Paragraph("-"));
                            break;
                        case 2:
                            if (Aluno.listaNotas2.containsKey(materias[i])) {
                                celula.add(new Paragraph(Aluno.listaNotas2.get(materias[i]).toString()));
                                break;
                            }
                            celula.add(new Paragraph("-"));
                            break;
                        case 3:
                            if (Aluno.listaNotas1.containsKey(materias[i]) && Aluno.listaNotas2.containsKey(materias[i])) {
                                float media = (Aluno.listaNotas1.get(materias[i]) + Aluno.listaNotas2.get(materias[i]))/2;
                                celula.add(new Paragraph(Float.toString(media)));
                                break;
                            }
                            celula.add(new Paragraph("-"));
                            break;
                    }
                    
                    tabela.addCell(celula);
                }
            }

            documento.add(tabela);
            documento.close();

        } catch (FileNotFoundException | MalformedURLException ex) {
            Logger.getLogger(Boletim.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(Boletim.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
}
