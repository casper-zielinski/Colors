package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.ColorSupported;

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
            return String.format("\"#%s%s%s\"", Integer.toHexString(red).toUpperCase(),
            Integer.toHexString(green).toUpperCase(), Integer.toHexString(blue).toUpperCase());
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

      public boolean equals(Colors other)
      {
            return (other.red == this.red) && (other.green == this.green)
            && (other.blue == this.blue);
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
                  for (int j = 0; j < colors.size(); j++)
                  {
                        if ((colors.get(i)).equals(colors.get(j)))
                        {
                              break;
                        }
                        else
                        {
                              colours.add(colors.get(i));
                        }
                  }
            }
            return colours;
      }


}
