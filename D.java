public class D {
    public class Solution{
        public static void main(String[] args) {
            if (args.length != 1) {
                System.out.println("Por favor, ingrese un año como argumento.");
                return;
            }
            try {
                int year = Integer.parseInt(args[0]);
                int remainder = year % 12;
                String zodiacSign;
                switch (remainder) {
                    case 0:
                        solution = "Mono";
                        break;
                    case 1:
                        solution = "Gallo";
                        break;
                    case 2:
                        solution = "Perro";
                        break;
                    case 3:
                        solution = "Cerdo";
                        break;
                    case 4:
                        solution = "Rata";
                        break;
                    case 5:
                        solution = "Buey";
                        break;
                    case 6:
                        solution = "Tigre";
                        break;
                    case 7:
                        solution = "Conejo";
                        break;
                    case 8:
                        solution = "Dragón";
                        break;
                    case 9:
                        solution = "Serpiente";
                        break;
                    case 10:
                        solution = "Caballo";
                        break;
                    case 11:
                        solution = "Cabra";
                        break;
                    default:
                        solution = "Año no válido";
                        break;
                }

                System.out.println(year + " es el año del " + zodiacSign + ".");
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un año válido como argumento.");
            }
        }
    }
}
