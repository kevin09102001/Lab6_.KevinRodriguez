/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_.kevinrodriguez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class administrarautos {

    private ArrayList<autos> listaautos = new ArrayList();
    private File archivo = null;

    public administrarautos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<autos> getListaautos() {
        return listaautos;
    }

    public void setListaautos(ArrayList<autos> listaautos) {
        this.listaautos = listaautos;
    }

    public void setPersona(autos p) {
        this.listaautos.add(p);
    }

    @Override
    public String toString() {
        return "listaautos=" + listaautos;
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (autos t : listaautos) {
                bw.write(t.getMarca() + ";");
                bw.write(t.getModelo() + ";");
                bw.write(t.getTipo() + ";");
                bw.write(t.getColor() + ";");
                bw.write(t.getVin() + ";");
                bw.write(t.getCanp() + ";");
                bw.write(t.getCapasima() + ";");
                bw.write(t.getPrecio() + ";");
                bw.write(t.getPotencia() + ";");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaautos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaautos.add(new autos(sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.nextInt(),
                            sc.nextInt(),
                            sc.nextInt(),
                            sc.nextInt(),
                            sc.nextInt()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
