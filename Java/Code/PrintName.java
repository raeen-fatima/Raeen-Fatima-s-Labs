//How to Use User-Define Packages
package Code;

import DemoPackage.MyClassDemo;
public class PrintName {
    public static void main(String[] args){
        String name = "Welcome to Java";
        DemoPackage.MyClassDemo obj = new MyClassDemo();
        obj.getNames(name);

    }
}
