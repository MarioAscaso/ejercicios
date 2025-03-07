package areaRectangle;

import input.Input;
import maths.Mathematician;
import output.Output;

public class AreaRectangle {

    static float height;
    static float width;
    static float areaRectangle;

    public static void rectangleAreaCalculation() {
        Output.askHeight();
        height = Input.getFloatValue();
        Output.askWidth();
        width = Input.getFloatValue();

        areaRectangle = Mathematician.multiply(height, width);

        System.out.println("AREA DEL RECTÁNGULO DE ANCHO " + width + " Y ALTO " + height + ": " + areaRectangle);
    }

}
