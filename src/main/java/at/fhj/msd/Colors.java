package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Colors {

      private int red;
      private int green;
      private int blue;

      public Colors(int red, int green, int blue)
      {
            this.red = red;
            this.green = green;
            this.blue = blue;
            if ((red > 255 || green > 255 || blue > 255) || (red < 0 || green < 0 || blue < 0) )
            {
                  throw new IllegalArgumentException("Only values from 0 to 255 are available");
            } 
      }

      public String hexFormat()
      {
            return String.format("\"#%s%s%s\"", Integer.toHexString(red),
            Integer.toHexString(green), Integer.toHexString(blue)).toUpperCase();
      }

      public String rgbFormat()
      {
            return String.format("\"rgb(%d, %d, %d)\"", this.red, this.green, this.blue);
      }

      @Override
      public String toString()
      {
            return String.format("\'rgb(%d, %d, %d)\'", this.red, this.green, this.blue);
      }

      
      @Override
      public boolean equals(Object other)
      {
            if (this == other) return true; //--> Direkte Überprüfung; phyische.
            if (other == null || getClass() != other.getClass()) return false; // oder mit if (!(o instanceof Color))
            Colors colory = (Colors)(other); // Casting vom Object --zu--> Colors, das geht, wenn sie sich verwand sind
            return (colory.red == this.red) && (colory.green == this.green)
                 && (colory.blue == this.blue); //--> eigentliche überprüfung.
      }

      public static List<Colors> random(int amount)
      {
            List<Colors> colors = new ArrayList<>();
            for (int i = 0; i < amount; i++)
            {
                  int r = (int) (Math.random() * 255);
                  int g = (int) (Math.random() * 255);
                  int b = (int) (Math.random() * 255);
                  Colors color = new Colors(r, g, b);
                  colors.add(color);
            }
            return colors;
      }

      public static List<Colors> uniqColors(List<Colors> colors)
      {
            List<Colors> colours = new ArrayList<>();
            for (int i = 0; i < colors.size(); i++)
            {
                  if (!(colours.contains(colors.get(i)))) colours.add(colors.get(i));    
            }
                  return colours;
      }
         
            public Colors oppositeColor(Colors color)
      {
            int r = 255 - this.red; 
            int g = 255 - this.green;
            int b = 255 - this.blue;

            Colors colory = new Colors(r, g, b);
            return colory;
      } 

      @Override
      public int hashCode()
      {
            return Objects.hash(this.red, this.green, this.blue);
      }

}




     




