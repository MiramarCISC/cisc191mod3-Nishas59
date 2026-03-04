
package edu.sdccd.cisc191;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class Module3ShapeTests {

 @Test
 void polymorphismWorks(){
     Shape s = new Circle("test",2);
     assertEquals(Math.PI*4, s.area(),0.001);
 }

 @Test
 void equalsWorks(){
     Circle a = new Circle("same",2);
     Circle b = new Circle("same",2);
     assertEquals(a,b);
 }

 @Test
 void comparableSort(){
     List<Shape> shapes = new ArrayList<>();
     shapes.add(new Circle("b",1));
     shapes.add(new Circle("a",1));
     Collections.sort(shapes);
     assertEquals("a",shapes.get(0).getName());
 }

 @Test
 void comparatorSort(){
     List<Shape> shapes = new ArrayList<>();
     shapes.add(new Circle("big",3));
     shapes.add(new Circle("small",1));
     shapes.sort(Comparator.comparingDouble(Shape::area));
     assertEquals("small",shapes.get(0).getName());
 }
}
