package com.example.idea;

/**
 * This is a testing class
 */
public class Example {

    private String secrect;

    public Example(String secrect) {
        this.secrect =secrect;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Example test = new Example("Hello!!");
        test.printSecrect();
        String outSecrect = test.getSecrect();
        outSecrect = "Modified "+outSecrect;
        System.out.println("outSecrect="+outSecrect);
        test.printSecrect();

    }

    public String getSecrect() {
        return secrect;
    }

    public void printSecrect() {
        System.out.println("--> "+secrect);

    }

}

