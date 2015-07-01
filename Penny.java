/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penny;

import javaw.swing.JOptionPane;
public class Penny {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Armario p1 = Armario new Armario ();

        p1.setLetra("A");

        Sapatos s1 = new Sapatos ();
        s1.setModelo("ConfortPlus");
        Sapatos s2 = new Sapatos ();
        s2.setModelo("D&G");

        p1.getSapatos().add(s1);
        p1.getSapatos().add(s2);

        System.out.println(p1.mostrarTudo());

        System.out.println("MENU\nVoce deseja visualizar a opcao\n1."
                           +"Todos os sapatos\n2.Somente os da "
                           +"prateleira A\n3.Somente os da "
                           + "prateleira B\n4.Adicionar sapato na "
                           + "prateleira A\n5.Adicionar sapato na "
                           + "prateleira B\n");
       Integer opcao = JOptionPane.showInputDialog("Digite sua opcao:");
            switch (opcao)

        case 1 :
            {
                System.out.println(p1.mostrarTudo());
                break;
            }

        case 2 :
            {
                System.out.println(p1.mostrarPrateleiraA());
            break;

            }

        case 3 :

            {
                System.out.println(p1.mostrarPrateleiraB());
            }



    }

}
