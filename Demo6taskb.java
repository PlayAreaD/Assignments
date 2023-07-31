public class Demo6taskb {
    public static void main(String[] args) {
        int age1 = 24;
        String name1 = "Alice";
        int age2 = 30;
        String name2 = "Bob";

        String columnOne = "NAME";
        String columnTwo = "AGE";
    
        final String LINE = "\u001B[33m+"+"-".repeat(10)+"+"+"-".repeat(6)+"+\u001B[0m \n";
        final String RECORD = "\u001B[33m|\u001B[0m%-10s\u001B[33m|\u001B[0m\u001B[31m%6s\u001B[33m|\u001B[0m \n";
        final String COLUMN = "\u001B[33m|\u001B[0m\u001B[36;1m%-10s\u001B[33m|\u001B[0m\u001B[36;1m%6s\u001B[33m|\u001B[0m \n";

        System.out.printf(LINE, "","");
        System.out.printf(COLUMN,columnOne,columnTwo);
        System.out.printf(LINE, "","");
        System.out.printf(RECORD, name1,age1);
        System.out.printf(RECORD, name2,age2);
        System.out.printf(LINE, "","","");
        
    }
    
}
