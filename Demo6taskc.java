public class Demo6taskc {
    public static void main(String[] args) {
        String cityName1 = "Los Angeles";
        String stateName1 = "California";
        double populationState1 = 3966936;

        String cityName2 = "\u001B[35mNew\u001B[0m" +" York";
        String stateName2 = "\u001B[35mNew\u001B[0m" +" York";
        double populationState2 = 8336817;

        String columnOne = "CITY";
        String columnTwo = "STATE";
        String columnThree = "POPULATION";

    
        final String LINE = "\u001B[33m+"+"-".repeat(20)+"+"+"-".repeat(15)+"+"+"-".repeat(10)+"+\u001B[0m \n";
        final String RECORD1 = "\u001B[33m|\u001B[0m%-20s\u001B[33m|\u001B[0m%-15s\u001B[33m|\u001B[0m\u001B[32m%,10.0f\u001B[33m|\u001B[0m \n";
        final String RECORD2 = "\u001B[33m|\u001B[0m%-29s\u001B[33m|\u001B[0m%-24s\u001B[33m|\u001B[0m\u001B[32m%,10.0f\u001B[33m|\u001B[0m \n";
        final String COLUMN = "\u001B[33m|\u001B[0m\u001B[39;1m%-20s\u001B[33m|\u001B[0m\u001B[39;1m%-15s\u001B[33m|\u001B[0m\u001B[39;1m%-10s\u001B[33m|\u001B[0m \n";

        System.out.printf(LINE, "","");
        System.out.printf(COLUMN,columnOne,columnTwo,columnThree);
        System.out.printf(LINE, "","");
        System.out.printf(RECORD1, cityName1,stateName1,populationState1);
        System.out.printf(RECORD2, cityName2,stateName2,populationState2);
        System.out.printf(LINE, "","");
      
    }
    
}
