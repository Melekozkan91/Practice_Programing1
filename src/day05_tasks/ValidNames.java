package day05_tasks;

public class ValidNames {
    public static void main(String[] args) {
        boolean DAYOFWEEK =true;
        System.out.println(DAYOFWEEK);
        //We cannot.Name should follow camelCase ----boolean 3DGRAPH =TRUE;
        boolean JUNE1997 = true;
        System.out.println(JUNE1997);
        //ILLLEGAL CHARACTER, WE CAN USE ONLY $ AND_ ---> BOOLEAN MIXTURE#3 = true;
        // we cannot have space --> boolean WEEK DAY = true;



        boolean A$B= true;
        System.out.println(A$B);

        boolean _HELLOWORLD = true;
        System.out.println(_HELLOWORLD); // can start only $ _

        boolean TRUE =true;
        System.out.println(TRUE);// this true is ok because its CAPITAL true

        boolean PUBLIC= true;
        System.out.println(PUBLIC);
        // name cannot start with numbers --->boolean 1980_S = true;

    }
}
