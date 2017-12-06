public class Teste01 {

    public static void main(String[] args) {
        Integer resultadoC = gerarC("123", "4321");
        System.out.println(resultadoC);
    }

    private static Integer gerarC(String numeroA, String numeroB) {
        int tamanhoString = numeroA.length() > numeroB.length() ? numeroA.length() : numeroB.length();
        String c = "";

        for (int i = 0; i <= tamanhoString; i++) {
            if(numeroA.length() >= (i + 1)) {
                c += numeroA.charAt(i);
            }

            if(numeroB.length() >= (i + 1)) {
                c += numeroB.charAt(i);
            }
        }
        Integer cInteger = Integer.parseInt(c);
        return cInteger > 1000000 ? -2 : cInteger ;
    }
}

