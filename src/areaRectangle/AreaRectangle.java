package areaRectangle;

import input.Input;
import output.Output;

public class AreaRectangle {

    static float heigh;
    static float width;
    static float areaRectangle;

    public static void RectangleAreaCalculation() {
        Output.askHeigh();
        heigh = Input.getFloatValue();
        Output.askWidth();
        width = Input.getFloatValue();

        areaRectangle = heigh * width;

        System.out.println("AREA DEL RECTÁNGULO DE ANCHO " + width + " Y ALTO " + heigh + ": " + areaRectangle);
    }

}
