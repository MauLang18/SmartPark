/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author maula
 */
public class HojaSprites {

    private final int ancho;
    private final int alto;
    public final int[] pixeles;
    
    //coleccion
    public static HojaSprites parqueo = new HojaSprites("/recuroso/parqueo.png", 320, 320);
    //fin de la coleccion

    public HojaSprites(final String ruta, final int ancho, final int alto) {
        this.ancho = ancho;
        this.alto = alto;

        pixeles = new int[ancho * alto];

        BufferedImage imagen;
        try {
            imagen = ImageIO.read(HojaSprites.class.getResource(ruta));
            imagen.getRGB(0, 0, ancho, alto, pixeles, 0, ancho);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    public int obtenAncho(){
        return ancho;
    }
}
