# Avaluació alumne: **Armijo, Benja**

<hr>
<details>
<summary>Detalls</summary>

|ID|Autor|Data|Comentari|
|---|:---|:---:|:---|


# Xuleta NOTES

Profe20220121 => Bac20220121

```bash
echo "|ID|Autor|Data|Comentari|" > ArmijoBenja.md
echo "|---|:---|:---:|:---|" >> ArmijoBenja.md
git log --pretty=format:"|%h|%an|%ai|%s|" >> ArmijoBenja.md

```


|Item|Valor|
|---|---|
| NomAlumne               |Benja|
| CognomAlumne            |Armijo|
| Sigles                  |Bac|
| NOTA_teoria1a           |<#NOTA_teoria1a#>|
| NOTA_teoria1b           |<#NOTA_teoria1b#>|
| NOTA_TEORIA             |<#NOTA_TEORIA#>|
| PERC_mostraMiss         |<#PERC_mostraMiss#>|
| NOTA_mostraMiss         |<#NOTA_mostraMiss#>|
| PERC_llegirEnter        |<#PERC_llegirEnter#>|
| NOTA_llegirEnter        |<#NOTA_llegirEnter#>|
| PERC_llegirCaracter     |<#PERC_llegirCaracter#>|
| NOTA_llegirCaracter     |<#NOTA_llegirCaracter#>|
| PERC_llegirCadenaDeLletresTeclat     |<#PERC_llegirCadenaDeLletresTeclat#>|  PERC_llegirCadenaDeLletresTeclat
| NOTA_llegirCadenaDeLletresTeclat     |<#NOTA_llegirCadenaDeLletresTeclat#>|  NOTA_llegirCadenaDeLletresTeclat
| PERC_esEnter            |<#PERC_esEnter#>|
| NOTA_esEnter            |<#NOTA_esEnter#>|
| PERC_esLletra           |<#PERC_esLletra#>|
| NOTA_esLletra           |<#NOTA_esLletra#>|
| PERC_mostraMissSalt     |<#PERC_mostraMissSalt#>|
| NOTA_mostraMissSalt     |<#NOTA_mostraMissSalt#>|
| PERC_trobaNombre        |<#PERC_trobaNombre#>|
| NOTA_trobaNombre        |<#NOTA_trobaNombre#>|
| PERC_progamaPpal        |<#PERC_progamaPpal#>|
| NOTA_progamaPpal        |<#NOTA_progamaPpal#>|
| NOTA_PRACTICA           |<#NOTA_PRACTICA#>|
| NOTA_FINAL              |<#NOTA_FINAL#>|
</details> 
<hr>




# **FINAL**

|Item|Nota|Sobre|
|:---|---:|---:|
|&nbsp;&nbsp;*[Avaluació part teòrica](#avaluaci%C3%B3-part-te%C3%B2rica)*|**```<#NOTA_TEORIA#>```**|**```2.00```**|
|&nbsp;&nbsp;*[Avaluació part pràctica](#avaluaci%C3%B3-part-pr%C3%A0ctica)*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;| **```<#NOTA_PRACTICA#>```**|**```8.00```**|
|<span style="font-size: 20px;">**NOTA FINAL**</span>|<span style="font-size: 20px;">**```<#NOTA_FINAL#>```**</span>|<span style="font-size: 20px;">**```10.0```**</span>|


# Avaluació part teòrica

|Item|Nota|Sobre|
|:---|---:|---:|
|&nbsp;&nbsp;[*Pregunta  1* **```1a```**](#pregunta-1-1a-de-teoria)&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|```<#NOTA_teoria1a#>```|```1.00```|
|&nbsp;&nbsp;[*Pregunta  2* **```1b```**](#pregunta-2-1b-de-teoria)|```<#NOTA_teoria1b#>```|```1.00```|
|<span style="font-size: 20px;">**NOTA TEORIA**</span>|<span style="font-size: 20px;">**```<#NOTA_TEORIA#>```**</span>|<span style="font-size: 20px;">**```2.00```**</span>|


# **Pregunta 1** (**```1a```** de teoria)

> ### Torna a [Avaluació part teòrica](#avaluaci%C3%B3-part-te%C3%B2rica)

## **Enunciat *1a***: *Explica per que creus que ha donat un error.*
### (*Explicació del professor.*)
> ## Dona un error perquè la funció **```divisio```** està definida com una funció que retorna un valor de tipus **```double```**.
> > ``` java
> > public static double divisio(int num1, int operador2)
> > ```
> ## i al codi, es crida a la funció **```divisio```** i el resultat de l'execució d'aquesta funció està assignada a una variable de tipus **```int```**. Per tant, s'està intentant assignar un valor de tipus **```double```** a una variable de tipus **```int```**, cosa que no és possible, ja que una variable de tipus **```double```** ocupa el doble que una variable de tipus **```int```**.
<br>
<br>

# **Pregunta 2** (**```1b```** de teoria)

> ### Torna a [Avaluació part teòrica](#avaluaci%C3%B3-part-te%C3%B2rica)

## **Enunciat *1b***: *Com ho solucionaries?*
### (*Explicació del professor.*)
> ## La manera de solucionar-ho, seria definint la variable **```resultat```** de tipus **```double```**.
> 
> ``` java
> int nombre1, nombre2;
> double resutltat;
> ```
> 
> ## En comptes de definir-la de tipus **```int```**.
> ``` java
> int nombre1, nombre2, resutltat;
> ```
> ## D'aquesta manera l'execució de la funció **```divisio```** estarà assignada a una variable de tipus **```double```** sense provocar cap error. 


<br>
<hr>

# Avaluació part pràctica

|Item|   |Nota|Sobre|
|:---|---|---:|---:|
|&nbsp;&nbsp;[*Pregunta  3*](#pregunta-3-1a-de-pr%C3%A0ctica)|[**```1a```**:&nbsp; **```mostrarMissatge(String cadena)```**](#pregunta-3-1a-de-pr%C3%A0ctica)|```<#NOTA_mostraMiss#>```|```0.50```|
|&nbsp;&nbsp;[*Pregunta  4*](#pregunta-4-2a-de-pr%C3%A0ctica)|[**```2a```**:&nbsp; **```llegirEnterTeclat()```**](#pregunta-4-2a-de-pr%C3%A0ctica)|```<#NOTA_llegirEnter#>```|```0.50```|
|&nbsp;&nbsp;[*Pregunta  5*](#pregunta-5-3a-de-pr%C3%A0ctica)|[**```3a```**:&nbsp; **```llegirCaracterTeclat()```**](#pregunta-5-3a-de-pr%C3%A0ctica)|```<#NOTA_llegirCaracter#>```|```0.50```|
|&nbsp;&nbsp;[*Pregunta  6*](#pregunta-6-4a-de-pr%C3%A0ctica)|[**```4a```**:&nbsp; **```llegirCadenaDeLletresTeclat()```**](#pregunta-6-4a-de-pr%C3%A0ctica)|```<#NOTA_llegirCadenaDeLletresTeclat#>```|```1.00```|
|&nbsp;&nbsp;[*Pregunta  7*](#pregunta-7-5a-de-pr%C3%A0ctica)|[**```5a```**:&nbsp; **```esEnter(char valorLlegit)```**](#pregunta-7-5a-de-pr%C3%A0ctica)|```<#NOTA_esEnter#>```|```0.50```|
|&nbsp;&nbsp;[*Pregunta  8*](#pregunta-8-6a-de-pr%C3%A0ctica)|[**```6a```**:&nbsp; **```esLletra(char valorLlegit)```**](#pregunta-8-6a-de-pr%C3%A0ctica)|```<#NOTA_esLletra#>```|```0.50```|
|&nbsp;&nbsp;[*Pregunta  9*](#pregunta-9-7a-de-pr%C3%A0ctica)|[**```7a```**:&nbsp; **```mostrarMissatgeSegonsSaltLinea(String cadena, boolean salt)```**](#pregunta-9-7a-de-pr%C3%A0ctica)|```<#NOTA_mostraMissSalt#>```|```1.50```|
|&nbsp;&nbsp;[*Pregunta 10*](#pregunta-10-8a-de-pr%C3%A0ctica)|[**```8a```**:&nbsp; **```trobaNombre(int nombre, int[] array)```**](#pregunta-10-8a-de-pr%C3%A0ctica)|```<#NOTA_trobaNombre#>```|```2.00```|
||[**Programa principal**](#programa-principal)|```<#NOTA_progamaPpal#>```|```1.00```|
||<span style="font-size: 20px;">**NOTA PRÀCTICA**</span>|<span style="font-size: 20px;">**```<#NOTA_PRACTICA#>```**</span>|<span style="font-size: 20px;">**```8.00```**</span>|

<br>
<br>
<hr>
<br>
<br>

# **Pregunta 3** (**```1a```** de pràctica)

> ### Torna a [Avaluació part pràctica](#avaluaci%C3%B3-part-pr%C3%A0ctica)


# Avaluació de la funció **```mostrarMissatge()```**.


## Codi executat per provar la funció **```mostrarMissatge```**```(String cadena)```.
> ### Aquesta és la funció que s'executarà en el programa principal de l'alumne per comprovar l'exercici.
> ### Només caldrà substituir la cadena **```Profe20220121```**, per la cadena amb el codi de l'alumne.
> ###     substituir la cadena **```Profe20220121```** per **```<InicialsAlumne>20220121```**. 
<br>

``` java
    public static void codiMostrarMissatge() {
        // Provant la funció mostrarMissatge()
        String cadMostraFuncio = AppCorreccio.missProvaFuncio("mostrarMissatge()");
        AppCorreccio.netejaConsola();
        AppCorreccio.pintaBarra();
        String cadenaDeProva = AppCorreccio.repeteixCaracter(' ',
                AppCorreccio.ESPAIS_ABANS)
                + "Això és un text de prova!";
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        Profe20220121.mostrarMissatge(cadenaDeProva);
        AppCorreccio.mostrarCadena("\n");
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.pintaBarra();
    }
```

> ## Resultat de la prova per la funció **```mostrarMissatge```**```(String cadena)```:
> ```
> ==================================================
> 
> ------    Prova funció mostrarMissatge()    ------
> ...  ???????????????? 
> ------    Prova funció mostrarMissatge()    ------
> ==================================================
> ```
>&nbsp;

<br>

> ## Resultat **esperat** de la prova per la funció  **```mostrarMissatge```**```(String cadena)```:
> ```
> ======================================================================
> -------------------------- mostrarMissatge() -------------------------
>         Això és un text de prova!
> -------------------------- mostrarMissatge() -------------------------
> ======================================================================
> ----------------- Pitja una tecla per tornar al menú! ----------------
> ```
>&nbsp;
<br>

> # ***Avaluació***: Bla, bla, bla...
> ## Bla, bla, bla... 
> ## Bla, bla, bla... 
> # **Nota**: **<#PERC_mostraMiss#> %** de 0.50 punts = **<#NOTA_mostraMiss#> punt/s**

<br>
<hr>
<br>
<br>


# **Pregunta 4** (**```2a```** de pràctica)

> ### Torna a [Avaluació part pràctica](#avaluaci%C3%B3-part-pr%C3%A0ctica)

# Avaluació de la funció **```llegirEnterTeclat()```**.

## Codi executat per provar la funció ```llegirEnterTeclat()```.
> ### Aquesta és la funció que s'executarà en el programa principal de l'alumne per comprovar l'exercici.
> ### Només caldrà substituir la cadena **```Profe20220121```**, per la cadena amb el codi de l'alumne.
> ###     substituir la cadena **```Profe20220121```** per **```<InicialsAlumne>20220121```**. 
<br>

``` java
    public static void codiLlegirEnterTeclat() {
        // Provant la funció llegirEnterTeclat()
        String cadMostraFuncio = AppCorreccio.missProvaFuncio("llegirEnterTeclat()");
        int enterLlegit;
        AppCorreccio.netejaConsola();
        AppCorreccio.pintaBarra();
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.mostrarCadena("Entra un nombre: ");
        enterLlegit = Profe20220121.llegirEnterTeclat();
        AppCorreccio.mostrarMissatgeMaco("Has entrat el nombre: " + enterLlegit);
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.pintaBarra();
    }
```

> ## Resultat de la prova per la funció **```llegirEnterTeclat```**```()```:
> ```
> ==================================================
> 
> ------   Prova funció llegirEnterTeclat()  ------
> ...  ???????????????? 
> ------   Prova funció llegirEnterTeclat()  ------
> ==================================================
> 
> ```
>&nbsp;

<br>

> ## Resultat **esperat** de la prova per la funció  **```llegirEnterTeclat```**```()```:
> ```
> ======================================================================
> ------------------------- llegirEnterTeclat() ------------------------
> Entra un nombre: r
>         ----------  ERROR!!!  ----------
>         Només pots entrar nombres!
>         Torna a intentar-ho!
>         --------------------------------
> 3
>         Has entrat el nombre: 3
> ------------------------- llegirEnterTeclat() ------------------------
> ======================================================================
> ----------------- Pitja una tecla per tornar al menú! ----------------
> ```
>&nbsp;
<br>

> # ***Avaluació***: Bla, bla, bla...
> ## Bla, bla, bla... 
> ## Bla, bla, bla... 
> # **Nota**: **<#PERC_llegirEnter#> %** de 0.50 punts = **<#NOTA_llegirEnter#> punt/s**

<br>
<hr>
<br>
<br>


# **Pregunta 5** (**```3a```** de pràctica)

> ### Torna a [Avaluació part pràctica](#avaluaci%C3%B3-part-pr%C3%A0ctica)

# Avaluació de la funció **```llegirCaracterTeclat()```**.

## Codi executat per provar la funció ```llegirCaracterTeclat()```.
> ### Aquesta és la funció que s'executarà en el programa principal de l'alumne per comprovar l'exercici.
> ### Només caldrà substituir la cadena **```Profe20220121```**, per la cadena amb el codi de l'alumne.
> ###     substituir la cadena **```Profe20220121```** per **```<InicialsAlumne>20220121```**. 
<br>

``` java
    public static void codiLlegirCaracterTeclat() {
        // Provant la funció llegirCaracterTeclat()
        String cadMostraFuncio = AppCorreccio.missProvaFuncio("llegirCaracterTeclat()");
        char caracterLlegit;
        AppCorreccio.netejaConsola();
        AppCorreccio.pintaBarra();
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.mostrarCadena("Entra un caracter: ");
        caracterLlegit = Profe20220121.llegirCaracterTeclat();
        AppCorreccio.mostrarCadena("Has entrat el caràcter: " + caracterLlegit + "\n");
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.pintaBarra();
    }
```

> ## Resultat de la prova per la funció **```llegirCaracterTeclat```**```()```:
> ```
> Prova funció llegirCaracterTeclat()
> 
> 
> 
> 
> 
> 
> 
> 
> 
> ```
>&nbsp;

<br>

> ## Resultat **esperat** de la prova per la funció **```llegirCaracterTeclat```**```()```:
> ```
> ======================================================================
> ------------------------ llegirCaracterTeclat() -----------------------
> Entra un caracter: 4
>         ----------  ERROR!!!  ----------
>         Només pots entrar lletres!
>         Torna a intentar-ho!
>         --------------------------------
> r
> Has entrat el caràcter: r
> ------------------------ llegirCaracterTeclat() -----------------------
> ======================================================================
> ----------------- Pitja una tecla per tornar al menú! ----------------
> 
> ```
>&nbsp;
<br>

> # ***Avaluació***: Bla, bla, bla...
> ## Bla, bla, bla... 
> ## Bla, bla, bla... 
> # **Nota**: **<#PERC_llegirCaracter#> %** de 0.50 punts = **<#NOTA_llegirCaracter#> punt/s**

<br>
<hr>
<br>
<br>


# **Pregunta 6** (**```4a```** de pràctica)

> ### Torna a [Avaluació part pràctica](#avaluaci%C3%B3-part-pr%C3%A0ctica)

# Avaluació de la funció **```llegirCadenaDeLletresTeclat()```**.

## Codi executat per provar la funció ```llegirCadenaDeLletresTeclat()```.
> ### Aquesta és la funció que s'executarà en el programa principal de l'alumne per comprovar l'exercici.
> ### Només caldrà substituir la cadena **```Profe20220121```**, per la cadena amb el codi de l'alumne.
> ###     substituir la cadena **```Profe20220121```** per **```<InicialsAlumne>20220121```**. 
<br>

``` java
    public static void codiLlegirCadenaDeLletresTeclat() {
        // Provant la funció llegirCadenaDeLletresTeclat()
        String cadMostraFuncio = AppCorreccio.missProvaFuncio("llegirCadenaDeLletresTeclat()");
        String cadenaDeLletres;
        AppCorreccio.netejaConsola();
        AppCorreccio.pintaBarra();
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.mostrarCadena("Entra una cadena de caràcters    : ");
        cadenaDeLletres = Profe20220121.llegirCadenaDeLletres();
        AppCorreccio.mostrarCadena("Has entrat la cadena de caràcters: " + cadenaDeLletres + "\n");
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.pintaBarra();
    }
```

> ## Resultat de la prova per la funció **```llegirCadenaDeLletresTeclat```**```()```:
> ```
> Prova funció llegirCadenaDeLletresTeclat()
> 
> 
> 
> 
> 
> 
> 
> 
> 
> ```
>&nbsp;

<br>

> ## Resultat **esperat** de la prova per la funció **```llegirCadenaDeLletresTeclat```**```()```:
> ```
> ======================================================================
> -------------------- llegirCadenaDeLletresTeclat() -------------------
> Entra una cadena de caràcters    : Aquesta és una cadena de lletres! ;)
> Has entrat la cadena de caràcters: Aquesta ?s una cadena de lletres! ;)
> -------------------- llegirCadenaDeLletresTeclat() -------------------
> ======================================================================
> ----------------- Pitja una tecla per tornar al menú! ----------------
> ```
>&nbsp;
<br>

> # ***Avaluació***: Bla, bla, bla...
> ## Bla, bla, bla... 
> ## Bla, bla, bla... 
> # **Nota**: **<#PERC_llegirCadenaDeLletresTeclat#> %** de 0.50 punts = **<#NOTA_llegirCadenaDeLletresTeclat#> punt/s**

<br>
<hr>
<br>
<br>


# **Pregunta 7** (**```5a```** de pràctica)

> ### Torna a [Avaluació part pràctica](#avaluaci%C3%B3-part-pr%C3%A0ctica)

# Avaluació de la funció **```esEnter()```**.

## Codi executat per provar la funció ```esEnter()```.
> ### Aquesta és la funció que s'executarà en el programa principal de l'alumne per comprovar l'exercici.
> ### Només caldrà substituir la cadena **```Profe20220121```**, per la cadena amb el codi de l'alumne.
> ###     substituir la cadena **```Profe20220121```** per **```<InicialsAlumne>20220121```**. 
<br>

``` java
    public static void codiEsEnter() {
        // Provant la funció esEnter()
        String cadMostraFuncio = AppCorreccio.missProvaFuncio("esEnter()");
        teclat = new Scanner(System.in);
        char caracterLlegit;
        int enterLlegit = 0;
        AppCorreccio.netejaConsola();
        AppCorreccio.pintaBarra();
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        boolean esUnDigit = false;
        do {
            try {
                esUnDigit = false;
                AppCorreccio.mostrarCadena("Entra un enter (del 0 al 9): ");
                enterLlegit = teclat.nextInt(); //  .nextLine().charAt(0);
                if (enterLlegit <= 9 && enterLlegit >= 0) {
                    esUnDigit = true;
                } else {
                    AppCorreccio.mostrarError("Cal que sigui entre 0 i 9!");
                }
            } catch (Exception e) {
                AppCorreccio.mostrarError("Només pots entrar nombres!");
            } finally {
                teclat = new Scanner(System.in);
            }
        } while (esUnDigit == false);
        caracterLlegit = String.valueOf(enterLlegit).charAt(0);
        if (Profe20220121.esEnter(caracterLlegit)) {
            AppCorreccio.mostrarMissatgeMaco("El caràcter " + caracterLlegit + " entrat és un enter!");
        } else {
            AppCorreccio.mostrarMissatgeMaco("El caràcter " + caracterLlegit + " entrat NO és un enter!");
        }
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.pintaBarra();
    }
```

> ## Resultat de la prova per la funció **```esEnter```**```()```:
> ```
> Prova funció esEnter()
> 
> 
> 
> 
> 
> 
> 
> 
> 
> ```
>&nbsp;

<br>

> ## Resultat **esperat** de la prova per la funció **```esEnter```**```()```:
> ```
> ======================================================================
> ------------------------------ esEnter() -----------------------------
> Entra un enter (del 0 al 9): f
>         ----------  ERROR!!!  ----------
>         Només pots entrar nombres!
>         Torna a intentar-ho!
>         --------------------------------
> Entra un enter (del 0 al 9): 15
>         ----------  ERROR!!!  ----------
>         Cal que sigui entre 0 i 9!
>         Torna a intentar-ho!
>         --------------------------------
> Entra un enter (del 0 al 9): 5
>         El caràcter 5 entrat és un enter!
> ------------------------------ esEnter() -----------------------------
> ======================================================================
> ----------------- Pitja una tecla per tornar al menú! ----------------
> ```
>&nbsp;
<br>

> # ***Avaluació***: Bla, bla, bla...
> ## Bla, bla, bla... 
> ## Bla, bla, bla... 
> # **Nota**: **<#PERC_esEnter#> %** de 0.50 punts = **<#NOTA_esEnter#> punt/s**

<br>
<hr>
<br>
<br>


# **Pregunta 8** (**```6a```** de pràctica)

> ### Torna a [Avaluació part pràctica](#avaluaci%C3%B3-part-pr%C3%A0ctica)

# Avaluació de la funció **```esLletra()```**.

## Codi executat per provar la funció ```esLletra()```.
> ### Aquesta és la funció que s'executarà en el programa principal de l'alumne per comprovar l'exercici.
> ### Només caldrà substituir la cadena **```Profe20220121```**, per la cadena amb el codi de l'alumne.
> ###     substituir la cadena **```Profe20220121```** per **```<InicialsAlumne>20220121```**. 
<br>

``` java
     public static void codiEsLletra() {
        // Provant la funció esLletra()
        AppCorreccio.netejaConsola();
        AppCorreccio.pintaBarra();
        String cadMostraFuncio = AppCorreccio.missProvaFuncio("esLletra()");
        teclat = new Scanner(System.in);
        char caracterLlegit;
        boolean esLletra = false;
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.mostrarCadena("Entra un caràcter: ");
        do {
            esLletra = false;
            caracterLlegit = AppCorreccio.llegirLletraTeclat();
            if (Profe20220121.esLletra(caracterLlegit)) {
                esLletra = true;
            }
        } while (esLletra == false);
        AppCorreccio.mostrarMissatgeMaco("Has entrat el caràcter: " + caracterLlegit + "\n");
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.pintaBarra();
    }
```

> ## Resultat de la prova per la funció **```esLletra```**```()```:
> ```
> Prova funció esLletra()
> 
> 
> 
> 
> 
> 
> 
> 
> 
> ```
>&nbsp;

<br>

> ## Resultat **esperat** de la prova per la funció **```esLletra```**```()```:
> ```
> ======================================================================
> ------------------------------ esLletra() -----------------------------
> Entra un caràcter: 3
>         ----------  ERROR!!!  ----------
>         Només pots entrar lletres!
>         Torna a intentar-ho!
>         --------------------------------
> r
>         Has entrat el caràcter: r
> 
> ------------------------------ esLletra() -----------------------------
> ======================================================================
> ----------------- Pitja una tecla per tornar al menú! ----------------
> ```
>&nbsp;
<br>

> # ***Avaluació***: Bla, bla, bla...
> ## Bla, bla, bla... 
> ## Bla, bla, bla... 
> # **Nota**: **<#PERC_esLletra#> %** de 0.50 punts = **<#NOTA_esLletra#> punt/s**

<br>
<hr>
<br>
<br>


# **Pregunta 9** (**```7a```** de pràctica)

> ### Torna a [Avaluació part pràctica](#avaluaci%C3%B3-part-pr%C3%A0ctica)

# Avaluació de la funció **```mostrarMissatgeSegonsSaltLinea()```**.

## Codi executat per provar la funció ```mostrarMissatgeSegonsSaltLinea()```.
> ### Aquesta és la funció que s'executarà en el programa principal de l'alumne per comprovar l'exercici.
> ### Només caldrà substituir la cadena **```Profe20220121```**, per la cadena amb el codi de l'alumne.
> ###     substituir la cadena **```Profe20220121```** per **```<InicialsAlumne>20220121```**. 
<br>

``` java
    static void codiMostrarMissatgeSegonsSaltLinea() {
        String cadMostraFuncio = AppCorreccio.missProvaFuncio("mostrarMissatgeSegonsSaltLinea()");
        teclat = new Scanner(System.in);
        String cadAMostrar = "";
        AppCorreccio.netejaConsola();
        AppCorreccio.pintaBarra();
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        System.out.print("Entra una cadena per fer la comprovació: ");
        cadAMostrar = AppCorreccio.llegirCadenaDeCaracters();
        AppCorreccio.pausa("Pitja una tecla per veure la candena entrada AMB un salt de linia.");
        System.out.println();
        Profe20220121.mostrarMissatgeSegonsSaltLinea(cadAMostrar, true);
        System.out.print("Aquesta línia apareix després la cadena!\n");
        AppCorreccio.pausa("Pitja una tecla per veure la candena entrada SENSE un salt de linia.");
        System.out.println();
        Profe20220121.mostrarMissatgeSegonsSaltLinea(cadAMostrar, false);
        System.out.print("Aquesta línia apareix després la cadena!\n");
        AppCorreccio.mostrarCadena(cadMostraFuncio);
        AppCorreccio.pintaBarra();
    }
```

> ## Resultat de la prova per la funció **```mostraMissatgeSegonsSaltLinea```**```()```:
> ```
> Prova funció mostrarMissatgeSegonsSaltLinea()
> 
> 
> 
> 
> 
> 
> 
> 
> 
> ```
>&nbsp;

<br>

> ## Resultat **esperat** de la prova per la funció **```mostraMissatgeSegonsSaltLinea```**```()```:
> ```
> ======================================================================
> ------------------- mostrarMissatgeSegonsSaltLinea() ------------------
> Entra una cadena per fer la comprovació: Aquesta és una cadena de lletres! ;)
> Pitja una tecla per veure la candena entrada AMB un salt de linia.
> Aquesta ?s una cadena de lletres! ;)
> Aquesta línia apareix després la cadena!
> Pitja una tecla per veure la candena entrada SENSE un salt de linia.
> Aquesta ?s una cadena de lletres! ;)Aquesta línia apareix després la cadena!
> ------------------- mostrarMissatgeSegonsSaltLinea() ------------------
> ======================================================================
> ----------------- Pitja una tecla per tornar al menú! ---------------- 
> ```
>&nbsp;
<br>

> # ***Avaluació***: Bla, bla, bla...
> ## Bla, bla, bla... 
> ## Bla, bla, bla... 
> # **Nota**: **<#PERC_mostraMissSalt#> %** de 0.50 punts = **<#NOTA_mostraMissSalt#> punt/s**
<br>
<hr>
<br>
<br>


# **Pregunta 10** (**```8a```** de pràctica)

> ### Torna a [Avaluació part pràctica](#avaluaci%C3%B3-part-pr%C3%A0ctica)

# Avaluació de la funció **```trobaNombre()```**.

## Codi executat per provar la funció ```trobaNombre()```.
> ### Aquesta és la funció que s'executarà en el programa principal de l'alumne per comprovar l'exercici.
> ### Només caldrà substituir la cadena **```Profe20220121```**, per la cadena amb el codi de l'alumne.
> ###     substituir la cadena **```Profe20220121```** per **```<InicialsAlumne>20220121```**. 
<br>

``` java
    static void codiTrobaNombre() {
        // Provant la funció trobaNombre(int nombre, int[] array)
        final int MAX = 100;
        boolean acaba = false;
        String cadMostraFuncio = AppCorreccio.missProvaFuncio("trobaNombre()");
        int[] arrayNombres = new int[MAX];
        int nombreLlegit, posicioNombreTrobat, comptador = 0;
        AppCorreccio.netejaConsola();
        AppCorreccio.pintaBarra();
        System.out.print(cadMostraFuncio);
        do {
            System.out.print("Entra un nombre (-1 per acabar!): ");
            nombreLlegit = AppCorreccio.llegirNombreTeclat();
            if ((nombreLlegit == -1) || comptador == MAX) {
                acaba = true;
            }
            arrayNombres[comptador] = nombreLlegit;
            comptador++;
        } while (!(acaba));
        System.out.print("Ara entra el nombre a buscar: ");
        nombreLlegit = teclat.nextInt();
        posicioNombreTrobat = Profe20220121.trobaNombre(nombreLlegit, arrayNombres);
        if (posicioNombreTrobat != -1) {
            System.out.print("El nombre " + nombreLlegit + " s'ha trobat a la posició "
                    + posicioNombreTrobat + " entre tots els nombres que has introduit!");
        } else {
            System.out.print(
                    "El nombre " + nombreLlegit + " NO s'ha trobat entre tots els nombres que has introduit!");
        }
        System.out.println();
        System.out.print(cadMostraFuncio);
    }
```

> ## Resultat de la prova per la funció **```trobaNombre```**```()```:
> ```
> Prova funció trobaNombre()
> 
> 
> 
> 
> 
> 
> 
> 
> 
> ```
>&nbsp;

<br>

> ## Resultat **esperat** de la prova per la funció **```trobaNombre```**```()```:
> ```
> ======================================================================
> ---------------------------- trobaNombre() ---------------------------
> Entra un nombre (-1 per acabar!): 23
> Entra un nombre (-1 per acabar!): 54
> Entra un nombre (-1 per acabar!): 2
> Entra un nombre (-1 per acabar!): -34
> Entra un nombre (-1 per acabar!): 4
> Entra un nombre (-1 per acabar!): 6
> Entra un nombre (-1 per acabar!): 63
> Entra un nombre (-1 per acabar!): -1
> Ara entra el nombre a buscar: 6
> El nombre 6 s'ha trobat a la posició 5 entre tots els nombres que has introduit!
> ---------------------------- trobaNombre() ---------------------------
> ----------------- Pitja una tecla per tornar al menú! ----------------
> ```
>&nbsp;
<br>

> # ***Avaluació***: Bla, bla, bla...
> ## Bla, bla, bla... 
> ## Bla, bla, bla... 
> # **Nota**: **<#PERC_trobaNombre#> %** de 2.00 punts = **<#NOTA_trobaNombre#> punt/s**



# **Programa Principal**

> ### Torna a [Avaluació part pràctica](#avaluaci%C3%B3-part-pr%C3%A0ctica)
<br>

# Avaluació de la funció **```mostrarMissatgeSegonsSaltLinea()```**.

## Desenvolupa el codi necessari per poder fer servir com a mínim 4 de totes les funcions que has creat durant l'activitat. I aquest codi serà el que estigui dins de la funció main.


> ## Codi del programa principal
> ```
> 
> 
> 
> 
> ```
>&nbsp;

> ## Resultat de l'execució del programa principal
> ```
> 
> 
> 
> 
> ```
>&nbsp;

<br>

> # ***Avaluació***: Bla, bla, bla...
> ## Bla, bla, bla... 
> ## Bla, bla, bla... 
> # **Nota**: **<#PERC_progamaPpal#> %** de 1.00 punts = **<#NOTA_progamaPpal#> punt/s**

<br>
<hr>
<br>
<br>
