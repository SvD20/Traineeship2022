package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {

    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
        try {
            URLClassLoader loader = new URLClassLoader(new URL[]{new URL("file:///out/example/")});
            Class<?> clazz = loader.loadClass("test.Main");
            System.out.println(clazz.getClassLoader());
            Main myClass = (Main) clazz.newInstance();
            myClass.main(args);
        } catch (MalformedURLException | InstantiationException | IllegalAccessException | ClassNotFoundException  e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }




        /*try{
            URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{new URL("file:///out/example.jar/")});
            Class clazz = urlClassLoader.loadClass("test.Main");
            Main instance = (Main) clazz.newInstance();
            instance.main(args);
        }
        catch (InstantiationException e){
            e.printStackTrace();
        } catch (IllegalAccessException e){
            e.printStackTrace();
        }*/
    }
}
