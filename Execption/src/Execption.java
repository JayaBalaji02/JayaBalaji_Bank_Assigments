public class Execption {

    public static void main(String[] args) {

        String ans[]=new String[5];

        try {
            String a[]= {"jaya","balaji","charlie","donlee,","erfan","fayaz"};
            for(int i=0;i<a.length;i++) {
                ans[i]=a[i];
            }
        }
        catch(Exception e) {
            System.out.println();
            e.printStackTrace();
        }
        finally {
            System.out.println("always execute");
        }

    }
}
