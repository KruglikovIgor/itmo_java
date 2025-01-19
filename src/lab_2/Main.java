package lab_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Лаб. 2-1:");
        int ia=14;
        int ib=5;
        Calculator calc1=new Calculator();
        System.out.println(ia+"+"+ib+"="+calc1.add(ia,ib));
        System.out.println(ia+"-"+ib+"="+calc1.sub(ia,ib));
        System.out.println(ia+"*"+ib+"="+calc1.mult(ia,ib));
        System.out.println(ia+"/"+ib+"="+calc1.div(ia,ib)+"\n");


        System.out.println(3123456789L+"+"+1234567892+"="+calc1.add(3123456789L,1234567892));
        System.out.println(3123456789L+"-"+1234567892+"="+calc1.sub(3123456789L,1234567892));
        System.out.println(3123456789L+"*"+1234567892+"="+calc1.mult(3123456789L,1234567892));
        System.out.println(3123456789L+"/"+1234567892+"="+calc1.div(3123456789L,1234567892)+"\n");

        System.out.println(4.853+"+"+3.68954+"="+calc1.add(4.853,3.68954));
        System.out.println(4.853+"-"+3.68954+"="+calc1.sub(4.853,3.68954));
        System.out.println(4.853+"*"+3.68954+"="+calc1.mult(4.853,3.68954));
        System.out.println(4.853+"/"+3.68954+"="+calc1.div(4.853,3.68954)+"\n");

        System.out.println("\n"+"Лаб. 2-2: \n");
        Bike bike1 = new Bike("Yamaha","YZF-R1",998.0,206.1);
        Bike bike2 = new Bike("Kawasaki","H2R",998.0,216.1);
        Bike bike3 = new Bike();
    }
}
