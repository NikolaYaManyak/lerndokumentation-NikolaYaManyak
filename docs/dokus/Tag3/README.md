# Zugriffsmodifizierer
In Java gibt es vier Zugriffsmodifizierer. Die wären:
```
| Modifizierer | Die Klasse selbst | Paket-Klassen/innere-Klassen | Unterklassen | Sonstige Klassen |
|--------------|--------------------|-------------------------------|--------------|------------------|
| private      | Ja                 | Nein                          | Nein         | Nein             |
| public       | Ja                 | Ja                            | Ja           | Ja               |
| protected    | Ja                 | Ja                            | Ja           | Nein             |
| ohne/leer    | Ja                 | Ja                            | Nein         | Nein             |

```
In der Tabelle stehen gleich wo man sie benutzen kann. Zb. Kann man eine private Variabel nur in der Klasse selbst benutzen (deklarieren, lesen, ausgeben, usw.). Die public Variabel kann man stattdessen überall benutzen.

Wenn man eine Variabel auf private hat, es jedoch doch benutzen will, muss man die getter-setter Methode benutzen.

Beim letzten Auftrag hetten wir alle Variablen auf private und mussten desswegen auch für jede einen getter und setter machen.