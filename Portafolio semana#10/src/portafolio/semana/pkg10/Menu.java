/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portafolio.semana.pkg10;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
class Menu {
    Rutina r = new Rutina();
        int opc = 0;

            while(opc != 4){
            opc = Byte.parseByte(JOptionPane.showInputDialog(null,
                    "***MENÚ PRINCIPAL***\n\n"
                            + "1. Agregar producto\n"
                            + "2. Completar inventario\n"
                            + "3. Mostrar productos\n"
                            + "4. Salir\n\n"
                            + "Digite su opción:"));

            switch(opc) {
                case 1 ->  {
                    r.agregar();
                }
                case 2 ->  {
                    r.completar();
                }
                case 3 ->  {
                    r.mostrar();
                }
                case 4 ->  {
                    System.exit(0);
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "¡Opción incorrecta!");
                }
            }
        }
    }
}

    void mostrarMenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class opc {

        public opc() {
        }
    }
   }

  
