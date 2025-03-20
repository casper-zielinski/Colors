# Colors

## Descirption

Bei ``equals``:
Wann greift welche Prüfung:

| Vergleich | this == obj (physischer Vergleich) | return (colory.red == this.red) && (colory.green == this.green) && (colory.blue == this.blue); |
|---------|----------|-------------|
|  p1 = a; <br> p2 = p1; <br> p1.equals(p2); | **true**  | wird gar nicht geprüft (**true**)  |
|  p1 = a; <br> p3 = a; <br>p1.equals(p3);   | **false**   | **true**  |
|   p1 = a; <br> p1.equals(new Person("b"))  | **false**   |  **false** |

> ``equals`` code:

 ```
@Override
      public boolean equals(Object other)
      {
            if (this == other) return true; 
            if (other == null || getClass() != other.getClass())
            return false; 
            Colors colory = (Colors)(other); 
            return (colory.red == this.red) && (colory.green == this.green)
                 && (colory.blue == this.blue); 
      }
```

- Bei uniqColors war wichitg die equals Methode richtig zu machen !!!

- hashCode war das schwierigste weil ich mich damit nicht ausgekannt habe:

```
@Override
      public int hashCode()
      {
            return Objects.hash(this.red, this.green, this.blue);
      }
```

- Objects.hash(this.red, this.green, this.blue); --> es handelt sich um eine Java-Dienstprogrammmethode, die einen Hash-Code für die angegebenen Werte (this.red, this.greed, this.blue) erzeugt. Sie kombiniert die drei Ganzzahlen (this.red, this.green, this.blue) zu einem einzigen Hash-Code und stellt sicher, dass ähnliche Objekte konsistente und gut verteilte Hash-Codes haben.
