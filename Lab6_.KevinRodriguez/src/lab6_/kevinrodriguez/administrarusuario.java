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
public class administrarusuario {
      private ArrayList<clientes> listausuarios = new ArrayList();
    private File archivo = null;

    public administrarusuario(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<clientes> getListaautos() {
        return listausuarios;
    }

    public void setListaautos(ArrayList<clientes> listaautos) {
        this.listausuarios = listaautos;
    }

    public void setPersona(clientes p) {
        this.listausuarios.add(p);
    }

    @Override
    public String toString() {
        return "listaautos=" + listausuarios;
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (clientes t : listausuarios) {
                bw.write(t.getId() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getApellido()+ ";");
                bw.write(t.getNacionalidad() + ";");
                bw.write(t.getLugartraba() + ";");
                bw.write(t.getPuesto() + ";");
                bw.write(t.getUsuario() + ";");
                bw.write(t.getContra() + ";");
                bw.write(t.getDineroactual() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listausuarios = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listausuarios.add(new clientes(sc.nextInt(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
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
