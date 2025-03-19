package at.fhj.msd;

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
            return String.format("#%s%s%s", Integer.toHexString(red).toUpperCase(),
            Integer.toHexString(green).toUpperCase(), Integer.toHexString(blue).toUpperCase());
      }
      public String rgbFormat()
      {
            return null;
      }

}
