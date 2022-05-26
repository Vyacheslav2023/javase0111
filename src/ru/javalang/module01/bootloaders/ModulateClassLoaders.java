package ru.javalang.module01.bootloaders;

import static java.util.Objects.isNull;

/**
 * https://github.com/mtumilowicz/java9-classloaders
 */

public class ModulateClassLoaders {
    public static void main(String[] args) {
        ModuleLayer layer = ModuleLayer.boot();
        layer.modules().forEach(module -> {
            ClassLoader classLoader = module.getClassLoader();
            String classLoaderName = isNull(classLoader) ? "bootstrap" : classLoader.getName();
            System.out.println(classLoaderName + ": " + module.getName());
        });

    }
}
