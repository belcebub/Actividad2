/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author beelze
 */
public class AdmonEmpleados {
    private Empleado empleados[];
    private int cont;

    public AdmonEmpleados() {
        empleados = new Empleado[50];
        cont = 0;
    }
    
    public int getCont(){
        return cont;
    }

    int busqueda(int clave) {
        for (int i = 0; i < cont; i++) {
            if (empleados[i].getClave() == clave) {
                return i;
            }
        }
         return -1;
    }

    void altas(Empleado e) {
        empleados[cont] = e;
        cont++;
    }

    Empleado getEmpleado(int celda) {
        return empleados[celda];
    }

    Empleado[] consultaGeneral() {
        Empleado empleadosT[] = new Empleado[cont];
        Empleado aux;
        //Copiar los empleados al arreglo temporal
        for (int i = 0; i < empleadosT.length; i++) {
            empleadosT[i] = empleados[i];
        }
        //Ordenar el arreglo temporal por la clave
        for (int a = 0; a < empleadosT.length - 1; a++) {
            for (int b = 0; b < empleadosT.length - 1 - a; b++) {
                if (empleadosT[b].getClave() > empleadosT[b+1].getClave()) {
                    aux = empleadosT[b];
                    empleadosT[b] = empleadosT[b + 1];
                    empleadosT[b + 1] = aux;
                }
            }
        }//fin del for a
        return empleadosT;
    }
}