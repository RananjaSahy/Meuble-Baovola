/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitaires;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author ONEF
 */
public class Util {
    public static void resetObject(Object o) throws Exception {
        Field[] attributs = o.getClass().getDeclaredFields();
        for (Field field : attributs) {
            field.setAccessible(true);
            if (field.getType() == int.class || field.getType() == double.class || field.getType() == float.class
                    || field.getType() == long.class || field.getType() == byte.class
                    || field.getType() == short.class || field.getType() == char.class) {
                field.set(o, 0);
            } else if (field.getType() == boolean.class) {
                field.set(o, false);
            } else {
                field.set(o, null);
            }
        }
    }

    public static Object castString(Object o, Class<?> classe) throws Exception {
        String texte = o.toString();
        switch (classe.getSimpleName()) {
            case "Date":
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                if (texte.indexOf('T') != -1) {
                    sdf = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm");
                }
                Date d = sdf.parse(texte);
                return d;

            case "int":
                return Integer.parseInt(texte);

            case "double":
                return Double.parseDouble(texte);

            case "boolean":
                return Boolean.parseBoolean(texte);

            case "float":
                return Float.parseFloat(texte);

            default:
                return texte;
        }
    }

    public static List<String> getAllPackages(List<String> packages, String path, String debut) {
        String concat = ".";
        if (packages == null)
            packages = new ArrayList<>();
        if (debut == null) {
            debut = "";
            concat = "";
        }
        File dossier = new File(path);
        File[] files = dossier.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                packages.add(debut + concat + file.getName());
                // System.out.println(debut + concat + file.getName());
                packages = getAllPackages(packages, file.getPath(), debut + concat + file.getName());
            }
        }
        return packages;
    }
    
    public static List<Class<?>> getTypesAnnotedWith(String nomPackage, Class<? extends Annotation> annotation,
            String path) {
        try {
            return listAllClasses(getAllClasses(nomPackage, path), annotation);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static List<Class<?>> getAllClasses(String nomPackage, String path) throws Exception {
        File directory = new File(packageToPath(nomPackage, path));
        // System.out.println(directory.getAbsolutePath());
        File[] classFile = directory.listFiles();
        List<Class<?>> classes = new ArrayList<>();
        for (int i = 0; i < classFile.length; i++) {
            if (classFile[i].getName().endsWith(".class"))
                classes.add(Class.forName(
                        nomPackage + "." + classFile[i].getName().substring(0, classFile[i].getName().length() - 6)));
        }
        return classes;
    }

    public static String packageToPath(String nom, String path) {
        String[] dossierPackage = new String[] { nom };
        if (nom.contains(".")) {
            dossierPackage = nom.split(".");
        }
        if (path == null) {
            path = ".";
        }
        for (int index = 0; index < dossierPackage.length; index++) {
            path = path.concat("/" + dossierPackage[index]);
        }
        return path;
    }

    public static List<Class<?>> listAllClasses(List<Class<?>> classes, Class annotation) {
        List<Class<?>> liste = new ArrayList<>();
        for (int i = 0; i < classes.size(); i++) {
            if (classes.get(i).getAnnotation(annotation) != null) {
                System.out.println("Class : " + classes.get(i).getName());
                liste.add(classes.get(i));
            }
        }
        return liste;
    }

    public static List<Method> listAllMethods(Class classe, Class annotation) {
        Method[] fonctions = classe.getDeclaredMethods();
        List<Method> liste = new ArrayList<>();
        for (Method fonction : fonctions) {
            if (fonction.getAnnotation(annotation) != null) {
                System.out.println("Fonction : " + fonction.getName());
                liste.add(fonction);
            }
        }
        return liste;
    }

    public static List<Field> listAllAttributes(Class classe, Class annotation) {
        Field[] fields = classe.getDeclaredFields();
        List<Field> liste = new ArrayList<>();
        for (int i = 0; i < fields.length; i++) {
            if (fields[i].getAnnotation(annotation) != null) {
                System.out.println("Attribut : " + fields[i].getName());
                liste.add(fields[i]);
            }
        }
        return liste;
    }
}
