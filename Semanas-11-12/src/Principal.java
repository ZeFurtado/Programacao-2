public class Principal {
    public static void main(String[] args) {
        //Exercicio 1
        /*
        StaticStack<Integer> p1 = new StaticStack<Integer>(5);
        StaticStack<Integer> p2 = new StaticStack<Integer>(5);
        StaticStack<Integer> p3 = new StaticStack<Integer>(5);

        p1.push(1);
        p1.push(2);
        p1.push(3);
        p1.push(4);

        try{
            int temp = p1.pop();
            p2.push(temp);
            p3.push(p1.pop());
            p2.push(p1.pop());
            temp = p1.pop();
            p3.push(temp);
            p1.push(p2.pop());
            p3.push(p2.pop());
            p3.push(p1.pop());
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.print("\n"+p1.toString());
        System.out.print("\n"+p2.toString());
        System.out.print("\n"+p3.toString());
         */

        //Exercicio 2
        /*
        MinhaPilha<Integer> p1 = new MinhaPilha<Integer>(5);
        MinhaPilha<Integer> p2 = new MinhaPilha<Integer>(5);
        MinhaPilha<Integer> p3 = new MinhaPilha<Integer>(5);
        try {
            p1.push(10);
            p1.push(20);
            p1.push(30);
            p1.push(40);
        } catch (Exception e) {
            System.out.println(e);
        }

        try{
            p2.push(p1.pop());
            p2.push(p1.pop());
            p3.push(p1.pop());
            p3.push(p1.pop());
            p1.push(p2.pop());
            p3.push(p2.pop());
            p3.push(p1.pop());

        }catch(Exception e) {
            System.out.println(e);
        }

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
         */
    }
}
