package ru.javalang.module01.bootloaders;

public class BuildInClassLoaders {
    public static void main(String[] args) {

        BuildInClassLoaders buildInClassLoaders = new BuildInClassLoaders();
        ClassLoader applicationClassLoader = buildInClassLoaders.getClass().getClassLoader();
        printClassLoadersDetails(applicationClassLoader);

        // java.sql classes are loaded by platform classloader
        java.sql.Date now = new java.sql.Date(System.currentTimeMillis());
        ClassLoader platformClassLoder = now.getClass().getClassLoader();
        printClassLoadersDetails(platformClassLoder);

        // java.lang classes are loaded by bootstrap classloader
        ClassLoader bootstrapClassLoader = args.getClass().getClassLoader();
        printClassLoadersDetails(bootstrapClassLoader);

    }

    private static void printClassLoadersDetails(ClassLoader classLoader){
        // bootstrap classloader is represented by null in JVM
        if (classLoader != null) {
            System.out.println("ClassLoader name : " + classLoader.getName());
            System.out.println("ClassLoader class : " + classLoader.getClass().getName());
        } else {
            System.out.println("Bootstrap classloader");
        }
    }
}
