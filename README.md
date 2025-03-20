# Colors

## Descirption

Bei ``equals``:
Wann greift welche Prüfung:

| Vergleich | this == obj (physischer Vergleich) | return (colory.red == this.red) && (colory.green == this.green) && (colory.blue == this.blue); |
|---------|----------|-------------|
|  p1 = a; <br> p2 = p1; <br> p1.equals(p2); | **true**  | wird gar nicht geprüft (**true**)  |
|  p1 = a; <br> p3 = a; <br>p1.equals(p3);   | **false**   | **true**  |
|   p1 = a; <br> p1.equals(new Person("b"))  | **false**   |  **false** |
