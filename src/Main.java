import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option=0;
        do {
            System.out.println("---------------------");
            System.out.println("Aplication de mensajes");
            System.out.println("1.crear mensaje");
            System.out.println("2.listar mensaje");
            System.out.println("3.eliminar mensaje");
            System.out.println("4.editar mensaje");
            System.out.println("5.salir");
            option = sc.nextInt();

            switch (option){
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensajes();
                    break;
                case 3:
                    MensajesService.borrarMensaje();
                    break;
                case 4:
                    MensajesService.editarMensaje();
                    break;
                default:
                    break;
            }

        }while (option != 5);


    }
}