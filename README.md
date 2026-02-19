# 🎱 Juego de Bingo en Java

Este es un proyecto sencillo que simula una partida de Bingo automática en la consola. El objetivo es practicar conceptos de Programación Orientada a Objetos (POO) y estructuras de datos en Java.

## 📋 Descripción
El programa crea un bombo con 90 bolas, genera jugadores con cartones aleatorios y va sacando números hasta que uno de los jugadores completa su cartón y canta "Bingo".

## 🚀 Cómo ejecutarlo
1. Clona el repositorio o descarga el código.
2. Abre la carpeta en **Visual Studio Code**.
3. Abre el archivo principal: `src/App.java`.
4. Haz clic en el botón de **Play (Run)** arriba a la derecha.
5. Verás la simulación partida en la terminal.

## 🛠️ Tecnologías utilizadas
* **Java**
* **ArrayList**: Para gestionar las bolas del bombo y la lista de jugadores.
* **HashMap**: Para gestionar los números del cartón de forma eficiente (búsqueda rápida).
* **POO**: Código estructurado en clases (Bombo, Jugador, Cartón).

## 📂 Estructura de archivos
* `App.java`: El programa principal (Main). Controla el bucle del juego y anuncia el ganador.
* `Bombo.java`: Contiene las 90 bolas barajadas y se encarga de sacarlas sin repetir.
* `Jugador.java`: Tiene un nombre y sus cartones. Comprueba los números que salen.
* `Carton.java`: Genera números aleatorios y verifica si se ha hecho Bingo.

---
*Creado por Luis y Noelia.*