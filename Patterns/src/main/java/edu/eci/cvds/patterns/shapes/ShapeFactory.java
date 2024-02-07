package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.Triangle;
import edu.eci.cvds.patterns.shapes.concrete.Hexagon;
import edu.eci.cvds.patterns.shapes.concrete.Pentagon;
import edu.eci.cvds.patterns.shapes.concrete.Quadrilateral;

public class ShapeFactory {
    public static Shape create(RegularShapeType args){
        switch (args) {
            case Triangle:
                Shape triangle = new Triangle();
                return triangle;
            case Quadrilateral:
                Shape quadrilateral = new Quadrilateral();
                return quadrilateral;
            case Pentagon:
                Shape pentagon = new Pentagon();
                return pentagon;
            case Hexagon:
                Shape hexagon = new Hexagon();
                return hexagon;
            default:
                return null;
        }
    }
  }