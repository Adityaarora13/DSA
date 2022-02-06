package Array;

class Main {
    public static void main(String[] args) {
        gadget g1 = new gadget();
        gadget g2 = new gadget();
        System.out.println(gadget.gadgetType + " " + gadget.mf);
    }
}
class gadget{
    static String gadgetType;
    static int mf=2004;
    static{
        gadget.gadgetType="mobile";
        gadget.mf=2004;
    }
    gadget()
    {
        gadget.gadgetType="mobile";
        gadget.mf++;

    }
    static{
        gadget.gadgetType="mobile Phone";
        gadget.mf--;
    }
}
