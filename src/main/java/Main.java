public class Main {
    public static void main(String[] args) {
        Cafeteria cafeteria1 = crearCafeteria("Cafeteria el mormón", "Los Ganaderos 03701", "@elmormon_cafe");
        Cafe cafe1 = crearCafe(50, 100, Cafe.Tamaño.Grande);
        Cafe cafe2 = crearCafe(45, 100, Cafe.Tamaño.Mediano);
        Cafe cafe3 = crearCafe(47, 100, Cafe.Tamaño.Pequeño);
        cafeteria1.agregarCafe(cafe1);
        cafeteria1.agregarCafe(cafe2);
        cafeteria1.agregarCafe(cafe3);
        cafeteria1.agregarCafe(cafe2);
        mostrarCafes(cafeteria1);
        cafeteria1.buscarcafe(Cafe.Tamaño.valueOf("Grande"));
        cafeteria1.eliminarCafe(1);
        mostrarCafes(cafeteria1);
    }

    public static void mostrarCafes(Cafeteria cafeteria1) {
        System.out.println(cafeteria1.getListaCafes());
    }

    public static Cafeteria crearCafeteria(String nombre, String direccion, String rs) {
        Cafeteria cafeteria = new Cafeteria(nombre, direccion, rs);
        return cafeteria;
    }

    public static Cafe crearCafe(int gramos, int ml, Cafe.Tamaño tamaño) {
        Cafe cafe1 = new Cafe(gramos, ml, tamaño);
        System.out.println("Cafe: " + cafe1 + " creado correctamente");
        return cafe1;
    }


}
