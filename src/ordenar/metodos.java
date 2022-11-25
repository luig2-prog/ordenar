package ordenar;

import libreriaOrden.metodosOrdenamientos;

public class metodos {

    static int pos = 0, tam;
    static metodosOrdenamientos me = new metodosOrdenamientos();

    public metodos() {

    }

    public static void crear() {
        tam = Integer.parseInt(ventana.txtTamaño.getText());
        me.setNumElementos(tam);

        me.crearVector();

        ventana.jPanel2.setVisible(true);

    }

    public static String mostrar() {
        String datosVector = "";

        for (int i = 0; i < me.getNumElementos(); i++) {
            datosVector = datosVector + String.valueOf("\nPosicion " + i + ": " + me.getVectorDatos(i) + "\n");
        }

        return datosVector;
    }

    public static void llenar() {

        ventana.jLabel2.setText("Llenar en posicion " + (pos + 1) + ":");

        int dato = Integer.parseInt(ventana.txtLlenar.getText());

        if (pos < me.getNumElementos() - 1) {
            me.setVectorDatos(pos, dato);
            pos++;
            ventana.txtLlenar.setText("");
        } else {
            ventana.txtArea.setVisible(true);
            ventana.jPanel3.setVisible(true);

            ventana.txtArea.setText(mostrar());
        }

    }

    public static void burbuja() {
        ventana2 ven = new ventana2();

        ven.setVisible(true);
        String antes = "\n ------------------------------------------- Antes ------------------------------------"
                + "\n" + mostrar() + "\n -----------------------------------------------------------------------------------------\n";
        me.ordenarBurbuja();

        ventana2.jTextArea1.setText(antes + "\n -------------------------------"
                + "-------- Despues -----------------------------------\n" + mostrar() + ""
                + "\nTiempo de ejecucion: " + System.currentTimeMillis());
    }

    public static void intercambio() {
        ventana2 ven = new ventana2();

        ven.setVisible(true);
        String antes = "\n ------------------------------------------- Antes ------------------------------------"
                + "\n" + mostrar() + "\n -----------------------------------------------------------------------------------------\n";
        me.ordenarIntercambio();
        ventana2.jTextArea1.setText(antes + "\n -------------------------------"
                + "-------- Despues -----------------------------------\n" + mostrar() + ""
                + "\nTiempo de ejecucion: " + System.currentTimeMillis());
    }

    public static void seleccion() {
        ventana2 ven = new ventana2();

        ven.setVisible(true);

        String antes = "\n ------------------------------------------- Antes ------------------------------------"
                + "\n" + mostrar() + "\n -----------------------------------------------------------------------------------------\n";
        me.ordenarSeleccion();

        ventana2.jTextArea1.setText(antes + "\n -------------------------------"
                + "-------- Despues -----------------------------------\n" + mostrar() + ""
                + "\nTiempo de ejecucion: " + System.currentTimeMillis());
    }

    public static void shell() {
        ventana2 ven = new ventana2();

        ven.setVisible(true);
        String antes = "\n ------------------------------------------- Antes ------------------------------------"
                + "\n" + mostrar() + "\n -----------------------------------------------------------------------------------------\n";
        me.ordenarShell();

        ventana2.jTextArea1.setText(antes + "\n -------------------------------"
                + "-------- Despues -----------------------------------\n" + mostrar() + ""
                + "\nTiempo de ejecucion: " + System.currentTimeMillis());
    }

}
