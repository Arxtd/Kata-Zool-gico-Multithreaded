package br.com.arthurmorais.utils;

public class AnsiColors {
    // Cores do texto
    public static final String RESET = "\033[0m";
    public static final String BLACK = "\033[30m";
    public static final String RED = "\033[31m";
    public static final String GREEN = "\033[32m";
    public static final String YELLOW = "\033[33m";
    public static final String BLUE = "\033[34m";
    public static final String PURPLE = "\033[35m";
    public static final String CYAN = "\033[36m";
    public static final String WHITE = "\033[37m";

    /**
     * Método para formatar texto com cor
     * @param text O texto a ser colorido
     * @param color A cor desejada
     * @return Texto formatado com ANSI color
     */
    public static String colorize(String text, String color) {
        return color + text + RESET;
    }
}

