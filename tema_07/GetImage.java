package tema_07;

import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GetImage {

    private static Image imagen;

    public Image getImagen(String ruta) throws IOException {

        File mi_imagen = new File(ruta);
        imagen = ImageIO.read(mi_imagen);
        
        /*try {
            File mi_imagen = new File(ruta);
            imagen = ImageIO.read(mi_imagen);
        } catch (IOException e) {
            System.out.println("No se encontró la imagen");
        }*/

        return imagen;
    }

    public void detalleImagen() {

        int anchoImagen = imagen.getWidth((ImageObserver) this);
        int largoImagen = imagen.getHeight((ImageObserver) this);

        System.out.println("El ancho de la imagen es: " + anchoImagen);
        System.out.println("El largo de la imagen es: " + largoImagen);

        /*if (imagen instanceof Image) {

            int anchoImagen = imagen.getWidth((ImageObserver) this);
            int largoImagen = imagen.getHeight((ImageObserver) this);

            System.out.println("El ancho de la imagen es: " + anchoImagen);
            System.out.println("El largo de la imagen es: " + largoImagen);

        } else {

            System.out.println("No se cargo la imagen");

        }*/

    }

}
